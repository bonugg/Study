--1) 평점이 3.0에서 4.0사이의 학생을 검색하라(between and)
SELECT *
    FROM STUDENT
    WHERE AVR BETWEEN '3.0' AND '4.0';

--2) 1994년에서 1995년까지 부임한 교수의 명단을 검색하라(between and)
SELECT PNAME
    FROM PROFESSOR
    WHERE HIREDATE BETWEEN TO_DATE('19940101', 'yyyyMMdd HH24:mi:ss')
    AND TO_DATE('19951231', 'yyyyMMdd HH24:mi:ss');

--3) 화학과와 물리학과, 생물학과 학생을 검색하라(in)
SELECT SNAME
    , MAJOR
    FROM STUDENT
    WHERE MAJOR IN ('화학','물리');

--4) 정교수와 조교수를 검색하라(in)
SELECT *
    FROM PROFESSOR
    WHERE ORDERS IN ('정교수','부교수');

--5) 학점수가 1학점, 2학점인 과목을 검색하라(in)
SELECT *
    FROM COURSE
    WHERE ST_NUM IN('1','2');

--6) 1, 2학년 학생 중에 평점이 2.0에서 3.0사이인 학생을 검색하라(between and)
SELECT *
    FROM STUDENT
    WHERE SYEAR IN('1','2') 
    AND AVR BETWEEN '2.0' AND '3.0';

--7) 화학, 물리학과 학생 중 1, 2 학년 학생을 성적순으로 검색하라(in)
SELECT *
    FROM STUDENT
    WHERE MAJOR IN('화학','물리')
    AND SYEAR IN('1','2')
    ORDER BY AVR DESC;

--8) 부임일이 1995년 이전인 정교수를 검색하라(to_date)
SELECT *
    FROM PROFESSOR
    WHERE HIREDATE <= TO_DATE('19941231', 'yyyyMMdd HH24:mi:ss')
    AND ORDERS IN '정교수';