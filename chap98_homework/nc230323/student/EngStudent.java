package chap98_homework.nc230323.student;

public class EngStudent extends CommonStat implements Student {

	public EngStudent(int sno, StringBuffer name) {
		super(sno, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void saveInfo(int index, String subject, int score) {
		// TODO Auto-generated method stub
		this.subject[index] = subject;
		this.finalExam[index] = score;
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("학번 : " + this.sno);
		System.out.println("이름 : " + this.name);
		System.out.println("평균 : " + this.getAvg());
		System.out.println("---------------------");
	}

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
