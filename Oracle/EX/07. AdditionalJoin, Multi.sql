    --1. 추가적인 조인 방식
    --1-1. NATURAL JOIN
    SELECT SNO
         , SNAME
         , AVG(RESULT)
        FROM SCORE
        NATURAL JOIN STUDENT
        GROUP BY SNO, SNAME;

    --학생별 기말고사 성적의 평균이 55점이상인 학생번호, 학생이름, 기말고사 평균 조회
    SELECT SNO
        , SNAME
        , AVG(RESULT)
        FROM SCORE
        NATURAL JOIN STUDENT
        GROUP BY SNO, SNAME
        HAVING AVG(RESULT) >= 55;

--최대급여가 4000만원 이상되는 부서의 번호, 부서 이름, 급여
SELECT DNO
    , DNAME
    , MAX(SAL)
    FROM DEPT
    NATURAL JOIN EMP
    GROUP BY DNO, DNAME
    HAVING MAX(SAL) >= 4000;

--1-2. JOIN USING
--JOIN ON
SELECT SC.CNO
    , C.CNAME
    , AVG(SC.RESULT)
    FROM SCORE SC
    JOIN COURSE C
    ON SC.CNO = C.CNO
    GROUP BY SC.CNO, C.CNAME
    HAVING AVG(SC.RESULT) >= 53;

--JOIN USING
    SELECT CNO
         , C.CNAME
         , AVG(SC.RESULT)
    FROM SCORE SC
    JOIN COURSE C
    USING (CNO)
    GROUP BY CNO, C.CNAME
    HAVING AVG(SC.RESULT) >= 53;

--학점이 3점인 과목의 교수번호, 교수이름, 과목이름, 학점 조회
SELECT PNO
    , P.PNAME
    , C.CNO
    , C.CNAME
    , C.ST_NUM
    FROM COURSE C
    JOIN PROFESSOR P
    USING (PNO)
    WHERE C.ST_NUM = 3;

--2. 다중 컬럼 IN절
--DNO이 01이면서 JOB이 경영인 사원이나 DNO이 30이면서 JOB이 회계인 사원 조회
SELECT DNO
    , ENO
    , ENAME
    , JOB
    FROM EMP
    WHERE (DNO, JOB) IN (('01', '경영'), ('30', '회계'));

--다중컬럼 in절을 이용해서 기말고사 성적의 평균이 48점 이상인 과목번호, 과목명,
--교수번호, 교수이름, 기말고사 성적 평균 조회
SELECT CNO
    , C.CNAME
    , PNO
    , P.PNAME
    , AVG(SC.RESULT)
    FROM SCORE SC
    NATURAL JOIN COURSE C
    NATURAL JOIN PROFESSOR P
    WHERE (CNO, PNO) IN (
    SELECT CNO
        , PNO
        FROM SCORE SCC
        NATURAL JOIN COURSE CC
        NATURAL JOIN PROFESSOR PP
        GROUP BY CNO, PNO
        HAVING AVG(SCC.RESULT) >= 48
    )
    GROUP BY CNO, C.CNAME, PNO, P.PNAME;

--사원의 정보를 다중 컬럼 IN을 이용해서 조회
--(DNO, MGR) 부서번호는 01, 02 사수번호 0001인 사원번호, 사원이름, 사수번호, 부서번호 조회
SELECT ENO
    , ENAME
    , MGR
    , DNO
    FROM EMP
    WHERE (DNO, MGR) IN (('01','0001'),('02','0001'));

--3. WITH
--가상테이블 생성
WITH
    DNO10 AS (SELECT * FROM DEPT WHERE DNO = '10'),
    JOBDEV AS (SELECT * FROM EMP WHERE JOB = '개발')
SELECT JOBDEV.ENO
    , JOBDEV.ENAME
    , JOBDEV.DNO
    , DNO10.DNAME
    , JOBDEV.JOB
    FROM JOBDEV, DNO10
    WHERE JOBDEV.DNO = DNO10.DNO;

--화학과 학생명단의 컬럼 전체,
--기말고사 성적 중 과목명에 화학이 포함되는 성적 정보를 기상 테이블 생성
--SCORE : CNO, SNO, RESULT
--COURSE : CNAME
--학생별 화학이 포함된 과목의 기말고사 성적의 평균(학생 번호, 학생 이름, 평균성적)
WITH
    STDCH AS (SELECT * FROM STUDENT WHERE MAJOR = '화학'),
    SCCH AS (SELECT CNO
                  , SNO
                  , RESULT
                  , CNAME
             FROM SCORE SC
             NATURAL JOIN COURSE
             WHERE CNAME LIKE '%화학%'
    )
SELECT STDCH.SNO
     , STDCH.SNAME
     , ROUND(AVG(SCCH.RESULT),2) AVG
FROM STDCH, SCCH
WHERE STDCH.SNO = SCCH.SNO
GROUP BY STDCH.SNO, STDCH.SNAME;


