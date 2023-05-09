--1) STUDENT 테이블을 참조하여 ST_TEMP 테이블을 만들고 모든
--학생의 성적을 4.5만점 기준으로 수정하세요
CREATE TABLE ST_TEMP
    AS SELECT SNO
            , SNAME
            , SEX
            , SYEAR
            , MAJOR
            , ROUND(AVR * 4.5 / 4.0,2) AVR
       FROM STUDENT;

SELECT * FROM STUDENT;
SELECT * FROM ST_TEMP;

--2) PROFESSOR 테이블을 참조하여 PF_TEMP 테이블을 만들고 모든 교수의 부임일자를 100일 앞으로 수정하세요
CREATE TABLE PF_TEMP
    AS SELECT PNO
            , PNAME
            , SECTION
            , ORDERS
            , HIREDATE + 100 HIREDATE
            FROM PROFESSOR;

SELECT * FROM PROFESSOR;
SELECT * FROM PF_TEMP;

--3) ST_TEMP 테이블에서 화학과 2학년 학생의 정보를 삭제하세요
DELETE FROM ST_TEMP
WHERE (MAJOR, SYEAR) IN (
    SELECT MAJOR
         , SYEAR
         FROM ST_TEMP
         WHERE MAJOR IN '화학'
         AND SYEAR IN '2'
    );

--4) PF_TEMP 테이블에서 조교수의 정보를 삭제하세요
DELETE FROM PF_TEMP
WHERE ORDERS IN '조교수';

--5) EMP 테이블을 참조하여 EMP2 테이블을 만들고 DNO = 30인 사원의 보너스를
--15프로 상승시킨 값으로 변경하시고
--DNO = 20인 사원의 급여를 10프로 상승시킨 값으로 변경하세요.
CREATE TABLE EMP2
    AS SELECT * FROM EMP;

SELECT * FROM EMP2;
DROP TABLE EMP2;

UPDATE EMP2
    SET
        COMM = CASE
        WHEN DNO = '30' THEN COMM * 1.15
        ELSE COMM
        END,
        SAL = CASE
        WHEN DNO = '20' THEN SAL * 1.1
        ELSE SAL
        END;

--6) 화학과 2학년 학생중 기말고사 성적의 등급이 A, B인 정보를 갖는 테이블
-- SCORE_STGR을 생성하세요.(SNO, SNAME, MAJOR, SYEAR, RESULT, GRADE)
CREATE TABLE SCORE_STGR
    AS SELECT SNO
            , ST.SNAME
            , ST.MAJOR
            , ST.SYEAR
            , SC.RESULT
            , SG.GRADE
            FROM STUDENT ST
            NATURAL JOIN SCORE SC
            JOIN SCGRADE SG
            ON SC.RESULT BETWEEN LOSCORE AND HISCORE
            WHERE SG.GRADE IN ('A', 'B')
            AND ST.MAJOR IN '화학'
            AND ST.SYEAR IN '2';

DROP TABLE SCORE_STGR;
SELECT * FROM SCORE_STGR;

--7) 생물학과 학생중 평점이 2.7이상인 학생이 수강중인 과목의 정보를 갖는
--테이블 ST_COURSEPF를 생성하세요. (SNO, SNAME, CNO, CNAME, PNO,
--PNAME, AVR)
CREATE TABLE ST_COURSEPF
    AS SELECT SNO
            , SNAME
            , CNO
            , CNAME
            , PNO
            , PNAME
            , AVR
            FROM STUDENT
            NATURAL JOIN COURSE
            NATURAL JOIN PROFESSOR
            WHERE MAJOR = '생물'
            AND AVR >= 2.7;

SELECT * FROM ST_COURSEPF;

