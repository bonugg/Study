--1. 그룹함수
--1-1. MAX
--전체 학생 중 최대 평점
SELECT MAX(AVR)
FROM STUDENT;

--전공별 최대 평점
SELECT MAX(AVR)
     , MAJOR
FROM STUDENT
GROUP BY MAJOR;

--전공별로 학년별로 최대 평점
SELECT ST.SNO
     , ST.SNAME
     , MAXAVR.AVR
     , MAXAVR.MAJOR
     , MAXAVR.SYEAR
FROM STUDENT ST
         JOIN
     (
         SELECT MAX(AVR) AS AVR
              , MAJOR
              , SYEAR
         FROM STUDENT
         GROUP BY MAJOR, SYEAR
         HAVING MAJOR = '화학'
            AND MAX(AVR) > 2.5
     ) MAXAVR
     ON ST.AVR = MAXAVR.AVR
         AND ST.MAJOR = MAXAVR.MAJOR
         AND ST.SYEAR = MAXAVR.SYEAR;

--기말고사 성적 중 과목별 가장 높은 점수 조회
--CNO 데이터가 같은 값들을 그룹으로 묶어서 그 그룹중에 최대값을 꺼내온다.
SELECT CNO
     , MAX(RESULT)
FROM SCORE
GROUP BY CNO;

--기말고사 성적 중 과목별 가장 높은 점수 조회 + 과목명
SELECT SC.CNO
     , C.CNAME
     , SC.MAXRESULT
FROM COURSE C
         JOIN (
    SELECT CNO
         , MAX(RESULT) AS MAXRESULT
    FROM SCORE
    GROUP BY CNO
) SC
              ON C.CNO = SC.CNO;

--과목별 기말고사 성적의 최대값(과목명, 학생이름)
SELECT SC.SNO
     , ST.SNAME
     , MXRS.CNO
     , C.CNAME
     , MXRS.MAXRESULT
FROM SCORE SC
         JOIN (
    SELECT CNO
         , MAX(RESULT) AS MAXRESULT
    FROM SCORE
    GROUP BY CNO
) MXRS
              ON SC.CNO = MXRS.CNO
                  AND SC.RESULT = MXRS.MAXRESULT
         JOIN STUDENT ST
              ON SC.SNO = ST.SNO
         JOIN COURSE C
              ON C.CNO = SC.CNO
ORDER BY SC.CNO;

SELECT DISTINCT CNO
FROM SCORE;

--GROUP BY 통계함수 함께 사용
--SELECT절에 통계함수
--GROUP BY절에 통계함수를 어떤 기준으로 통계를 낼건지
--GROUP BY절에 특정 컬럼을 지정하면 그 컬럼의 값이 같은 데이터들끼리
--모아서 통계를 내준다.
--예로 SCORE 테이블에 CNO을 GROUP BY절에 작성하면
--CNO이 같은 결국 같은 과목의 데이터만 모아서 통계를 내주는 식으로 진행된다.

--1-2. MIN
--기말고사 성적 전체 과목중 최저 값 조회
--테이블 전체 데이터의 통계를 낼 때는 GROUP BY를 사용할 필요가 없다.
SELECT MIN(RESULT)
FROM SCORE;

--부서별 연봉 최저값
SELECT DNO
     , MIN(SAL) AS MINSAL
FROM EMP
GROUP BY DNO;

--부서별 연봉 최저값 부서명 포함
SELECT MNSL.DNO
     , D.DNAME
     , MNSL.MINSAL
FROM DEPT D
         JOIN (
    SELECT DNO
         , MIN(SAL) AS MINSAL
    FROM EMP
    GROUP BY DNO
) MNSL
              ON D.DNO = MNSL.DNO;

--부서별 연봉 최저값 부서명, 사원이름 포함(잘못된 GROUP BY)
--공통된 값이 없는 컬럼을 GROUP BY하면 그룹화의 의미가 없어진다.
SELECT MNSL.DNO
     , D.DNAME
     , MNSL.ENAME
     , MNSL.MINSAL
FROM DEPT D
         JOIN (
    SELECT DNO
         , ENAME
         , MIN(SAL) AS MINSAL
    FROM EMP
    GROUP BY DNO, ENAME
) MNSL
              ON D.DNO = MNSL.DNO;

--부서별 연봉 최저값 부서명, 사원이름 포함(잘못된 GROUP BY)
SELECT MNSL.DNO
     , D.DNAME
     , E.ENO
     , E.ENAME
     , MNSL.MINSAL
FROM (
         SELECT DNO
              , MIN(SAL) AS MINSAL
         FROM EMP
         GROUP BY DNO
     ) MNSL
         JOIN EMP E
              ON E.DNO = MNSL.DNO
                  AND E.SAL = MNSL.MINSAL
         JOIN DEPT D
              ON D.DNO = MNSL.DNO;

--잘못된 GROUP BY
--SELECT절에 컬럼이 하나 추가되는 순간 GROUP BY에도 추가해줘야되기 때문에
--GROUP BY의 의미가 변질된다. 그래서 GROUP BY로 이미 묶여있는 데이터는
--서브쿼리로 빼서 별도의 테이블로 생각하고 사용한다.
SELECT SNO
     , CNO
     , MAX(RESULT)
FROM SCORE
GROUP BY SNO, CNO
ORDER BY SNO, CNO;

--학생별 최대점수
SELECT SNO
     , MAX(RESULT) AS MAXRES
FROM SCORE
GROUP BY SNO;

--학생별 최대점수의 과목번호
SELECT MXRS.SNO
     , SC.CNO
     , MXRS.MAXRES
FROM (
         SELECT SNO
              , MAX(RESULT) AS MAXRES
         FROM SCORE
         GROUP BY SNO
     ) MXRS
         JOIN SCORE SC
              ON MXRS.SNO = SC.SNO
                  AND MXRS.MAXRES = SC.RESULT
ORDER BY SNO, CNO;

--1. 그룹화 관련 함수
--1-1. ROLLUP
-- ROLLUP 사용 x
--GROUP BY된 컬럼의 개수로 다 그룹화된 결과
SELECT DNO
     , JOB
     , MAX(SAL)
     , SUM(SAL)
     , AVG(SAL)
     , COUNT(*)
FROM EMP
GROUP BY DNO, JOB;

--ROLLUP 사용 o
SELECT DNO
     , JOB
     , MAX(SAL)
     , SUM(SAL)
     , AVG(SAL)
     , COUNT(*)
FROM EMP
GROUP BY ROLLUP(DNO, JOB)
ORDER BY DNO, JOB;

--1-2. CUBE
--CUBE는 ROLLUP과 지정방식이 동일하지만 동작방식이 다르다
--그룹화되는 컬럼들의 모든 조합의 그룹화를 진행하여 결과를 출력
SELECT DNO
     , JOB
     , MAX(SAL)
     , SUM(SAL)
     , AVG(SAL)
     , COUNT(*)
FROM EMP
GROUP BY CUBE(DNO, JOB)
ORDER BY DNO, JOB;

--1-3. GROUPING SETS
--그룹화로 지정된 컬럼들의 각각의 그룹화를 진행한 결과
SELECT DNO
     , JOB
     , MAX(SAL)
     , SUM(SAL)
     , AVG(SAL)
     , COUNT(*)
FROM EMP
GROUP BY GROUPING SETS(DNO, JOB)
ORDER BY DNO, JOB;

--1-4. 그룹화 함수
--GROUPING
--그룹화 여부를 확인해줌
SELECT DNO
     , JOB
     , MAX(SAL)
     , SUM(SAL)
     , AVG(SAL)
     , COUNT(*)
     , GROUPING(DNO)
     , GROUPING(JOB)
FROM EMP
GROUP BY ROLLUP(DNO, JOB)
ORDER BY DNO, JOB;

--GROUPING_ID
--GROUPING의 결과를 이진수로 인식하여 십진수로 변환한 값을 표시
SELECT DNO
     , JOB
     , MAX(SAL)
     , SUM(SAL)
     , AVG(SAL)
     , COUNT(*)
     , GROUPING(DNO)
     , GROUPING(JOB)
     , GROUPING_ID(DNO, JOB)
FROM EMP
GROUP BY ROLLUP(DNO, JOB)
ORDER BY DNO, JOB;

--1-5. LISTAGG
--LISTAGG 사용 x
SELECT DNO
     , ENAME
FROM EMP
GROUP BY DNO, ENAME;

--LISTAGG 사용 o
--그룹화된 컬럼에 속한 데이터 확인
SELECT DNO
     , LISTAGG(ENAME, ', ')
               WITHIN GROUP (ORDER BY SAL DESC)
FROM EMP
GROUP BY DNO;

--1-6. PIVOT
--PIVOT 사용 x
SELECT JOB
     , MAX(SAL)
FROM EMP
GROUP BY JOB;

--PIVOT 사용 o
SELECT *
FROM (
    SELECT JOB
         , SAL
    FROM EMP E
)
    PIVOT(MAX(SAL)
    FOR JOB IN(
        '경영' AS OPER,
        '지원' AS HELP,
        '개발' AS DEV,
        '회계' AS ACCOUNT,
        '분석' AS ANALYS
        )
    );

SELECT *
FROM (
    SELECT JOB
         , SAL
         , D.DNO
         , DNAME
    FROM EMP E
             JOIN DEPT D on E.DNO = D.DNO
)
    PIVOT(MAX(SAL)
    FOR JOB IN(
        '경영' AS OPER,
        '지원' AS HELP,
        '개발' AS DEV,
        '회계' AS ACCOUNT,
        '분석' AS ANALYS
        )
    )
ORDER BY DNO;

--학과별 학년별 평점의 최대값 -> 학과가 컬럼으로 변경되는 쿼리
SELECT *
    FROM (
        SELECT MAJOR
            , SYEAR
            , AVR
            FROM STUDENT
         )
    --통계함수를 사용했는데 GROUP BY가 없는 이유는 데이터들이 컬럼이 되면서
    --컬럼이 중복으로 존재할 수 없기때문에 자동으로 그룹화된다.
    PIVOT(MAX(AVR)
        FOR MAJOR IN (
            '화학' AS 화학,
            '물리' AS 물리,
            '생물' AS 생물
            )
        );

--UNPIVOT
--UNPIVOT 사용 x
SELECT *
FROM (
         SELECT DNO
              , MAX(DECODE(JOB, '경영', SAL)) AS "경영"
              , MAX(DECODE(JOB, '지원', SAL)) AS "지원"
              , MAX(DECODE(JOB, '개발', SAL)) AS "개발"
              , MAX(DECODE(JOB, '회계', SAL)) AS "회계"
              , MAX(DECODE(JOB, '분석', SAL)) AS "분석"
         FROM EMP
         GROUP BY DNO
     );

--UNPIVOT 사용 o
--PIVOT된 테이블 구조를 만들어 준다.
SELECT *
FROM (
    SELECT MAX(DECODE(JOB, '경영', SAL)) AS "경영"
         , MAX(DECODE(JOB, '지원', SAL)) AS "지원"
         , MAX(DECODE(JOB, '개발', SAL)) AS "개발"
         , MAX(DECODE(JOB, '회계', SAL)) AS "회계"
         , MAX(DECODE(JOB, '분석', SAL)) AS "분석"
    FROM EMP
)
    UNPIVOT(
    SAL FOR JOB IN("경영", "지원", "개발", "회계", "분석")
    );


SELECT *
FROM (
    SELECT SYEAR
         , MAX(DECODE(MAJOR, '물리', AVR)) AS 물리
         , MAX(DECODE(MAJOR, '생물', AVR)) AS 생물
         , MAX(DECODE(MAJOR, '화학', AVR)) AS 화학
    FROM STUDENT
    GROUP BY SYEAR
)
    UNPIVOT(
    AVR FOR MAJOR IN(물리, 생물, 화학)
    )
    ORDER BY MAJOR, SYEAR;

--PIVOT으로 과목명을 열로 만들고 과목명에 해당하는 기말고사 성적의 평균값.
SELECT *
    FROM (
        SELECT CNAME
            , S.RESULT
            FROM COURSE
            JOIN SCORE S
            on COURSE.CNO = S.CNO
         )
    PIVOT(AVG(RESULT)
        FOR CNAME IN(
            '일반화학' AS 일반화학,
            '유기화학' AS 유기화학,
            '물리화학' AS 물리화학,
            '무기화학' AS 무기화학
            )
        );