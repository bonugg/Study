package chap98_homework.nc230323.student;

public class PrintStInfo {
	public void searchSt(int sno, Student[] stArr) {
		stArr[sno - 1].printInfo();
	}
	
	public void printAllStInfo(Student[] stArr) {
		for(int i = 0; i < stArr.length; i++) {
			if(stArr[i] != null) {
				stArr[i].printInfo();
			}
		}
	}
}
