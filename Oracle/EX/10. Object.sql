--1. 오라클 객체
--1-1. 데이터 사전
--study계정이 사용할 수 있는 데이터 사전 조회
SELECT *
    FROM DICT;
    
SELECT *
    FROM DICTIONARY
    WHERE TABLE_NAME LIKE 'V$%';
    
--study계정이 가지고 있는 객체의 정보를 확인
--소유권이 study인 테이블 목록 조회
SELECT TABLE_NAME
    FROM USER_TABLES;
    
--OWNER 컬럼이 없음.
--현재 접속한 사용자가 소유한 테이블의 정보만 담고 있어서
SELECT *
    FROM USER_TABLES;
    
--study계정이 권한을 가지고 사용할 수 있는 모든 객체 정보
--study계정에 DBA 권한이 있어서 SYS가 소유하고 있는 테이블도 사용할 수 있다.
SELECT OWNER, TABLE_NAME
    FROM ALL_TABLES;

--OWNER 컬럼이 존재
--다른 사용자가 소유하고 있는 테이블의 권한만 가지고 있을 수도 있기 때문에
SELECT *
    FROM ALL_TABLES;
    
--데이터베이스 시스템 관련 정보들
SELECT *
    FROM DBA_TABLES;

--현재 데이터베이스에 접속한 세션정보 확인
SELECT SID
     , OSUSER
     , SERIAL#
     , PROGRAM
    FROM V$SESSION;
    
--세션을 kill해서 접속 끊어버리는 쿼리(DB 락걸렸을 때)
ALTER SYSTEM KILL SESSION '128, 33497' IMMEDIATE;

--lock 걸린 객체를 확인
SELECT OBJECT_ID
     , SESSION_ID
     , ORACLE_USERNAME
     , OS_USER_NAME
    FROM V$LOCKED_OBJECT;

UPDATE PF_TEMP
    SET 
        PNAME = 'aaa';

--락 걸린 세션 조회
SELECT L.OBJECT_ID
     , S.SID
     , L.ORACLE_USERNAME
     , S.SERIAL#
     , S.OSUSER
     , S.PROGRAM
    FROM V$SESSION S
    JOIN V$LOCKED_OBJECT L
    ON S.SID = L.SESSION_ID;

ALTER SYSTEM KILL SESSION '128, 8501' IMMEDIATE;

--1-2. 인덱스
--인덱스 생성
--STUDENT 테이블에 SNAME을 인덱스로 생성(비 고유 인덱스)
CREATE INDEX STUDENT_SNAME_IDX
ON STUDENT(SNAME);

--여러개의 컬럼을 선택하여 복합 인덱스 생성
--PROFESSOR 테이블에 PNO, PNAME을 복합 인덱스로 생성
CREATE INDEX PROFESSOR_PNO_PNAME_IDX
ON PROFESSOR(PNO, PNAME);

--수식으로 인덱스 생성
--테이블에 여러개의 인덱스 생성 가능
--STUDENT 테이블에 평점을 4.5로 환산한 평점 인덱스로 지정
--수식으로 만든 인덱스는 컬럼명이 표시되지 않고 시스템에서 자동으로 생성한 수식의 이름을 사용한다.
CREATE INDEX STUDENT_CONVERT_AVR_IDX
ON STUDENT(AVR * 4.5 / 4.0);

--생성된 인덱스 확인
SELECT UIC.INDEX_NAME
     , UIC.COLUMN_NAME
     , UIC.COLUMN_POSITION
     , UI.UNIQUENESS
    FROM USER_INDEXES UI
    JOIN USER_IND_COLUMNS UIC
    ON UI.INDEX_NAME = UIC.INDEX_NAME
    AND UI.TABLE_NAME IN ('STUDENT', 'PROFESSOR')
    ORDER BY UI.TABLE_NAME, UIC.INDEX_NAME, UIC.COLUMN_POSITION;

--인덱스 삭제
DROP INDEX STUDENT_SNAME_IDX;
DROP INDEX STUDENT_CONVERT_AVR_IDX;
DROP INDEX PROFESSOR_PNO_PNAME_IDX;

--1-3. VIEW
--뷰의 생성
--과목별 학과별 기말고사의 평균을 저장하는 뷰 생성
CREATE OR REPLACE VIEW V_AVG_SCORE(
    CNO,
    CNAME,
    MAJOR,
    AVGRESULT --컬럼명을 커스터마이징해서 사용할 수 있기 때문에 원천 테이블의 컬럼명을 노출하지 않을 수 있다.
) AS (
    --위에서 지정한 컬럼의 순서와 개수가 일치해야 한다.
    SELECT CNO
         , C.CNAME
         , ST.MAJOR
         , ROUND(AVG(SC.RESULT), 2)
        FROM COURSE C
        NATURAL JOIN SCORE SC
        JOIN STUDENT ST
        ON SC.SNO = ST.SNO
        GROUP BY CNO, C.CNAME, ST.MAJOR
);

SELECT *
    FROM V_AVG_SCORE;

--원천 테이블의 데이터가 변경되면 뷰의 데이터도 자동으로 변경
UPDATE COURSE
    SET
        CNAME = '일반화학1'
    WHERE CNAME = '일반화학';

UPDATE STUDENT
    SET 
        MAJOR = '유공1'
    WHERE MAJOR = '유공';

SELECT *
    FROM V_AVG_SCORE
    ORDER BY CNO, MAJOR;

--단순 뷰 생성(DML의 사용이 가능)
--DML을 사용하면 원천 테이블의 데이터가 추가/삭제/수정되는데
--조회쿼리가 1학년만 가져오는 쿼리라서 원천테이블 추가된 2, 3, 4학년의
--데이터는 표출되지 않는다.
CREATE OR REPLACE VIEW ST_CH(
    SNO,
    SNAME,
    SYEAR,
    AVR
) AS (
    SELECT SNO
         , SNAME
         , SYEAR
         , AVR
        FROM STUDENT
        WHERE SYEAR = 1
);

SELECT *
    FROM ST_CH
    WHERE SNAME = '홍길동';
    
SELECT *
    FROM STUDENT
    WHERE SNAME = '홍길동';
    
--단순 뷰에서 DML의 사용
INSERT INTO ST_CH
VALUES(
    '9003',
    '홍길동',
    1,
    4.0
);

--CHECK OPTION 추가하면 제약조건이 생성되어
--조회해온 조건에 맞는 데이터만 추가할 수 있도록 변경
--1학년 데이터만 조회해오기 때문에
--1학년 데이터만 입력할 수 있도록 변경
CREATE OR REPLACE VIEW ST_CH(
    SNO,
    SNAME,
    SYEAR,
    AVR
) AS (
    SELECT SNO
         , SNAME
         , SYEAR
         , AVR
        FROM STUDENT
        WHERE SYEAR = 1
)
WITH CHECK OPTION CONSTRAINT VIEW_ST_CH_CK;

--인라인 뷰
SELECT E.ENO
     , E.ENAME
     , E.DNO
     , B.SAL
    FROM EMP E
    JOIN (
             --인라인 뷰
             SELECT DNO
                  , MIN(SAL) AS SAL
                FROM EMP
                GROUP BY DNO
         ) B
    ON E.SAL = B.SAL;
    
--뷰의 삭제
DROP VIEW ST_CH;
DROP VIEW V_AVG_SCORE;

--인라인 뷰와 ROWNUM을 이용해서 최상위 N데이터 조회
--급여 최상위 3명 데이터 조회
SELECT ROWNUM
     , A.ENO
     , A.ENAME
     , A.SAL
    FROM (
            SELECT ENO
                 , ENAME
                 , SAL
                FROM EMP
                ORDER BY SAL DESC
         ) A
    WHERE ROWNUM <= 3;
    
--학과별 기말고사 성적의 평균이 가장 높은 3개 학과 조회
SELECT B.*
    FROM (
            SELECT ROWNUM AS RN
                 , A.MAJOR
                 , A.RES
                FROM (
                        SELECT ST.MAJOR
                             , ROUND(AVG(SC.RESULT), 2) AS RES
                            FROM STUDENT ST
                            JOIN SCORE SC
                            ON ST.SNO = SC.SNO
                            GROUP BY ST.MAJOR
                            ORDER BY AVG(SC.RESULT) DESC
                     ) A
        ) B
    WHERE B.RN > 3;
    
SELECT A.*
    FROM (
            SELECT ROWNUM AS RN
                 , ST.*
                FROM STUDENT ST
          ) A
    WHERE A.RN > 5;

--잘못된 ROWNUM의 사용
--ROWNUM이 붙은다음 정렬이 일어남
SELECT ROWNUM
     , ENO
     , ENAME
     , SAL
    FROM EMP
    WHERE ROWNUM <= 3
    ORDER BY SAL DESC;
    
-- ====>
--ROWNUM은 위치에 따라서 결과가 바뀌기 때문에 
--위치를 잘 지정해야하고 최상위 SELECT 구문에서의 ROWNUM은
-- <, <= 비교만 가능하다.
SELECT B.*
    FROM (
            SELECT ROWNUM AS RN
                 , A.ENO
                 , A.ENAME
                 , A.SAL
                FROM (
                        SELECT ENO
                             , ENAME
                             , SAL
                            FROM EMP
                            ORDER BY SAL DESC
                      ) A
            ) B
    WHERE B.RN > 3;

--1-4. SEQUENCE
--시퀀스를 사용할 테이블 생성
CREATE TABLE EMP_COPY1(
    ENO NUMBER,
    ENAME VARCHAR2(20),
    JOB VARCHAR2(10),
    MGR NUMBER,
    HDATE DATE,
    SAL NUMBER,
    COMM NUMBER,
    DNO NUMBER
);

CREATE TABLE DEPT_COPY1(
    DNO NUMBER,
    DNAME VARCHAR2(10),
    LOC VARCHAR2(10),
    DIRECTOR NUMBER
);

--시퀀스 2개 생성
--옵션추가한 시퀀스 생성
CREATE SEQUENCE EMP_CO_ENO_SEQ1
    START WITH 1
    INCREMENT BY 2
    MAXVALUE 10
    NOMINVALUE
    CYCLE
    NOCACHE;
    
--옵션을 하나도 추가하지 않은 시퀀스를 생성
CREATE SEQUENCE DEPT_CO_DNO_SEQ1;

--옵션있는 시퀀스의 사용
--NEXTVAL : 시퀀스가 가리키는 값을 다음 값으로 옮긴다.
INSERT INTO EMP_COPY1
VALUES(EMP_CO_ENO_SEQ1.NEXTVAL, 'G', '개발', 0, SYSDATE, 3000, 100, 0);

--CURRVAL : 시퀀스가 현재 가리키고 있는 값을 가져온다.
INSERT INTO EMP_COPY1
VALUES(EMP_CO_ENO_SEQ1.CURRVAL, 'F', '개발', 0, SYSDATE, 3000, 100, 0);

SELECT *
    FROM EMP_COPY1;

DELETE FROM EMP_COPY1
    WHERE ENAME = 'F';

--옵션이 없는 시퀀스의 사용
INSERT INTO DEPT_COPY1
VALUES(DEPT_CO_DNO_SEQ1.NEXTVAL, '개발', '서울', 0);

SELECT *
    FROM DEPT_COPY1;

--생성된 시퀀스를 조회하는 쿼리
SELECT SEQUENCE_NAME
     , MAX_VALUE
     , MIN_VALUE
     , INCREMENT_BY
     , CACHE_SIZE
     , LAST_NUMBER
     , CYCLE_FLAG
    FROM USER_SEQUENCES;

--시퀀스의 현재 값을 조회
SELECT DEPT_CO_DNO_SEQ1.CURRVAL FROM DUAL;

--시퀀스의 다음 값을 조회
--NEXTVAL 호출 시 무조건 시퀀스가 다음값으로 세팅됨. 시퀀스가 가리키는 값이 다음값으로 넘어감
SELECT DEPT_CO_DNO_SEQ1.NEXTVAL FROM DUAL;

--시퀀스의 수정
ALTER SEQUENCE DEPT_CO_DNO_SEQ1
    INCREMENT BY 5
    MAXVALUE 100
    CYCLE;
    
--시퀀스의 삭제
DROP SEQUENCE DEPT_CO_DNO_SEQ1;

--1-5. SYNONYM(객체에 별칭주기)
--현재 접속한 사용자에서 계속 사용할 수 있는 테이블 별칭 주기
CREATE SYNONYM DC
    FOR DEPT_COPY1;
    
--SYNONYM의 사용
SELECT *
    FROM DC;

--모든 사용자가 계속 사용할 수 있는 테이블의 별칭 주기
CREATE PUBLIC SYNONYM EC
    FOR C##STUDY.EMP_COPY1;

SELECT *
    FROM EC;
    
-- SYNONYM 삭제
DROP SYNONYM DC;

--PUBLIC SYNONYM 삭제
--권한 별도 부여
DROP PUBLIC SYNONYM EC;