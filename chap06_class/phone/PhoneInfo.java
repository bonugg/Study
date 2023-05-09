package chap06_class.phone;

import java.io.*;

public class PhoneInfo {
    //이름 100개와 전화번호 100개를 담을수 있는 배열 2개(String)
    String[] name = new String[100]; //  ss   aa  33
    String[] phoneNum = new String[100];// 11  22  33
    int cnt = 0;

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public String[] getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String[] phoneNum) {
        this.phoneNum = phoneNum;
    }

    //배열의 현재 인덱스를 담고 있을 변수
    int currentIndex = 0;

    //전달받은 이름과 전화번호를 저장하는 메소드
    //insertPhoneNum
    public void insertPhoneNum(String name, String PhoneNum) {
        this.name[currentIndex] = name;
        this.phoneNum[currentIndex] = PhoneNum;
        currentIndex++;
    }


    //저장된 모든 이름과 전화번호를 출력하는 메소드
    //printAllPhoneNum
    //ex) 이름 : 홍길동1, 전화번호 : 11111111111
    //    이름 : 홍길동2, 전화번호 : 22222222222
    //    이름 : 홍길동3, 전화번호 : 33333333333
    //    이름 : 홍길동4, 전화번호 : 44444444444
    public void printAllPhoneNum() {
        for (int i = 0; i < currentIndex; i++) {
            System.out.println("이름 : " + name[i] +
                    " , 전화번호 : " + phoneNum[i]);
        }
    }

    //전달받은 인덱스의 해당하는 이름과 전화번호를 출력하는 메소드
    //printPhoneNum
    //ex) 이름 : 홍길동3, 전화번호 : 33333333333
    public void printPhoneNum(int index) {
        if (name[index - 1] == null) {
            System.out.println("해당 인덱스의 정보가 존재하지 않습니다.");
        } else {
            System.out.println("이름 : " + name[index - 1] +
                    ", 전화번호 : " + phoneNum[index - 1]);
        }
    }

    public String read() {
        String returnStr = "";
        try {
            if (this.cnt == 0)
                System.out.println("정보 불러오기 성공");

            Reader reader = new FileReader(
                    "D:/bitcamp/JavaLec" +
                            "/JavaProgramming/src/" +
                            "chap06_class/phone.txt");
            BufferedReader brd = new BufferedReader(reader);

            while (true){
                //성능 향상 보조스트림의 readLine() 사용해서 문자열을 한줄씩 읽어오기
                String line = brd.readLine();

                //line이 null이면 다음 값이 없다. while문 종료
                if(line == null)
                    break;

                this.name[currentIndex] = line.split(" ")[0];
                this.phoneNum[currentIndex++] = line.split(" ")[1];
            }
            brd.close();


        } catch (IOException e) {
            if (this.cnt == 0)
                System.out.println("저장된 정보가 없습니다.");
        }
        return returnStr;

    }

    public void write() {
        try {
            for (int i = currentIndex; i < this.name.length; i++) {
                if (this.name[i] == null) {
                    break;
                } else {
                    if(i==0){
                        OutputStream os = new FileOutputStream(
                                "D:/bitcamp/JavaLec" +
                                        "/JavaProgramming/src/" +
                                        "chap06_class/phone.txt");
                        Writer writer =
                                new OutputStreamWriter(os, "UTF-8");
                        writer.write("");
                        writer.flush();
                        writer.close();

                    }
                    OutputStream os = new FileOutputStream(
                            "D:/bitcamp/JavaLec" +
                                    "/JavaProgramming/src/" +
                                    "chap06_class/phone.txt", true);
                    Writer writer =
                            new OutputStreamWriter(os, "UTF-8");
                    String tn = this.name[i] + " ";
                    String tp = this.phoneNum[i] + " ";

                    writer.write(tn);
                    writer.write(tp+"\r\n");

                    writer.flush();
                    writer.close();
                }
            }
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }

}
