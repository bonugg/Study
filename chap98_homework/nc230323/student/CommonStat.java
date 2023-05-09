package chap98_homework.nc230323.student;

public class CommonStat {
	//학번
	public int sno;
	//이름
    public StringBuffer name;
    //해당 학생이 수강한 과목배열
    public String[] subject;
    //해당 학생이 수강한 과목의 기말고사 점수배열
	public int[] finalExam;
	
	//학번, 이름만 받아온 생성자
	public CommonStat(int sno, StringBuffer name) {
		this.sno = sno;
		this.name = name;
	}
}
