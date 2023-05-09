--1. DML
--1-1. INSERT INTO
--일부 컬럼만 데이터를 저장
INSERT INTO EMP(ENO, ENAME, JOB, HDATE, SAL)
VALUES ('3006', '홍길동', '개발', SYSDATE, 3000);
COMMIT;

--모든 컬럼의 데이터를 저장
INSERT INTO EMP
VALUES ('3007', '임꺽정', '설계', '2008', SYSDATE, 3000, 200, '30');
COMMIT;

--COMMIT, ROLLBACK
--COMMIT은 작업 완료
--ROLLBACK은 작업의 취소, COMMIT되기 전의 변경사항을 모두 취소
INSERT INTO EMP
VALUES ('3008', '장길산1', '분석', '2008', SYSDATE, 3000, 200, '20');
INSERT INTO EMP
VALUES ('3009', '장길산2', '분석', '2008', SYSDATE, 3000, 200, '20');
INSERT INTO EMP
VALUES ('3010', '장길산3', '분석', '2008', SYSDATE, 3000, 200, '20');
INSERT INTO EMP
VALUES ('3011', '장길산4', '분석', '2008', SYSDATE, 3000, 200, '20');
ROLLBACK;

--1-2. 다량의 데이터를 한번에 저장
CREATE TABLE EMP_COPY1(
    ENO VARCHAR2(4),
    ENAME VARCHAR2(20),
    JOB VARCHAR2(10),
    MGR VARCHAR2(4),
    HDATE DATE,
    SAL NUMBER(5),
    COMM NUMBER(5),
    DNO VARCHAR2(2)
);

--EMP테이블에서 DNO이 30인 데이터들만 가져와서 저장
INSERT INTO EMP_COPY1
SELECT *
    FROM EMP
    WHERE DNO = '30';
COMMIT;

SELECT * FROM EMP_COPY1;

--COURSE_PRFESS테이블
CREATE TABLE COURSE_PRFESS(
    CNO VARCHAR2(8),
    CNAME VARCHAR2(20),
    ST_NUM NUMBER(1, 0),
    PNO VARCHAR2(8),
    PNAME VARCHAR2(20)
);

--COURSE, PROFESSOR 조인해서 PNAME까지 저장
INSERT INTO COURSE_PRFESS
SELECT COURSE.CNO, CNAME, ST_NUM, COURSE.PNO
    , PNAME
    FROM COURSE
    LEFT JOIN PROFESSOR
    ON COURSE.PNO = PROFESSOR.PNO;
COMMIT;

SELECT * FROM COURSE_PRFESS;

DELETE FROM COURSE_PRFESS;
COMMIT;

--1-3. UPDATE SET
--전체 데이터 수정
UPDATE EMP_COPY1
    SET
        MGR = '0001';
ROLLBACK;

SELECT * FROM EMP_COPY1;

--사원번호가 3005번인 보너스 1800으로 수정
UPDATE EMP_COPY1
    SET
        COMM = 1800
    WHERE ENO = '3005';

--사원번호가 3005번인 보너스 1800으로 수정(연산 사용)
UPDATE EMP_COPY1
SET
    COMM = COMM * 3
WHERE ENO = '3005';

--PROFESSOR 테이블의 HIREDATE를 +20년 해서 업데이ㅓ
UPDATE PROFESSOR
    SET
        HIREDATE = ADD_MONTHS(HIREDATE, 240);

SELECT * FROM PROFESSOR;

--EMP_COPY1의 데이터 삭제
DELETE FROM EMP_COPY1;

--EMP의 전체 데이터를 EMP_COPY1에 저장
INSERT INTO EMP_COPY1
SELECT * FROM EMP;

SELECT * FROM EMP_COPY1;

--30, 40번 부서 사원들 60부서로 통합, 현재 보너스의 * 1.5
UPDATE EMP_COPY1
    SET
        DNO = '60',
        COMM = COMM * 1.5
    WHERE DNO IN ('20','30');

--DEPT_COPY 테이블 생성
CREATE TABLE DEPT_COPY
    AS SELECT * FROM DEPT;

SELECT * FROM DEPT_COPY;

--서브쿼리를 이용한 데이터 수정
UPDATE DEPT_COPY
    SET
        (DNO, DNAME, LOC) = (
                SELECT DNO
                    , DNAME
                    , LOC
                    FROM DEPT
                    WHERE DNO = '50'
            )
    WHERE DNO IN ('20', '30');

--40번 부서의 DIRECTOR를 EMP테이블에서 급여가 제일 높은 사원으로 업데이트
UPDATE DEPT_COPY
    SET
        (DIRECTOR) = (
                SELECT ENO
                    FROM EMP
                    WHERE SAL = (
                        SELECT MAX(SAL)
                            FROM EMP
                        )
            )
    WHERE DNO = '40';
COMMIT;

--1-4. DELETE FORM
--전체 데이터 삭제 => 조건절 생략
DELETE FROM EMP_COPY1;
SELECT * FROM EMP_COPY1;

--일브 데이터 삭제 -> WHERE 절로 조건 추가
DELETE FROM EMP_COPY1
WHERE JOB = '지원';
ROLLBACK;

--WHERE절에 서브쿼리를 사용하여 특정 데이터 삭제
--RMQDURK 4000이상되는 사원 정보 삭제
DELETE FROM EMP_COPY1
WHERE ENO IN (
        SELECT ENO
            FROM EMP_COPY1
            WHERE SAL >= 4000
    );

--STUDENT 테이블 참조하여 ST_COPY 테이블 생성
CREATE TABLE ST_COPY
    AS SELECT * FROM STUDENT;

SELECT * FROM ST_COPY;

--SCORE 학생별 기말고사 성적 평균이 60이상인 학생정보 ST_COPY에서 삭제
DELETE FROM ST_COPY
WHERE (SNO) IN (
    SELECT SNO
        FROM SCORE
        GROUP BY SNO
        HAVING AVG(RESULT) >= 60
    )