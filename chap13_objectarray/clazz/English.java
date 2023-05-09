package chap13_objectarray.clazz;

public class English extends SubjectCntTime implements ILecture {
	
	public English(String subject, 
			int studentCnt, int lectureTime) {
		super(subject, studentCnt, lectureTime);
	}
	
	@Override
	public void proceedLecture() {
		// TODO Auto-generated method stub
		System.out.println(this.getSubject() + 
				"수업을 " + this.getStudentCnt() +
				"명의 학생이 듣습니다. 수업시간은 " + 
				this.getLectureTime() + "분입니다.");
	}

}
