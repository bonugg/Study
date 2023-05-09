package chap22_io;

import java.io.*;

public class _06_fileCopybyByteStream {
    public static void main(String[] args) {
        String originFileNm = "D:/bitcamp/JavaLec" +
                "/JavaProgramming/src/" +
                "Java/images/LinkedList.jpg";
        String copyFilenm = "D:/bitcamp/JavaLec" +
                "/JavaProgramming/src/" +
                "Java/images/LinkedListCopy.jpg";
        try {
            InputStream is = new FileInputStream(originFileNm);
            OutputStream os = new FileOutputStream(copyFilenm);

//            byte[] readData = new byte[1024];
//            while (true){
//                int cnt = is.read(readData);
//                if(cnt == -1){
//                    break;
//                }
//                os.write(readData);
//
//            }
            //java9 부터는 transferTo 메소드 생김
            is.transferTo(os);

            os.flush();
            is.close();
            os.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
