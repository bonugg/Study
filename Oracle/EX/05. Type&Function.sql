--1. 단일 함수
--1-1. 문자 함수
--LOWER, UPPER, INITCAP
SELECT DNO
     , LOWER(DNAME)
     , UPPER(DNAME)
     , INITCAP(DNAME)
    FROM DEPT;
    
SELECT * FROM DEPT;

--부서명이 erp인 정보를 조회
--부서명의 대, 소문자를 모를 때
SELECT *
    FROM DEPT
    WHERE LOWER(DNAME) = 'erp';
    
--1-2.문자 연산 함수
--CONCAT
SELECT CONCAT(DNO, ' : ' || DNAME || ' : ' || LOC)
    FROM DEPT;
    
SELECT DNO || ' : ' || DNAME || ' : ' || LOC
    FROM DEPT;

--SUBSTR
--SUBSTR(n, cnt)은 n 번째 글자부터 cnt개를 가져온다.
SELECT * 
    FROM PROFESSOR
    WHERE SUBSTR(ORDERS, 1, 1) = '정';
    
SELECT ENAME
     , SUBSTR(ENAME, 2)    --두 번째 글자부터 모두
     , SUBSTR(ENAME, -2)   --뒤에서 두 번째 글자부터 모두
     , SUBSTR(ENAME, 1, 2) --첫 번째 글자부터 두 글자
     , SUBSTR(ENAME, -2, 2)--뒤에서 두 번째 글자부터 두 글자
    FROM EMP;
    
--LENGTH, LENGTHB
SELECT DNAME
     , LENGTH(DNAME)
     , LENGTHB(DNAME)
    FROM DEPT;

--현재 오라클이 사용준인 문자셋 AL32UTF8 => 한글 3byte
SELECT *
    FROM NLS_DATABASE_PARAMETERS
    WHERE PARAMETER = 'NLS_CHARACTERSET'
       OR PARAMETER = 'NLS_NCHAR_CHARACTERSET';

--INSTR
--DUAL 테이블 : 오라클에서 제공해주는 가상의 기본 테이블
--             간단하게 날짜나 연산 또는 결과값을 보기 위해 사용
--             원래 DUAL 테이블 소유자는 SYS로 되어있는데 모든 USER에서 접근 가능
SELECT INSTR('DATABASE', 'A')      -- 첫 번째 A의 위치
     , INSTR('DATABASE', 'A', 3)   -- 세 번째 글자인 T 다음의 첫 번째 A의 위치
     , INSTR('DATABASE', 'A', 1, 3)-- 첫 번째 글자 D 다음의 세 번째 A의 위치
     , SYSDATE
     , 1 + 2
    FROM DUAL;
    
--TRIM
SELECT TRIM('조' FROM '조병조')           --both 생략, 앞뒤의 조를 제거
     , TRIM(leading '조' FROM '조병조')   --앞에 있는 조 제거
     , TRIM(trailing '조' FROM '조병조')  --뒤에 있는 조 제거
     , TRIM(' 조 병 조 ')                 --공백 제거(앞뒤로 있는 공백만)
    FROM DUAL;
    
--LPAD, RPAD: CHARSET 한글을 3byte로 잡아도 컴퓨터에서는 2byte로 사용하기 때문에
--            한글연산 자체는 2byte로 진행된다.
SELECT LPAD(ENAME, 10, '*') --사원명 앞에 *을 붙여서 총 길이를 10으로 만듬
     , RPAD(ENAME, 10, '*') --사원명 뒤에 *을 붙여서 총 길이를 10으로 만듬
    FROM EMP;
    
--직원이름을 출력하는데 마지막 글자만 제거해서 출력(SUBSTR, LENGTH)
SELECT SUBSTR(ENAME, 1, LENGTH(ENAME) - 1)
    FROM EMP;

--1-3. 문자열 치환 함수
--TRANSLATE, REPLACE
SELECT TRANSLATE('World of Warcraft', 'Wo', '--') --문자 단위로 동작하기 때문에 모든 W, o 치환
     , REPLACE('World of Warcraft', 'Wo', '--') --문자열 단위로 동작하기 때문에 Wo가 치환
    FROM DUAL;

--1-4. 숫자 함수
--ROUND(지정한 자리수까지 반올림)
SELECT ROUND(123.454678, 3)
    FROM DUAL;

--TRUNC(지정한 자리수 뒤의 숫자 버림)
SELECT TRUNC(123.454678, 3)
    FROM DUAL;

--MOD(나머지 값)
SELECT MOD(10, 4)
    FROM DUAL;

--POWER(몇 제곱값)
SELECT POWER(10, 3)
    FROM DUAL;

--CEIL, FLOOR(제일 가까운 정수 값)
SELECT CEIL(2.59)
     , FLOOR(2.59)
    FROM DUAL;
    
--ABS(절대값)
SELECT ABS(10)
     , ABS(-10)
    FROM DUAL;
    
--SQRT(제곱근 값)
SELECT SQRT(9)
     , SQRT(25)
     , SQRT(100)
    FROM DUAL;

--SIGN(부호판단)    
SELECT SIGN(-123)
     , SIGN(52)
     , SIGN(0)
    FROM DUAL;
    
--1-4. 날짜 연산
SELECT SYSDATE
     , SYSDATE + 100   --100일 후의 날짜
     , SYSDATE - 100   --100일 이전의 날짜
     , SYSDATE + 3 / 24--3시간 후의 날짜
     , SYSDATE - 5 / 24--5시간 이전의 날짜
     , SYSDATE - TO_DATE('20220413', 'YYYY/MM/DD') --두 날짜간 차이 일수(시간, 분, 초때문에 정확히 나오지 않음)
     , TRUNC(SYSDATE) - TO_DATE('20220413', 'YYYY/MM/DD')
    FROM DUAL;
    
--1-5. 날짜 함수
--ROUND
SELECT ROUND(SYSDATE, 'mm')
    FROM DUAL;
    
SELECT ROUND(TO_DATE('20230424 00:00:00', 'yyyymmdd HH24:mi:ss'), 'mm')
    FROM DUAL;

--TRUNC
SELECT TRUNC(SYSDATE)
    FROM DUAL;
    
SELECT TRUNC(SYSDATE, 'dd')
    FROM DUAL;
    
--MONTHS_BETWEEN
SELECT MONTHS_BETWEEN(SYSDATE, TO_DATE('2023/02/13', 'yyyy/MM/dd'))
    FROM DUAL;

--ADD_MONTHS
SELECT ADD_MONTHS(SYSDATE, 3)
    FROM DUAL;
    
--NEXT_DAY
SELECT NEXT_DAY(SYSDATE, '수요일')
    FROM DUAL;
    
--LAST_DAY
SELECT LAST_DAY(TO_DATE('20210618', 'yyyyMMdd'))
    FROM DUAL;

ALTER SESSION SET NLS_DATE_FORMAT = 'YYYYMMDD HH:MI:SS';

--사원들의 입사일과 입사 100일후의 날짜와 10년뒤 날짜 조회
SELECT HDATE
     , HDATE + 100
     , ADD_MONTHS(HDATE, 120)
    FROM EMP;

UPDATE STUDENT
    SET SNAME = REPLACE(SNAME, ' ', '');

COMMIT;

--1-6. 변환 함수
--숫자를 문자로 변환 TO_CHAR
SELECT TO_CHAR(100000000, '999,999,999') --9자리까지 숫자를 표기하되 3자리마다 ,를 표출
    FROM DUAL;

SELECT TO_CHAR(1000000, '099,999,999') --9자리까지 숫자를 표기하되 3자리마다 ,를 표출하고 
    FROM DUAL;                         --앞 자리에 0을 붙여서 출력

SELECT TO_CHAR(10000000000, '999,999,999,999,999')
    FROM DUAL;
    
--문자를 숫자로 변환 TO_NUMBER
--형식지정자의 자리수만 잘 지정해서 사용하거나 형식지정자를 지정하지 않고 사용한다. 
SELECT TO_NUMBER('-123.456', '99.999') --문자열 자리수보다 형식지정자는 자리수를 같거나 더 많게 지정해줘야한다.
    FROM DUAL;
    
SELECT TO_NUMBER('123', '999.99')
    FROM DUAL;
    
SELECT TO_NUMBER('1234')
    FROM DUAL;
    
--날짜를 문자로 변환하는 TO_CHAR
--TO_CHAR의 날짜 형식 지정
SELECT TO_CHAR(SYSDATE, 'YYYY/MM/DD')
     , TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS')
     , TO_CHAR(SYSDATE, 'YYYY/MM/DD AM HH:MI:SS')
     , TO_CHAR(SYSDATE, 'YYYYMMDD DAY')
     , TO_CHAR(SYSDATE, '"오늘은 "YYYY"년 "MM"월 "DD"일 " DAY"입니다."') --형식지정자 안에서 문자열을 추가할 때 ""사용
     , TO_CHAR(SYSDATE, 'YYYY"년 " MONTH DD"일"')
    FROM DUAL;

--문자를 날짜로 변환하는 TO_DATE
--날짜 출력 형식인 NLS_DATE_FORMAT 기준으로 출력
SELECT TO_DATE('20211201135123', 'YYYY/MM/DD HH24:MI:SS')
     , TO_DATE('202304141059', 'YYYYMMDD HH24MI')
     , TO_DATE('20230411', 'YYYY-MM-DD')
    FROM DUAL;
    
--TO_DATE 함수로 입사일이 19920201보다 빠른 사원목록 조회
SELECT *
    FROM EMP
    WHERE HDATE < TO_DATE('19920201', 'YYYYMMDD');

--송강교수의 임용일자를 xxxx년 xx월 xx일 xx요일입니다. 조회(TO_CHAR)
SELECT PNO
     , PNAME
     , TO_CHAR(HIREDATE, 'YYYY"년 "MM"월 "DD"일 "DAY"입니다."') AS HIREDATE
    FROM PROFESSOR
    WHERE PNAME = '송강';

--1-7. Null값 처리를 해주는 NVL
SELECT ENO
     , ENAME
     , NVL(COMM, -1) AS COMM
    FROM EMP;

SELECT CNO
     , CNAME
     , NVL(PNO, 0)
    FROM COURSE;

--위 쿼리에서 PROFESSOR와 아우터 조인해서 PNAME이 NULL인 값들은 '교수 배정안됨'이라고 조회
SELECT C.CNO
     , C.CNAME
     , NVL(C.PNO, 0)
     , NVL(P.PNAME, '교수 배정안됨')
    FROM COURSE C
    LEFT JOIN PROFESSOR P
    ON C.PNO = P.PNO;

--1-8. 조건 처리해주는 DECODE
SELECT ENO
     , ENAME
     , JOB
     , SAL
     , DECODE(JOB,
                '개발', SAL * 1.5, --업무가 개발인 사람들
                '경영', SAL * 1.3, --업무가 개발이 아닌 사람들중 업무가 경영인 사람들
                '지원', SAL * 1.1, --업무가 개발, 경영이 아닌 사람들중 업무가 ERP인 사람들
                '분석', SAL,       --업무가 개발, 경영, ERP가 아닌 사람들중 업무가 분석인 사람들
                        SAL * 0.95 --업무가 개발, 경영, ERP, 분석이 아닌 사람들
             ) AS CHANGE_SAL
    FROM EMP;
    
--1-9. 조건 처리해주는 CASE~WHEN
SELECT ENO
     , ENAME
     , JOB
     , SAL
     , CASE JOB
         WHEN '개발' THEN SAL * 1.5 --업무가 개발인 사람들
         WHEN '경영' THEN SAL * 1.3 --업무가 개발이 아닌 사람들중 업무가 경영인 사람들
         WHEN '지원' THEN SAL * 1.1 --업무가 개발, 경영이 아닌 사람들중 업무가 ERP인 사람들
         WHEN '분석' THEN SAL       --업무가 개발, 경영, ERP가 아닌 사람들중 업무가 분석인 사람들
         ELSE SAL * 0.95            --업무가 개발, 경영, ERP, 분석이 아닌 사람들
       END AS CHANGE_SAL --END로 CASE문의 종결을 알림, 별칭을 붙여줌
    FROM EMP;
    
--COMM이 NULL인 사람은 해당사항 없음, COMM이 0인 사람은 '보너스 없음', 나머지 사람들은 '보너스 : ' || COMM
--COMM_TXT, ENO, ENAME, COMM
--CASE ~ WHEN
SELECT ENO
     , ENAME
     , COMM
     , CASE NVL(COMM, -1)
        WHEN 0 THEN '보너스 없음'
        WHEN -1 THEN '해당사항 없음'
        ELSE '보너스 : ' || COMM
      END AS COMM_TXT
    FROM EMP;
    
SELECT ENO
     , ENAME
     , COMM
     , CASE
        WHEN COMM = 0 THEN '보너스 없음'
        WHEN COMM IS NULL THEN '해당사항 없음'
        ELSE '보너스 : ' || COMM
      END AS COMM_TXT
    FROM EMP;

--DECODE
SELECT ENO
     , ENAME
     , COMM
     , DECODE(NVL(COMM, -1),
        0, '보너스 없음',
        -1, '해당사항 없음',
        '보너스' || COMM) AS COMM_TXT
    FROM EMP;

SELECT ENO
     , ENAME
     , COMM
     , DECODE(COMM,
        0, '보너스 없음',
        NULL, '해당사항 없음',
        '보너스' || COMM) AS COMM_TXT
    FROM EMP;
