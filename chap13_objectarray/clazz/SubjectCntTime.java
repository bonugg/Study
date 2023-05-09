package chap13_objectarray.clazz;

public class SubjectCntTime {
	private String subject;
	private int studentCnt;
	private int lectureTime;
	
	public SubjectCntTime(String subject, 
			int studentCnt, int lectureTime) {
		this.subject = subject;
		this.studentCnt = studentCnt;
		this.lectureTime = lectureTime;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getStudentCnt() {
		return studentCnt;
	}

	public void setStudentCnt(int studentCnt) {
		this.studentCnt = studentCnt;
	}

	public int getLectureTime() {
		return lectureTime;
	}

	public void setLectureTime(int lectureTime) {
		this.lectureTime = lectureTime;
	}
}
