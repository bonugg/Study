--뷰 이름은 자유
--1) 학생의 학점 4.5 만점으로 환산된 정보를 검색할 수 있는 뷰를 생성하세요.
CREATE OR REPLACE VIEW V_ST(
    SNO,
    SNAME,
    SEX,
    SYEAR,
    MAJOR,
    AVR
    ) AS (
        SELECT SNO,
               SNAME,
               SEX,
               SYEAR,
               MAJOR,
               ROUND(AVR * 4.5 /4.0,2)
               FROM STUDENT
         );

SELECT * FROM STUDENT;
SELECT * FROM V_ST;

--2) 각 과목별 평균 점수를 검색할 수 있는 뷰를 생성하세요.
CREATE OR REPLACE VIEW V_CRS_SC(
    CNO,
    CNAME,
    AVR
    ) AS (
        SELECT CNO,
               CNAME,
               ROUND(AVG(RESULT),2)
               FROM COURSE
               NATURAL JOIN SCORE
               GROUP BY CNO, CNAME
         );

SELECT * FROM V_CRS_SC;

--3) 각 사원과 관리자의 이름을 검색할 수 있는 뷰를 생성하세요.
CREATE OR REPLACE VIEW V_EMP(
    ENO,
    ENAME,
    MGR,
    MENO,
    MNAME
    ) AS (
        SELECT E.ENO,
               E.ENAME,
               E.MGR,
               M.ENO,
               M.ENAME
               FROM EMP E
               JOIN EMP M
               ON E.MGR = M.ENO
         );

SELECT * FROM V_EMP;

--4) 각 과목별 기말고사 평가 등급(A~F)까지와 해당 학생 정보를 검색할 수 있는 뷰를
--생성하세요.
CREATE OR REPLACE VIEW V_CRS_SC_ST(
    SNO,
    SNAME,
    CNO,
    CNAME,
    RESULT,
    GRADE
    ) AS (
        SELECT SNO,
               ST.SNAME,
               CNO,
               C.CNAME,
               SC.RESULT,
               SG.GRADE
               FROM STUDENT ST
               NATURAL JOIN SCORE SC
               NATURAL JOIN COURSE C
               JOIN SCGRADE SG
               ON SC.RESULT BETWEEN LOSCORE AND HISCORE
         );

SELECT * FROM V_CRS_SC_ST;

--5) 물리학과 교수의 과목을 수강하는 학생의 명단을 검색할 뷰를 생성하세요.
CREATE OR REPLACE VIEW V_PR_ST(
    SNO,
    SNAME
    ) AS (
        SELECT SNO,
               SNAME
               FROM PROFESSOR P
               NATURAL JOIN COURSE C
               NATURAL JOIN SCORE SC
               NATURAL JOIN STUDENT ST
               WHERE P.SECTION = '물리'
               GROUP BY SNO, SNAME
         );

SELECT * FROM V_PR_ST;