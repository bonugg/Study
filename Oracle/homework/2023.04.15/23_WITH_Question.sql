--1) WITH 절을 이용하여 정교수만 모여있는 가상테이블 하나와 일반과목
--(과목명에 일반이 포함되는)들이 모여있는 가상테이블 하나를 생성하여
--일반과목들을 강의하는 교수의 정보 조회하세요.(과목번호, 과목명, 교수번호,
--교수이름)
WITH
    PRO AS (SELECT * FROM PROFESSOR WHERE ORDERS = '정교수'),
    CRO AS (SELECT * FROM COURSE WHERE CNAME LIKE '%일반%')
SELECT CRO.CNO
    , CRO.CNAME
    , CRO.PNO
    , PRO.PNAME
    FROM PRO, CRO
    WHERE CRO.PNO = PRO.PNO;

--2) WITH 절을 이용하여 급여가 3000이상인 사원정보를 갖는 가상테이블 하나와
--보너스가 500이상인 사원정보를 갖는 가상테이블 하나를 생성하여
--두 테이블에 모두 속해있는 사원의 정보를 모두 조회하세요.
WITH
    EMS AS (SELECT * FROM EMP WHERE SAL >= 3000),
    EMC AS (SELECT * FROM EMP WHERE COMM >= 500)
SELECT EMS.ENAME
    , EMS.SAL
    , EMS.COMM
    FROM EMS, EMC
    WHERE EMS.ENO = EMC.ENO;

--3) WITH 절을 이용하여 평점이 3.3이상인 학생의 목록을 갖는 가상테이블 하나와
--학생별 기말고사 평균점수를 갖는 가상테이블 하나를 생성하여
--평점이 3.3이상인 학생의 기말고사 평균 점수를 조회하세요.
WITH
    STAR AS (SELECT * FROM STUDENT WHERE AVR >= 3.3),
    AVGST AS (
        SELECT SNO
            , AVG(RESULT) AV
            FROM SCORE
            GROUP BY SNO
    )
SELECT STAR.SNO
    , STAR.SNAME
    , STAR.AVR
    ,AVGST.AV
    FROM STAR, AVGST
    WHERE STAR.SNO = AVGST.SNO;

--4) WITH 절을 이용하여 부임일자가 25년이상된 교수정보를 갖는 가상테이블 하나와
--과목번호, 과목명, 학생번호, 학생이름, 교수번호, 기말고사성적을
--갖는 가상테이블 하나를 생성하여 기말고사 성적이 90이상인 과목번호, 과목명,
--학생번호, 학생이름, 교수번호, 교수이름, 기말고사성적을 조회하세요.
WITH
    PROHI AS (SELECT * FROM PROFESSOR
                       WHERE MONTHS_BETWEEN(SYSDATE, HIREDATE) / 12 >= 25),
    CSPS AS (
        SELECT CNO
            , CNAME
            , SNO
            , SNAME
            , PNO
            , RESULT
            FROM COURSE
            JOIN SCORE
            USING (CNO)
            JOIN STUDENT
            USING (SNO)
            JOIN PROFESSOR
            USING (PNO)
    )
SELECT CSPS.CNO
    , CSPS.CNAME
    , CSPS.SNO
    , CSPS.SNAME
    , PROHI.PNO
    , PROHI.PNAME
    , CSPS.RESULT
    FROM PROHI, CSPS
    WHERE PROHI.PNO = CSPS.PNO
    AND CSPS.RESULT >= 90