package chap22_io;

import java.io.*;

public class _09_byteStreamToCharStream {
    public static void main(String[] args) {
        write("aaa");
        write("bbb");
    }
        public static void write(String str) {
            try {
                OutputStream os =
                        new FileOutputStream(
                                "D:/bitcamp/JavaLec" +
                                        "/JavaProgramming/src/" +
                                        "chap22_io/hp01.txt");

                //OutputStreamWriter를 이용해서
                //바이트스트림 -> 문자스트림으로 변환
                Writer writer =
                        new OutputStreamWriter(os, "UTF-8");

                writer.write(str);

                writer.flush();
                writer.close();

            } catch (FileNotFoundException fnfe) {
                fnfe.printStackTrace();
            } catch(IOException ioe) {
                System.out.println(ioe.getMessage());
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
    //inpuStreamReader를 이용해서
//바이트스트림 -> 문자스트림으로 변환해주는 메소드
    public static String read() {
        String returnStr ="";
        try {
            InputStream is =
                    new FileInputStream
                            ("D:/bitcamp/JavaLec" +
                                    "/JavaProgramming/src/" +
                                    "chap22_io/hp01.txt");
            Reader reader = new InputStreamReader(is);
            char[] chArr = new char[4096];

            while (true){
                int cnt = reader.read(chArr);
                if(cnt==-1){
                    break;
                }
                for (int i = 0; i < cnt; i++) {
                    returnStr += String.valueOf(chArr[i]);
                }
            }
        } catch (IOException e) {
            e.getMessage();
        }
        return returnStr;
    }
}


