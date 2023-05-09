package chap98_homework.nc230329.clazz;

public class Student {
    private int no; //학생 번호
    private String name; //학생 이름
    private int grade;// 학년

    public Student(){}

    public Student(int no, String name, int grade){
        this.no = no;
        this.name = name;
        this.grade = grade;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void showstinfo(){
        System.out.println("학번 : " + this.no);
        System.out.println("이름 : " + this.name);
        System.out.println("학년 : " + this.grade);
    }

    public double avg(int a, int b, int c){
        return 0;
    }

}
