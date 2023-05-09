--1) 학생중에 동명이인을 검색한다
SELECT DISTINCT STA.SNO 
    , STA.SNAME
    FROM STUDENT STA
    JOIN STUDENT STB
    ON STA.SNO != STB.SNO AND STA.SNAME = STB.SNAME
    ORDER BY SNO;

--2) 전체 교수 명단과 교수가 담당하는 과목의 이름을 학과 순으로 검색한다
SELECT P.PNO
    , P.PNAME
    , P.SECTION
    , C.CNAME
    FROM PROFESSOR P
    LEFT JOIN COURSE C
    ON P.PNO = C.PNO
    ORDER BY SECTION;

--3) 이번 학기 등록된 모든 과목과 담당 교수의 학점 순으로 검색한다
SELECT C.CNAME
    , C.ST_NUM
    , P.PNAME
    FROM COURSE C
    LEFT JOIN PROFESSOR P
    ON C.PNO = P.PNO
    ORDER BY ST_NUM DESC;
<<<<<<< HEAD
=======

>>>>>>> c4e2eee (2023_04_12)
