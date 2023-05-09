package chap98_homework.nc230329.clazz;

import java.util.Scanner;

public class InputStudent extends Student{

    public InputStudent(){};
    public InputStudent(int no, String name, int grade){
        super(no, name, grade);
    }

    public InputStudent inputStu(){
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 번호 입력 : ");
        setNo(sc.nextInt());
        System.out.print("학생 이름 입력 : ");
        setName(sc.next());
        while (true){
            System.out.print("학년 입력 : ");
            setGrade(sc.nextInt());
            if(getGrade() == 0 || getGrade() > 3){
                System.out.println("1~3학년 사이로 입력해주세요.");
                continue;
            }
            break;
        }
        return new InputStudent(getNo(), getName(), getGrade());

    }
}
