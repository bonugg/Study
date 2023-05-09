package chap22_io;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class _08_readerReadWriter {
    public static void main(String[] args) {
        try {
            Reader reader = new FileReader("D:/bitcamp/JavaLec" +
                    "/JavaProgramming/src/" +
                    "chap22_io/wr01.txt");
            //한 개의 문자씩 입력
            while (true){
                //더 이상 입력받을 문자가 없으면 -1 리턴
                int data = reader.read();

                //더 이상 입력받을 문자가 존재하지 않을 때
                if(data == -1){
                    break;
                }
                System.out.print((char)data+" ");
            }
            reader.close();
            System.out.println("");
            reader = new FileReader("D:/bitcamp/JavaLec" +
                    "/JavaProgramming/src/" +
                    "chap22_io/wr01.txt");

            char[] chArr = new char[255];
            //문자배열로 입력
            while(true){
                int cnt = reader.read(chArr);
                if(cnt==-1){
                    break;
                }
                for (int i = 0; i < cnt; i++) {
                    System.out.print(chArr[i]+" ");
                }
            }
            reader.close();

        } catch (IOException e) {
            e.getMessage();
        }

    }
}
