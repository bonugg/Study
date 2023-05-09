package chap98_homework.nc230405.clazz;

public class Student {
    private int sno;
    private String sName;
    private int score;
    private String grade;

    public Student(int sno, String sName, int score){
        this.sno = sno;
        this.sName = sName;
        this.score = score;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", sName='" + sName + '\'' +
                ", score=" + score +
                ", grade='" + grade + '\'' +
                '}';
    }
}
