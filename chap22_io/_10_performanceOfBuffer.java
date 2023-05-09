package chap22_io;

import java.io.*;

public class _10_performanceOfBuffer {
    public static void main(String[] args) {
        try {
            Reader rd = new FileReader("D:/bitcamp/JavaLec" +
                    "/JavaProgramming/src/" +
                    "chap22_io/name, phone.txt");
            BufferedReader brd = new BufferedReader(rd);

            String[] name = new String[100];
            String[] phone = new String[100];
            int index = 0;

            while (true){
                //성능 향상 보조스트림의 readLine() 사용해서 문자열을 한줄씩 읽어오기
                String line = brd.readLine();

                //line이 null이면 다음 값이 없다. while문 종료
                if(line == null)
                    break;

                name[index] = line.split(" ")[0];
                phone[index] = line.split(" ")[1];

                System.out.println(name[index] + " " + phone[index]);
                index++;

            }
            brd.close();

        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        } catch (IOException ie) {
            System.out.println(ie.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
