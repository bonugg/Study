--1) 송강 교수가 강의하는 과목을 검색한다
SELECT PR.PNAME
    , CR.CNAME
    FROM PROFESSOR PR
    JOIN COURSE CR
    ON PR.PNO = CR.PNO
    WHERE PNAME IN '송강';
SELECT *
    FROM COURSE;

--2) 화학 관련 과목을 강의하는 교수의 명단을 검색한다
SELECT PR.PNAME
    , CR.CNAME
    FROM PROFESSOR PR
    JOIN COURSE CR
    ON PR.PNO = CR.PNO
    WHERE CR.CNAME LIKE '%화학';

--3) 학점이 2학점인 과목과 이를 강의하는 교수를 검색한다
SELECT CR.ST_NUM
    , PR.PNAME
    FROM COURSE CR
    LEFT JOIN PROFESSOR PR
    ON CR.PNO = PR.PNO
    WHERE ST_NUM IN '2';

--4) 화학과 교수가 강의하는 과목을 검색한다
SELECT PR.PNAME
    , CR.CNAME
    FROM PROFESSOR PR
    LEFT JOIN COURSE CR
    ON PR.PNO = CR.PNO
    WHERE SECTION IN '화학';

--5) 화학과 1학년 학생의 기말고사 성적을 검색한다
SELECT ST.SNAME
    , ST.SYEAR
    , ST.MAJOR
    , CR.CNAME
    , SC.RESULT
    , SG.GRADE
    FROM STUDENT ST
    JOIN SCORE SC
    ON ST.SNO = SC.SNO
    JOIN COURSE CR
    ON SC.CNO = CR.CNO
    JOIN SCGRADE SG
    ON SC.RESULT BETWEEN SG.LOSCORE AND SG.HISCORE
    WHERE SYEAR IN '1'
    AND MAJOR IN '화학'
    ORDER BY SNAME, CNAME;

--6) 일반화학 과목의 기말고사 점수를 검색한다
SELECT CR.CNAME
    , SC.RESULT
    FROM COURSE CR
    JOIN SCORE SC
    ON CR.CNO = SC.CNO
    WHERE CNAME IN '일반화학';

--7) 화학과 1학년 학생의 일반화학 기말고사 점수를 검색한다
SELECT ST.SNAME
    , ST.SYEAR
    , ST.MAJOR
    , CR.CNAME
    , SC.RESULT
    FROM STUDENT ST
    JOIN SCORE SC
    ON ST.SNO = SC.SNO
    JOIN COURSE CR
    ON SC.CNO = CR.CNO
    WHERE SYEAR IN '1'
    AND MAJOR IN '화학'
    AND CNAME IN '일반화학'
    ORDER BY SNAME, CNAME;

--8) 화학과 1학년 학생이 수강하는 과목을 검색한다
SELECT ST.SNAME
    , ST.SYEAR
    , ST.MAJOR
    , C.CNAME
    FROM STUDENT ST
    JOIN SCORE SC
    ON ST.SNO = SC.SNO
    JOIN COURSE C
    ON SC.CNO = C.CNO
    WHERE MAJOR IN '화학' AND SYEAR IN '1'
    ORDER BY SNAME;

--9) 유기화학 과목의 평가점수가 F인 학생의 명단을 검색한다
SELECT CR.CNAME 
    ,ST.SNAME
    ,SG.GRADE
    FROM COURSE CR
    JOIN SCORE SC
    ON CR.CNO = SC.CNO
    JOIN SCGRADE SG
    ON SC.RESULT BETWEEN LOSCORE AND HISCORE
    JOIN STUDENT ST
    ON SC.SNO = ST.SNO
    WHERE CNAME IN '유기화학' AND GRADE IN 'F';