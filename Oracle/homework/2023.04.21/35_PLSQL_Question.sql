--1) 과목번호, 과목이름, 교수번호, 교수이름을 담을 수 있는 변수들을 선언하고 
--   유기화학 과목의 과목번호, 과목이름, 교수번호, 교수이름을 출력하세요.
DECLARE
    TYPE PRO IS RECORD(
        PNO PROFESSOR.PNO%TYPE,
        PNAME PROFESSOR.PNAME%TYPE
    );
    TYPE CRS IS RECORD(
        CNO COURSE.CNO%TYPE,
        CNAME COURSE.CNAME%TYPE,
        CRSPRO PRO
    );
    CRSPROA CRS;
BEGIN
    SELECT C.CNO
        , C.CNAME
        , P.PNO
        , P.PNAME
        INTO CRSPROA.CNO
        , CRSPROA.CNAME
        , CRSPROA.CRSPRO.PNO
        , CRSPROA.CRSPRO.PNAME
        FROM COURSE C
        JOIN PROFESSOR P
        ON C.PNO = P.PNO
        WHERE C.CNAME = '유기화학';
        
        DBMS_OUTPUT.PUT_LINE(CRSPROA.CNO);
        DBMS_OUTPUT.PUT_LINE(CRSPROA.CNAME);
        DBMS_OUTPUT.PUT_LINE(CRSPROA.CRSPRO.PNO);
        DBMS_OUTPUT.PUT_LINE(CRSPROA.CRSPRO.PNAME);
END;
/
--2) 위 데이터들을 레코드로 선언하고 출력하세요.


--3) 과목번호, 과목이름, 과목별 평균 기말고사 성적을 갖는 레코드의 배열을 만들고
--   기본 LOOP문을 이용해서 모든 과목의 과목번호, 과목이름, 과목별 평균 기말고사 성적을 출력하세요.
DECLARE
    TYPE SCOR IS RECORD(
        AVG NUMBER(10, 2),
        CNO COURSE.CNO%TYPE,
        CNAME COURSE.CNAME%TYPE
    );
    SC SCOR;

    TYPE SCCN_ARRAY IS TABLE OF SCOR
    INDEX BY PLS_INTEGER;
    
    SCARR SCCN_ARRAY;
    
    IDX NUMBER := 1;
BEGIN
    LOOP
    SELECT CNO
        INTO SC.CNO
        FROM COURSE;

    SCARR(IDX).CNO := SC.CNO + IDX;
            
    DBMS_OUTPUT.PUT_LINE(SCARR(IDX).CNO);
    IDX := IDX + 1;
    EXIT WHEN IDX > 10;
    END LOOP;
END;
/

--4) 학생번호, 학생이름과 학생별 평균 기말고사 성적을 갖는 테이블 T_STAVGSC를 만들고
--   커서를 이용하여 학생번호, 학생이름, 학생별 평균 기말고사 성적을 조회하고 
--   조회된 데이터를 생성한 테이블인 T_STAVGSC에 저장하세요.
        
