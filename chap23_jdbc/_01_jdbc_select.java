package chap23_jdbc;

import java.sql.*;

public class _01_jdbc_select {
    public static void main(String[] args) {
        //오라클 드라이버 변수 선언 및 사용 클래스 정의
        final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";

        //접속할 데이터베이스 url 지정
        final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";

        //접속할 계정 정보
        final String USER = "c##study";
        final String PASSWD = "1234";

        //커넨션 변수 선언
        Connection conn = null;

        //쿼리 구문 변수 선언
        Statement statement = null;
        try{
            //jdbc 드라이버 클래스 로드
            Class.forName(JDBC_DRIVER);

            //데이터베이스 연결
            conn = DriverManager.getConnection(DB_URL, USER, PASSWD);

            //SQL쿼리 생성
            statement = conn.createStatement();
            //학생번호, 학생 이름, 학생별 평균 기말고사 성적 조회
            String sql = "SELECT ST.SNO,\n" +
                    "ST.SNAME, \n" +
                    "ROUND(AVG(SC.RESULT)) AVG \n" +
                    "FROM STUDENT ST JOIN SCORE SC ON ST.SNO=SC.SNO GROUP BY ST.SNO, ST.SNAME";

            //결과를 담아줄 ResultSet 변수 선언
            //select -> excuteQuery
            //insert, update, delete -> executeUpadate
            ResultSet resultSet = statement.executeQuery(sql);
            //결과 출력
            while (resultSet.next()){
                String sno = resultSet.getString("sno");
                String sname = resultSet.getString("sname");
                String avg = resultSet.getString("AVG");

                System.out.println(sno);
                System.out.println(sname);
                System.out.println(avg);
            }
            //다 쓴 객체들 해제
            resultSet.close();
            statement.close();
            conn.close();

        }catch (SQLException se){
            System.out.println(se.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            if(statement != null){
                try {
                    statement.close();
                }catch (SQLException se){
                    System.out.println(se.getMessage());
                }
            }
            if(conn != null){
                try {
                    conn.close();
                }catch (SQLException se){
                    System.out.println(se.getMessage());
                }
            }
        }
    }
}
