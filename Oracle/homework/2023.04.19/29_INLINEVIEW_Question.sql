--1) 4.5 환산 평점이 가장 높은 3인의 학생을 검색하세요.
SELECT ROWNUM,
       B.SNO,
       B.SNAME,
       B.AVR
    FROM (
        SELECT SNO,
               SNAME,
               ROUND(AVR * 4.5 / 4.0,2) AVR
            FROM STUDENT
            ORDER BY AVR DESC
         ) B
    WHERE ROWNUM <= 3;

--2) 기말고사 과목별 평균이 높은 3과목을 검색하세요.
SELECT ROWNUM,
       B.CNO,
       B.CNAME,
       B.AVR
    FROM (
        SELECT CNO,
               CNAME,
               ROUND(AVG(RESULT),2) AVR
            FROM COURSE
            NATURAL JOIN SCORE
            GROUP BY CNO, CNAME
            ORDER BY AVR DESC
         ) B
WHERE ROWNUM <= 3;

--3) 학과별, 학년별, 기말고사 평균이 순위 3까지를 검색하세요.
--(학과, 학년, 평균점수 검색)
SELECT ROWNUM,
       B.SNO,
       B.SNAME,
       B.MAJOR,
       B.SYEAR,
       B.AV
FROM (
         SELECT SNO,
                SNAME,
                MAJOR,
                SYEAR,
                ROUND(AVG(RESULT),2) AV
         FROM STUDENT
                  NATURAL JOIN SCORE
         GROUP BY SNO, SNAME,SYEAR,MAJOR
         ORDER BY MAJOR,AV DESC
     )B
WHERE ROWNUM <= CASE MAJOR WHEN '물리' THEN 3
                           WHEN '생물' THEN 6
                           WHEN '식영' THEN 9
                           WHEN '유공1' THEN 12
                           WHEN '화학' THEN 15
    END
UNION ALL
SELECT ROWNUM,
       B.SNO,
       B.SNAME,
       B.MAJOR,
       B.SYEAR,
       B.AV
FROM (
         SELECT SNO,
                SNAME,
                MAJOR,
                SYEAR,
                ROUND(AVG(RESULT),2) AV
         FROM STUDENT
                  NATURAL JOIN SCORE
         GROUP BY SNO, SNAME,SYEAR,MAJOR
         ORDER BY SYEAR, AV DESC
     )B
WHERE ROWNUM <= CASE SYEAR WHEN 1 THEN 3
                           WHEN 2 THEN 6
                           WHEN 3 THEN 9
                           WHEN 4 THEN 12
    END;

--4) 기말고사 성적이 높은 과목을 담당하는 교수 3인을 검색하세요.
--(교수이름, 과목명, 평균점수 검색)
SELECT ROWNUM,
       PNO,
       PNAME,
       CNAME,
       AVG
    FROM (
        SELECT PNO,
               PNAME,
               CNAME,
               ROUND(AVG(RESULT),2) AVG
            FROM PROFESSOR
            NATURAL JOIN COURSE
            NATURAL JOIN SCORE
            GROUP BY PNO, PNAME, CNAME
            ORDER BY AVG DESC
         )
WHERE ROWNUM <= 3;

--5) 교수별로 현재 수강중인 학생의 수를 검색하세요.
    SELECT PNO,
        PNAME,
        CNO,
        COUNT(*)
        FROM PROFESSOR
        NATURAL JOIN COURSE
        NATURAL JOIN SCORE
        GROUP BY PNO, PNAME, CNO;

