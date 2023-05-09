package chap22_io;

import java.io.File;
import java.io.IOException;

public class _14_fileClass {
    public static void main(String[] args) {
        try {
            File newDirectory = new File(
                    "D:/bitcamp/JavaLec" +
                            "/JavaProgramming/src/" +
                            "chap22_io/Test"
            );
            File newFile = new File(
                    "D:/bitcamp/JavaLec" +
                            "/JavaProgramming/src/" +
                            "chap22_io/Test/car.txt"
            );
            if (!newDirectory.exists()) {
                newDirectory.mkdir();
            }
            if (!newFile.exists()) {
                newFile.createNewFile();
            }

            //파일 객체 생성
            File directory = new File(
                    "D:/bitcamp/JavaLec" +
                            "/JavaProgramming/src/" +
                            "chap22_io/Test"
            );
            File deleteFile = new File(
                    "D:/bitcamp/JavaLec" +
                            "/JavaProgramming/src/" +
                            "chap22_io/Test/car.txt"
            );
            File[] fileArr = directory.listFiles();
            for (File f : fileArr) {
                System.out.println(f.getName());
            }
            System.out.println("----------------------------");
            boolean isdelete = deleteFile.delete();
            if (isdelete) {
                System.out.println("파일이 정상적으로 삭제 되었습니다.");
            } else
                System.out.println("파일 삭제에 실패했습니다");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
