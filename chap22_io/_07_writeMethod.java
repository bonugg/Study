package chap22_io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class _07_writeMethod {
    public static void main(String[] args) {
        try {
            Writer writer = new FileWriter("D:/bitcamp/JavaLec" +
                    "/JavaProgramming/src/" +
                    "chap22_io/wr01.txt");

            //문자 하나씩
            char ch1 = 'A';
            writer.write(ch1);
            char ch2 = 'B';
            writer.write(ch2);

            //문자 배열
            char[] chArr = new char[26];
            for (int i=97; i < 122; i++) {
                chArr[i-97] = (char)i;
            }
            writer.write(chArr);

            //문자열
            String str = "가나다라";
            writer.write(str);
            writer.write(str,2,1);

            writer.flush();
            writer.close();

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
