package chap22_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class _12_printStream {
    public static void main(String[] args) {
        try {
            PrintStream ps = new PrintStream(new FileOutputStream(
                    "D:/bitcamp/JavaLec" +
                            "/JavaProgramming/src/" +
                            "chap22_io/print.txt"
            ));
            byte[] byteArr = {1,2,3,4,5,127};
            for (int i = 0; i < byteArr.length; i++) {
                //출력스트림에는 값을 찍어볼 수 있는 기능이 없는데
                //printStream/printWriter를 이용하면 값을 출력 형식으로 같이
                //내보내준다.
                //OutoutStream os = new FileOutputStream("파일)
                //os.print/println() => 이런 기능으 존재x
                //오직 프린트 스트림만 가지고 있다.
                ps.println(byteArr[i]);
            }
            ps.write(byteArr);
            ps.flush();
            ps.close();
        }catch (FileNotFoundException fnfe){
            System.out.println(fnfe.getMessage());
        }catch (IOException ie){
            System.out.println(ie.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
