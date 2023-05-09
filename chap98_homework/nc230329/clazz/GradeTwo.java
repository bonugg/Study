package chap98_homework.nc230329.clazz;

public class GradeTwo extends Student{
    private int linux;
    private int network_ex;
    private int c_lang_ex;

    public GradeTwo(){}

    public GradeTwo(int no, String name, int grade, int linux, int network_ex, int c_lang_ex){
        super(no, name, grade);
        this.linux = linux;
        this.network_ex = network_ex;
        this.c_lang_ex = c_lang_ex;
    }

    public void showstinfo(){
        super.showstinfo();
        System.out.println("리눅스 점수 : " + this.linux);
        System.out.println("네트워크응용 점수 : " + this.network_ex);
        System.out.println("C언어응용 점수 : " + this.c_lang_ex);
    }
    public double avg(int linux, int network_ex, int c_lang_ex) {
        return (linux + network_ex + c_lang_ex) / 3.0;
    }

}
