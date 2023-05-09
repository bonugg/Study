--1.PL/SQL
SET SERVEROUTPUT ON;

--1-6. 레코드
--레코드는 다양한 데이터타입의 변수를 갖는 데이터들의 집합(자바의 클래스에서 메소드만 빠진 형태랑 비슷)
DECLARE
    --레코드 선언부
    TYPE STU_REC IS RECORD(
        --사용할 다양한 데이터타입의 변수들 선언
        SNO VARCHAR2(8) NOT NULL := '11012',
        SNAME STUDENT.SNAME%TYPE,
        SEX STUDENT.SEX%TYPE,
        SYEAR NUMBER(1, 0) DEFAULT 1,
        MAJOR STUDENT.MAJOR%TYPE,
        AVR STUDENT.AVR%TYPE
    );
    
    --레코드 변수 선언
    STUDENTREC STU_REC;
BEGIN
    STUDENTREC.SNO := '11010';
    STUDENTREC.SNAME := '고기천';
    STUDENTREC.SEX := '남';
    STUDENTREC.MAJOR := '화학';
    STUDENTREC.AVR := 2.5;
    
    DBMS_OUTPUT.PUT_LINE(STUDENTREC.SNO);
    DBMS_OUTPUT.PUT_LINE(STUDENTREC.SNAME);
    DBMS_OUTPUT.PUT_LINE(STUDENTREC.SEX);
    DBMS_OUTPUT.PUT_LINE(STUDENTREC.MAJOR);
    DBMS_OUTPUT.PUT_LINE(STUDENTREC.SYEAR);
    DBMS_OUTPUT.PUT_LINE(STUDENTREC.AVR);
END;
/
    
--레코드를 이용해서 데이터 저장할 테이블 생성
CREATE TABLE STUDENT_RECORD1
AS SELECT * FROM STUDENT;
    
--레코드를 이용해서 데이터 저장
DECLARE
    TYPE STU_REC IS RECORD(
        --데이터가 저장될 테이블의 컬럼의 순서와 타입을 모두 동일하게 맞춰야 한다.
        SNO VARCHAR2(8) NOT NULL := '11012',
        SNAME STUDENT.SNAME%TYPE,
        SEX STUDENT.SEX%TYPE,
        SYEAR NUMBER(1, 0) DEFAULT 1,
        MAJOR STUDENT.MAJOR%TYPE,
        AVR STUDENT.AVR%TYPE
    );
    
    STUDENTREC STU_REC;
BEGIN
    STUDENTREC.SNO := '11011';
    STUDENTREC.SNAME := '문동주';
    STUDENTREC.SEX := '여';
    STUDENTREC.MAJOR := '컴공';
    STUDENTREC.AVR := 4.0;
    
    --인서트
    INSERT INTO STUDENT_RECORD1
    VALUES STUDENTREC;
END;
/

--저장된 데이터 확인
SELECT *
    FROM STUDENT_RECORD1
    WHERE SNO = '11011';

--레코드를 이용한 데이터 수정(UPDATE)
DECLARE
    TYPE STU_REC IS RECORD(
        --데이터가 저장될 테이블의 컬럼의 순서와 타입을 모두 동일하게 맞춰야 한다.
        SNO VARCHAR2(8) NOT NULL := '11012',
        SNAME STUDENT.SNAME%TYPE,
        SEX STUDENT.SEX%TYPE,
        SYEAR NUMBER(1, 0) DEFAULT 1,
        MAJOR STUDENT.MAJOR%TYPE,
        AVR STUDENT.AVR%TYPE
    );
    
    STUDENTREC STU_REC;
BEGIN
    STUDENTREC.SNO := '11011';
    STUDENTREC.SNAME := '문동주';
    STUDENTREC.SEX := '여';
    STUDENTREC.MAJOR := '생물';
    STUDENTREC.AVR := 3.7;
    STUDENTREC.SYEAR := 3;
    
    --데이터 수정
    UPDATE STUDENT_RECORD1
        SET
            --MAJOR = STUDENTREC.MAJOR,
            --AVR = STUDENTREC.AVR,
            --SYEAR = STUDENTREC.SYEAR
            ROW = STUDENTREC
        WHERE SNO = '11011';
END;
/ 
    
SELECT *
    FROM STUDENT_RECORD1
    WHERE SNO = '11011';
    
--레코드안에 레코드변수 선언
DECLARE
    TYPE SCORE_REC IS RECORD(
        CNO SCORE.CNO%TYPE,
        SNO SCORE.SNO%TYPE,
        RESULT SCORE.RESULT%TYPE
    );
    
    TYPE STU_REC IS RECORD(
        SNO VARCHAR2(8) NOT NULL := '11012',
        SNAME STUDENT.SNAME%TYPE,
        SEX STUDENT.SEX%TYPE,
        SYEAR NUMBER(1, 0) DEFAULT 1,
        MAJOR STUDENT.MAJOR%TYPE,
        AVR STUDENT.AVR%TYPE,
        SCOREREC SCORE_REC
    );
    
    STUDENTREC STU_REC;
BEGIN
    SELECT ST.SNO
         , ST.SNAME
         , ST.SEX
         , ST.SYEAR
         , ST.MAJOR
         , ST.AVR
         , SC.CNO
         , SC.SNO
         , SC.RESULT
        INTO STUDENTREC.SNO
           , STUDENTREC.SNAME
           , STUDENTREC.SEX
           , STUDENTREC.SYEAR
           , STUDENTREC.MAJOR
           , STUDENTREC.AVR
           , STUDENTREC.SCOREREC.CNO
           , STUDENTREC.SCOREREC.SNO
           , STUDENTREC.SCOREREC.RESULT
        FROM STUDENT ST
        JOIN SCORE SC
        ON ST.SNO = SC.SNO
        WHERE ST.SNO = '915601'
          AND SC.CNO = '2368';
        
        DBMS_OUTPUT.PUT_LINE(STUDENTREC.SNO);
        DBMS_OUTPUT.PUT_LINE(STUDENTREC.SNAME);
        DBMS_OUTPUT.PUT_LINE(STUDENTREC.SYEAR);
        DBMS_OUTPUT.PUT_LINE(STUDENTREC.MAJOR);
        DBMS_OUTPUT.PUT_LINE(STUDENTREC.AVR);
        DBMS_OUTPUT.PUT_LINE(STUDENTREC.SCOREREC.RESULT);
END;
/
    
--1-7. 연관배열
--동일한 데이터 타입의 데이터들을 모아놓은 자료형
DECLARE
    TYPE NUMBER_ARRAY IS TABLE OF NUMBER
    INDEX BY PLS_INTEGER;
    
    NUM NUMBER:=0;
    
    NUMARR NUMBER_ARRAY;
BEGIN
    LOOP
        NUM := NUM + 1;
        NUMARR(NUM) := NUM;
        EXIT WHEN NUM > 5;
    END LOOP;
    
    DBMS_OUTPUT.PUT_LINE(NUMARR(1));
    DBMS_OUTPUT.PUT_LINE(NUMARR(2));
    DBMS_OUTPUT.PUT_LINE(NUMARR(3));
    DBMS_OUTPUT.PUT_LINE(NUMARR(4));
    DBMS_OUTPUT.PUT_LINE(NUMARR(5));
END;
/

--레코드와 배열을 조합하여 레코드타입의 배열 생성(자바의 객체배열과 비슷)
DECLARE
    TYPE STU_REC IS RECORD(
        --데이터가 저장될 테이블의 컬럼의 순서와 타입을 모두 동일하게 맞춰야 한다.
        SNO VARCHAR2(8) NOT NULL := '11012',
        SNAME STUDENT.SNAME%TYPE,
        SEX STUDENT.SEX%TYPE,
        SYEAR NUMBER(1, 0) DEFAULT 1,
        MAJOR STUDENT.MAJOR%TYPE,
        AVR STUDENT.AVR%TYPE
    );
    
    --레코드 타입의 배열 선언
    TYPE STUDENT_ARRAY IS TABLE OF STU_REC
    INDEX BY PLS_INTEGER;
    
    STUARR STUDENT_ARRAY;
    
    IDX NUMBER := 1;
BEGIN
    LOOP
        STUARR(IDX).SNO := 10000 + IDX;
        STUARR(IDX).SNAME := 'A';
        STUARR(IDX).SYEAR := MOD(IDX, 4) + 1;
        STUARR(IDX).MAJOR := '컴공';
        
        DBMS_OUTPUT.PUT_LINE(STUARR(IDX).SNO);
        DBMS_OUTPUT.PUT_LINE(STUARR(IDX).SNAME);
        DBMS_OUTPUT.PUT_LINE(STUARR(IDX).SYEAR);
        DBMS_OUTPUT.PUT_LINE(STUARR(IDX).MAJOR);
        
        IDX := IDX + 1;
        EXIT WHEN IDX > 10;
    END LOOP;
END;
/

--레코드 연관배열을 이용하여 INSERT
DECLARE
    TYPE STU_REC IS RECORD(
        --데이터가 저장될 테이블의 컬럼의 순서와 타입을 모두 동일하게 맞춰야 한다.
        SNO VARCHAR2(8) NOT NULL := '11012',
        SNAME STUDENT.SNAME%TYPE,
        SEX STUDENT.SEX%TYPE,
        SYEAR NUMBER(1, 0) DEFAULT 1,
        MAJOR STUDENT.MAJOR%TYPE,
        AVR STUDENT.AVR%TYPE
    );
    
    --레코드 타입의 배열 선언
    TYPE STUDENT_ARRAY IS TABLE OF STU_REC
    INDEX BY PLS_INTEGER;
    
    STUARR STUDENT_ARRAY;
    
    IDX NUMBER := 1;
BEGIN
    LOOP
        STUARR(IDX).SNO := 10000 + IDX;
        STUARR(IDX).SNAME := 'A';
        STUARR(IDX).SYEAR := MOD(IDX, 4) + 1;
        STUARR(IDX).MAJOR := '컴공';
        
        INSERT INTO STUDENT_RECORD1
        VALUES STUARR(IDX);
        
        IDX := IDX + 1;
        EXIT WHEN IDX > 10;
    END LOOP;
END;
/
    
    
SELECT *
    FROM STUDENT_RECORD1
    WHERE SNO LIKE '1000%';
    
--ROWTYPE을 이용해서 연관배열 생성
DECLARE
    TYPE STU_ARRAY IS TABLE OF STUDENT%ROWTYPE
    INDEX BY PLS_INTEGER;
    
    IDX NUMBER := 1;
    
    STUARR STU_ARRAY;
BEGIN
    LOOP
        STUARR(IDX).SNO := 20000 + IDX;
        STUARR(IDX).SNAME := 'B' || IDX;
        STUARR(IDX).MAJOR := '소트프웨어';
        STUARR(IDX).SYEAR := MOD(IDX, 4) + 1;
        
        INSERT INTO STUDENT_RECORD1
        VALUES STUARR(IDX);
        
        IDX := IDX + 1;
        EXIT WHEN IDX > 10;
    END LOOP;
END;
/

SELECT *
    FROM STUDENT_RECORD1
    WHERE SNO LIKE '2000%';

--연관배열의 메소드
DECLARE
    TYPE STU_ARRAY IS TABLE OF STUDENT%ROWTYPE
    INDEX BY PLS_INTEGER;
    
    STUARR STU_ARRAY;
BEGIN
    STUARR(1).SNO := 20000 + 1;
    STUARR(1).SNAME := 'B' || 1;
    STUARR(1).MAJOR := '소트프웨어';
    STUARR(1).SYEAR := 1;
    
    STUARR(2).SNO := 20000 + 2;
    STUARR(2).SNAME := 'B' || 2;
    STUARR(2).MAJOR := '소트프웨어';
    STUARR(2).SYEAR := 2;
    
    STUARR(3).SNO := 20000 + 3;
    STUARR(3).SNAME := 'B' || 3;
    STUARR(3).MAJOR := '소트프웨어';
    STUARR(3).SYEAR := 3;
    
    STUARR(10).SNO := 20000 + 10;
    STUARR(10).SNAME := 'B' || 10;
    STUARR(10).MAJOR := '소트프웨어';
    STUARR(10).SYEAR := 4;
    
    --EXISTS 함수는 TRUE/FALSE를 리턴하기때문에 출력하는 매개변수로 사용불가
    --IF나 CASE 조건절에 사용한다.
    --DBMS_OUTPUT.PUT_LINE(STUARR.EXISTS(1));
    DBMS_OUTPUT.PUT_LINE(STUARR.COUNT);
    DBMS_OUTPUT.PUT_LINE(STUARR.FIRST);
    DBMS_OUTPUT.PUT_LINE(STUARR.LAST);
    DBMS_OUTPUT.PUT_LINE(STUARR.PRIOR(10));
    DBMS_OUTPUT.PUT_LINE(STUARR.NEXT(1));
    
    STUARR.DELETE(3);
    
    IF STUARR.EXISTS(3) THEN 
        DBMS_OUTPUT.PUT_LINE('3번 INDEX 있음');
    ELSE
        DBMS_OUTPUT.PUT_LINE('3번 INDEX 없음');
    END IF;
    
    DBMS_OUTPUT.PUT_LINE(STUARR.COUNT);
END;
/

--1-8.커서
--한 행만 조회하는 커서
--쿼리의 결과를 저장하고 있는 커서
DECLARE
    --커서 선언
    CURSOR CURST IS 
        SELECT SNO
             , SNAME
             , MAJOR
             , SYEAR
            FROM STUDENT
            WHERE SNO='915301';
    
    --담아줄 변수 선언
    TYPE STREC IS RECORD(
        SNO VARCHAR2(8),
        SNAME VARCHAR2(20),
        MAJOR VARCHAR2(20),
        SYEAR NUMBER(1, 0)
    );
    
    STUREC STREC;
BEGIN
    OPEN CURST;

    FETCH CURST INTO STUREC;
    
    DBMS_OUTPUT.PUT_LINE(STUREC.SNO);
    DBMS_OUTPUT.PUT_LINE(STUREC.SNAME);
    DBMS_OUTPUT.PUT_LINE(STUREC.MAJOR);
    DBMS_OUTPUT.PUT_LINE(STUREC.SYEAR);

    CLOSE CURST;
END;
/

--여러개의 행을 담고 있는 커서의 처리 방식1
DECLARE
    CURSOR CURST IS
        SELECT SNO
             , SNAME
             , SEX
             , SYEAR
             , MAJOR
             , AVR
            FROM STUDENT
            WHERE SYEAR = 1;
    
    STROW STUDENT%ROWTYPE;
BEGIN
    OPEN CURST;
    
    LOOP
        FETCH CURST INTO STROW;
        
        DBMS_OUTPUT.PUT_LINE(STROW.SNO);
        DBMS_OUTPUT.PUT_LINE(STROW.SNAME);
        DBMS_OUTPUT.PUT_LINE(STROW.SYEAR);
        DBMS_OUTPUT.PUT_LINE(STROW.MAJOR);
        DBMS_OUTPUT.PUT_LINE(CURST%ROWCOUNT);
        
        EXIT WHEN CURST%NOTFOUND;
    END LOOP;
    
    CLOSE CURST;
END;
/
    
--여러행을 담고있는 CURSOR의 FOR 루프 처리
DECLARE
    CURSOR CURST IS
        SELECT SNO
             , SNAME
             , SEX
             , SYEAR
             , MAJOR
             , AVR
            FROM STUDENT
            WHERE SYEAR = 1;
BEGIN
    --자동 OPEN, FETCH, CLOSE 실행
    FOR STROW IN CURST LOOP
        DBMS_OUTPUT.PUT_LINE(STROW.SNO);
        DBMS_OUTPUT.PUT_LINE(STROW.SNAME);
        DBMS_OUTPUT.PUT_LINE(STROW.SYEAR);
        DBMS_OUTPUT.PUT_LINE(STROW.MAJOR);
        DBMS_OUTPUT.PUT_LINE(CURST%ROWCOUNT);
    END LOOP;
END;
/

--커서의 파라미터
--고정된 쿼리 결과가 아닌 유동적인 쿼리의 결과를 커서에 담아준다.
DECLARE
    CURSOR CURST(PARAM_SYEAR NUMBER) IS
        SELECT SNO
             , SNAME
             , MAJOR
             , SYEAR
            FROM STUDENT
            WHERE SYEAR = PARAM_SYEAR;
    
    TYPE STREC IS RECORD(
        SNO STUDENT.SNO%TYPE,
        SNAME STUDENT.SNAME%TYPE,
        MAJOR STUDENT.MAJOR%TYPE,
        SYEAR STUDENT.SYEAR%TYPE
    );
    
    STUREC STREC;
BEGIN
    OPEN CURST(2);
    
    LOOP 
        FETCH CURST INTO STUREC;
        
        EXIT WHEN CURST%NOTFOUND;
        DBMS_OUTPUT.PUT_LINE('--------------------2학년------------------');
        DBMS_OUTPUT.PUT_LINE(STUREC.SNO);
        DBMS_OUTPUT.PUT_LINE(STUREC.SNAME);
        DBMS_OUTPUT.PUT_LINE(STUREC.MAJOR);
        DBMS_OUTPUT.PUT_LINE(STUREC.SYEAR);
    END LOOP;
    
    CLOSE CURST;
    
    OPEN CURST(4);
    
    LOOP 
        FETCH CURST INTO STUREC;
        
        EXIT WHEN CURST%NOTFOUND;
        DBMS_OUTPUT.PUT_LINE('--------------------4학년------------------');
        DBMS_OUTPUT.PUT_LINE(STUREC.SNO);
        DBMS_OUTPUT.PUT_LINE(STUREC.SNAME);
        DBMS_OUTPUT.PUT_LINE(STUREC.MAJOR);
        DBMS_OUTPUT.PUT_LINE(STUREC.SYEAR);
    END LOOP;
    
    CLOSE CURST;
END;
/

--묵시적 커서
--실행된 쿼리문의 결과를 담고있는 커서
--따로 커서를 선언하지 않는다.
BEGIN
    UPDATE STUDENT
        SET
            SYEAR = 0
        WHERE SYEAR = 1;
    
    DBMS_OUTPUT.PUT_LINE(SQL%ROWCOUNT);
END;
/

SELECT *
    FROM STUDENT
    WHERE SYEAR = 0;
    
--1-9. 예외처리
--EXCEPTION으로 예외처리부를 작성한다.
DECLARE 
    VAL_SNO NUMBER;
BEGIN
    SELECT SNAME INTO VAL_SNO
        FROM STUDENT
        WHERE SNO = '915301';
        
    DBMS_OUTPUT.PUT_LINE('예외발생 시 실행안됨');
EXCEPTION
    WHEN VALUE_ERROR THEN
        DBMS_OUTPUT.PUT_LINE('수치가 부적합');
        ROLLBACK;
END;
/

--EXCEPTION으로 예외처리부를 작성한다.
--UPDATE 시 에러발생 처리 ROLLBACK
DECLARE 
    VAL_SNO VARCHAR2(10);
BEGIN
    VAL_SNO := 'A';

    UPDATE STUDENT
        SET
            SYEAR = VAL_SNO
        WHERE SNO = '915301';
        
    DBMS_OUTPUT.PUT_LINE('예외발생 시 실행안됨');
EXCEPTION
    WHEN VALUE_ERROR THEN
        DBMS_OUTPUT.PUT_LINE('값이 부적합');
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('롤백완료');
    WHEN TOO_MANY_ROWS THEN
        DBMS_OUTPUT.PUT_LINE('행이 너무 많음');
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('롤백완료');
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE(SQLCODE);
        DBMS_OUTPUT.PUT_LINE(SQLERRM);
        DBMS_OUTPUT.PUT_LINE('수치가 부적합');
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('롤백완료');
END;
/