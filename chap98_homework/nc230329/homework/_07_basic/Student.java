package chap98_homework.nc230329.homework._07_basic;

public class Student {
    //1. 학생의 이름, 학번, 학과를 속성으로 가지고 학생의
    // 정보를 저장하는 메소드와 학생의 정보를 출력하는 메소드를 갖는 학생 클래스를 생성하세요.
    public String name;
    public int stdnum;
    public String dep;


    public void inputStudentInfo(String name, int stdnum, String dep){
        this.name = name;
        this.stdnum = stdnum;
        this. dep = dep;
    }

    public void outputStudentInfo(){
        System.out.println(name);
        System.out.println(stdnum);
        System.out.println(dep);
    }
}
