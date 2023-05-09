package chap98_homework.nc230329.clazz;

public class GradeOne extends Student {
    Student st = new Student();
    private int java;
    private int network;
    private int c_lang;

    public GradeOne() {
    }

    public GradeOne(int no, String name, int grade, int java, int network, int c_lang) {
        super(no, name, grade);
        this.java = java;
        this.network = network;
        this.c_lang = c_lang;
    }

    public void showstinfo() {
        super.showstinfo();
        System.out.println("자바 점수 : " + this.java);
        System.out.println("네트워크 점수 : " + this.network);
        System.out.println("C언어 점수 : " + this.c_lang);
    }

    public double avg(int java, int network, int c_lang) {
        return (java + network + c_lang) / 3.0;
    }
}
