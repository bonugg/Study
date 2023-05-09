package chap10_abstraction.academy;

public abstract class Academy {
	public int classCnt;
	public int studentCnt;
	public int teacherCnt;
	public int subjectCnt;
	
	public abstract void teach();
	public abstract void solveHomework();
	public abstract void rest();
	public abstract void attend();
}
