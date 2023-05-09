<<<<<<< HEAD
--1. OUTER JOIN 연습
=======
--1. OUTER JOIN
>>>>>>> c4e2eee (2023_04_12)
CREATE TABLE BOARD(
    BOARD_NO NUMBER,
    BOARD_TITLE VARCHAR(50)
);

CREATE TABLE BOARD_FILE(
    BOARD_NO NUMBER,
    FILE_NM VARCHAR(50)
);

<<<<<<< HEAD
INSERT INTO BOARD_FILE VALUES(1, 'a');

DELETE FROM BOARD
WHERE BOARD_NO = 10;


SELECT * FROM BOARD;
=======
INSERT INTO BOARD_FILE VALUES(13, 'a');

SELECT * FROM BOARD_FILE;
>>>>>>> c4e2eee (2023_04_12)

SELECT A.BOARD_TITLE
     , B.BOARD_NO
     , NVL(B.FILE_NM, 'no file exist')
    FROM BOARD A
<<<<<<< HEAD
    left OUTER JOIN BOARD_FILE B
    ON A.BOARD_NO = B.BOARD_NO;
    
--2. INNER JOIN
--SCORE테이블의 모든 데이터와 STUDENT 테이블의 학생이름 조회
SELECT SC.*
     , ST.SNAME
    FROM SCORE SC
    INNER JOIN STUDENT ST
    ON SC.SNO = ST.SNO;
    
--모든 사원정보와 부서명 동시에 조회
--ANSI 표준
SELECT EM.*
     , DE.DNAME
     , DE.LOC
    FROM EMP EM
    JOIN DEPT DE
    ON EM.DNO = DE.DNO;

--다른 형태의 INNER JOIN
SELECT EM.*
     , DE.DNAME
     , DE.LOC
    FROM EMP EM
       , DEPT DE
    WHERE EM.DNO = DE.DNO;
    
--비등가 조인
SELECT SC.*
     , GR.GRADE
    FROM SCORE SC
    INNER JOIN SCGRADE GR
    ON SC.RESULT BETWEEN GR.LOSCORE AND GR.HISCORE;
    
--사원의 모든 정보와 해당 사원에 대한 급여등급 정보 조회
SELECT EMP.*
     , SALGRADE.GRADE
    FROM EMP 
    INNER JOIN SALGRADE 
    ON EMP.SAL BETWEEN SALGRADE.LOSAL AND SALGRADE.HISAL;

--CrossJoin
--조인조건을 명시하지 않으면 의미없는 데이터가 조회된다.
SELECT A.ENO
     , A.ENAME
     , A.DNO
     , B.DNAME
    FROM EMP A
       , DEPT B;

--셀프조인
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

--3.OUTER JOIN
--사원의 사수의 이름 조회 사수의 정보가 존재하지 않는 사원들도 모두 조회
--ANSI
SELECT A.ENO
     , A.ENAME
     , A.MGR
     , B.ENO
     , B.ENAME
    FROM EMP A
    LEFT JOIN EMP B
    ON A.MGR = B.ENO;

--ORCLE
SELECT A.ENO
     , A.ENAME
     , A.MGR
     , B.ENO
     , B.ENAME
    FROM EMP A
        ,EMP B
    WHERE A.MGR = B.ENO(+);
    
--과목들의 정보를 조회, 교수의 이름과 같이 조회, 담당교수가 배정되지 않은 과목도 함께 조회되도록
--ANSI
SELECT C.*
     , P.PNAME
    FROM COURSE C
    LEFT JOIN PROFESSOR P
    ON C.PNO = P.PNO;

--ORACLE
SELECT C.*
     , P.PNAME
    FROM COURSE C
       , PROFESSOR P
    WHERE C.PNO = P.PNO(+);
    
--4. 다중 조인
--사원의 모든정보 조회, 급여등급과 부서명이 같이 조회되도록
SELECT E.ENO
     , E.ENAME
     , E.MGR
     , E.SAL
     , S.GRADE
     , E.DNO
     , D.DNAME
    FROM EMP E
    JOIN SALGRADE S
    ON E.SAL BETWEEN S.LOSAL AND S.HISAL
    JOIN DEPT D
    ON E.DNO = D.DNO;
    
--사원의 모든정보 조회, 급여등급과 부서명 그리고 사수 사원이름이 같이 조회되도록
SELECT E.ENO
     , E.ENAME
     , E.MGR
     , M.ENAME
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
    
--기말고사의 성적을 조회할 건데 과목이름, 담당교수 이름, 학생이름, 점수등급 함께 조회 과목번호 순서로 정렬
SELECT SC.SNO
     , ST.SNAME
     , SC.CNO
     , PCS.CNAME
     , SC.RESULT
     , SG.GRADE
     , PCS.PNO
     , PCS.PNAME
    FROM SCORE SC
    JOIN SCGRADE SG
    ON SC.RESULT BETWEEN SG.LOSCORE AND SG.HISCORE
    JOIN STUDENT ST
    ON SC.SNO = ST.SNO
    RIGHT JOIN (
        SELECT CS.*
             , P.PNAME
            FROM COURSE CS
            LEFT JOIN PROFESSOR P
            ON CS.PNO = P.PNO
    ) PCS
    ON SC.CNO = PCS.CNO
    ORDER BY SNO, CNO;
=======
    FULL OUTER JOIN BOARD_FILE B
    ON A.BOARD_NO = B.BOARD_NO;




>>>>>>> c4e2eee (2023_04_12)
