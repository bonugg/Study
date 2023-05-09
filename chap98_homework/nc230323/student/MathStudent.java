package chap98_homework.nc230323.student;

public class MathStudent extends CommonStat implements Student {
	//부모생성자인 CommonStat(sno, name)을 호출하여
	//학번과 이름이 설정된 학생객체를 만들기 위해서 생성자 정의
	public MathStudent(int sno, StringBuffer name) {
		super(sno, name);
		// TODO Auto-generated constructor stub
	}
	
	//과목배열과 점수배열에 받아온 인덱스 위치에 과목과 점수 저장
	@Override
	public void saveInfo(int index, String subject, int score) {
		// TODO Auto-generated method stub
		this.subject[index] = subject;
		this.finalExam[index] = score;
	}
	
	//학번, 이름, 평균 출력
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("학번 : " + this.sno);
		System.out.println("이름 : " + this.name);
		System.out.println("평균 : " + this.getAvg());
		System.out.println("---------------------");
	}
	
	//점수배열을 이용해서 평균점수 구하는 메소드
	@Override
	public double getAvg() {
		// TODO Auto-generated method stub
		double avg = 0;
		int sum = 0;
		
		for(int i = 0; i < this.finalExam.length; i++) {
			sum += this.finalExam[i];
		}
		
		avg = (double)Math.round(((double)sum / this.finalExam.length) * 100) / 100;
		
		return avg;
	}
	
	//입력한 과목개수로 과목배열과 점수배열을 초기화
	@Override
	public void initSubScore(int cnt) {
		this.subject = new String[cnt];
		this.finalExam = new int[cnt];
	}
	
	@Override
	public int getSno() {
		return this.sno;
	}
	
	@Override
	public StringBuffer getName() {
		return this.name;
	}
	
	@Override
	public String[] getSubject() {
		return this.subject;
	}
	
	@Override
	public int[] getScore() {
		return this.finalExam;
	}

}
