--1. INNER JOIN
--SCORE테이블의 모든 데이터와 STUDENT 테이블의 학생이름 조회
SELECT SC.*
    , ST.SNAME
    FROM SCORE SC
    INNER JOIN STUDENT ST
    ON SC.SNO = ST.SNO;
    
--모든 사원정보와 부서명을 동시에 조회
SELECT E.*
    , DP.DNAME
    FROM EMP E
    INNER JOIN DEPT DP
    ON E.DNO = DP.DNO;
    
    SELECT * FROM DEPT;
    SELECT * FROM EMP;

SELECT E.*
    , DE.DNAME
    , DE.LOC
    FROM EMP E
        ,DEPT DE
    WHERE E.DNO = DE.DNO;

--3. 비등가 조인
SELECT SC.*
    , GR.GRADE
    FROM SCORE SC
    INNER JOIN SCGRADE GR
    ON SC.RESULT BETWEEN GR.LOSCORE AND GR.HISCORE;
    
SELECT * FROM EMP;
SELECT * FROM SALGRADE;
--사원의 모든 정보와 해당 사원에 대한 급여등급 정보 조회
SELECT EM.*
    , GR.GRADE
    FROM EMP EM
    INNER JOIN SALGRADE GR
    ON EM.SAL BETWEEN GR.LOSAL AND GR.HISAL;
    
--Cross Join
--조인조건을 명시하지 않으면 의미없는 데이터가 조회된다.
SELECT A.ENO
    , A.ENAME
    , A.DNO
    , B.DNAME
    FROM EMP A, DEPT B;

--셀프 조인
--FROM절의 테이블과 조인되는 테이블이 같을 때
--사원의 사수의 이름 조회
SELECT A.ENO
    , A.ENAME
    , A.MGR
    , B.ENO
    , B.ENAME
    FROM EMP A
    JOIN EMP B
    ON A.MGR = B.ENO;
    
SELECT * FROM EMP;
--2. OUTER JOIN
--사원의 사수의 이름 조회 사수의 정보가 존재하지 않는 사원들도 모두 조회
--ansi
SELECT A.ENO
    , A.ENAME
    , A.MGR
    , B.ENO
    , B.ENAME
    FROM EMP A
    LEFT OUTER JOIN EMP B
    ON A.MGR = B.ENO;
--oracle
SELECT A.ENO
    , A.ENAME
    , A.MGR
    , B.ENO
    , B.ENAME
    FROM EMP A, EMP B
    WHERE A.MGR = B.ENO(+);
--과목들의 정보를 조회, 교수의 이름과 같이 조회, 담당교수가 배정되지 않은 과목도 함꼐 조회
SELECT CS.*
    , PR.PNAME
    FROM COURSE CS
    LEFT OUTER JOIN PROFESSOR PR
    ON CS.PNO = PR.PNO;

SELECT * FROM EMP;
SELECT * FROM DEPT;
--4. 다중 조인
--사원의 모든정보 조회, 급여등급과 부서명이 같이 조회되도록
SELECT E.ENO
    , E.ENAME
    , E.MGR
    , E.ENAME
    , E.SAL
    , S.GRADE
    , E.DNO
    , D.DNAME
    FROM EMP E
    JOIN SALGRADE S
    ON E.SAL BETWEEN S.LOSAL AND S.HISAL
    JOIN DEPT D
    ON E.DNO = D.DNO
    LEFT JOIN EMP M
    ON E.MGR = M.ENO;
    
SELECT * FROM SCORE;
SELECT * FROM COURSE;
SELECT * FROM PROFESSOR;
SELECT * FROM STUDENT;
SELECT * FROM SCGRADE;
--기말고사 성적을 조회할 건데 과목이름, 담당교수 이름 함께 조회 과목번호 순서로 정렬
SELECT SC.RESULT
    , CR.CNAME
    , PR.PNAME
    , ST.SNAME
    , SG.GRADE
    FROM SCORE SC
    JOIN COURSE CR
    ON SC.CNO = CR.CNO
    JOIN PROFESSOR PR
    ON CR.PNO = PR.PNO
    JOIN STUDENT ST
    ON SC.SNO = ST.SNO
    JOIN SCGRADE SG
    ON SC.RESULT BETWEEN SG.LOSCORE AND SG.HISCORE
    ORDER BY SC.SNO, CR.CNO;
    