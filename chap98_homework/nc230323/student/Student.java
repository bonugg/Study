package chap98_homework.nc230323.student;

public interface Student {
	//해당 학생의 과목과 점수배열이 있는데
	//과목이랑 점수를 하나씩 저장해주는 메소드
	public void saveInfo(int index, String subject, int score);	
	//학번, 이름, 평균점수 출력하는 메소드
	public void printInfo();
	//점수배열을 이용해서 평균점수를 구해주는 메소드
	public double getAvg();
	//과목배열이랑 점수배열 cnt개수로 초기화해주는 메소드
	public void initSubScore(int cnt);
	//학번 리턴해주는 메소드
	public int getSno();
	//이름 리턴해주는 메소드
	public StringBuffer getName();
	//과목배열 리턴해주는 메소드
	public String[] getSubject();
	//점수배열 리턴해주는 메소드
	public int[] getScore();
}
