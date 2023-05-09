package chap98_homework.nc230323.student;

public class PrintStRank {
	//학과별 배열을 만들어주는 메소드
	public void makeMajorArr(Student[] stArr) {
		//과별 학생수 새는 정수들
		//학과별 배열을 학생수만큼만 생성하기 위해서
		int mathCnt = 0;
		int engCnt = 0;
		int comCnt = 0;
		
		for(int i = 0; i < stArr.length; i++) {
			if(stArr[i] != null) {
				if(stArr[i].getClass().getSimpleName().equals("MathStudent")) {
					mathCnt++;
				} else if(stArr[i].getClass().getSimpleName().equals("EngStudent")) {
					engCnt++;
				} else if(stArr[i].getClass().getSimpleName().equals("ComStudent")) {
					comCnt++;
				}
			}
		}
		
		//학과별 학생 배열
		MathStudent[] mstArr = {};
		EngStudent[] engArr = {};
		ComStudent[] comArr = {};
		
		//학생수가 1명이라도 있을 때만 동작
		if(mathCnt != 0) {
			mstArr = new MathStudent[mathCnt];
			
			int index = 0;
			
			for(int i = 0; i < stArr.length; i++) {
				if(stArr[i] != null) {
					if(stArr[i].getClass().getSimpleName().equals("MathStudent")) {
						mstArr[index] = new MathStudent(stArr[i].getSno(),
												stArr[i].getName());
										//(MathStudent)stArr[i];
						mstArr[index].subject = stArr[i].getSubject();
						mstArr[index++].finalExam = stArr[i].getScore();
					}
				}
			}
		}
		
		if(engCnt != 0) {
			engArr = new EngStudent[engCnt];
			
			int index = 0;
			
			for(int i = 0; i < stArr.length; i++) {
				if(stArr[i] != null) {
					if(stArr[i].getClass().getSimpleName().equals("EngStudent")) {
						engArr[index] = new EngStudent(stArr[i].getSno(),
								stArr[i].getName());
						engArr[index].subject = stArr[i].getSubject();
						engArr[index++].finalExam = stArr[i].getScore();
					}
				}
			}
		}
		
		if(comCnt != 0) {
			comArr = new ComStudent[comCnt];
			
			int index = 0;
			
			for(int i = 0; i < stArr.length; i++) {
				if(stArr[i] != null) {
					if(stArr[i].getClass().getSimpleName().equals("ComStudent")) {
						comArr[index] = new ComStudent(stArr[i].getSno(),
								stArr[i].getName());
						comArr[index].subject = stArr[i].getSubject();
						comArr[index++].finalExam = stArr[i].getScore();
					}
				}
			}
		}
		//학과별 학생 배열을 성적순위대로 정렬하고 출력하는 메소드
		printRank(mstArr, engArr, comArr);
	}
	
	public void printRank(MathStudent[] mstArr, EngStudent[] engArr, ComStudent[] comArr) {
		//학생이 1명이라도 있을 때 동작
//		if(mstArr.length != 0) {
//			//성적 순위대로 정렬
//			//성적이 높은 사람이 앞으로 성적이 낮은 사람이 뒤로
//			for(int i = 0; i < mstArr.length; i++) {
//				for(int j = 0; j < i; j++) {
//					if(i > 0 && mstArr[i].getAvg() > mstArr[j].getAvg()) {
//						MathStudent temp = mstArr[i];
//						mstArr[i] = mstArr[j];
//						mstArr[j] = temp;
//					}
//				}
//			}
//			
//			//성적순위대로 학생정보 출력
//			for(int k = 0; k < mstArr.length; k++) {
//				System.out.println("------수학과 성적순위------");
//				System.out.println("순위 : " + (k + 1));
//				mstArr[k].printInfo();
//			}
//		}
//		
//		if(engArr.length != 0) {
//			for(int i = 0; i < engArr.length; i++) {
//				for(int j = 0; j < i; j++) {
//					if(i > 0 && engArr[i].getAvg() > engArr[j].getAvg()) {
//						EngStudent temp = engArr[i];
//						engArr[i] = engArr[j];
//						engArr[j] = temp;
//					}
//				}
//			}
//			
//			for(int k = 0; k < engArr.length; k++) {
//				System.out.println("------영어과 성적순위------");
//				System.out.println("순위 : " + (k + 1));
//				engArr[k].printInfo();
//			}
//		}
//		
//		if(comArr.length != 0) {
//			for(int i = 0; i < comArr.length; i++) {
//				for(int j = 0; j < i; j++) {
//					if(i > 0 && comArr[i].getAvg() > comArr[j].getAvg()) {
//						ComStudent temp = comArr[i];
//						comArr[i] = comArr[j];
//						comArr[j] = temp;
//					}
//				}
//			}
//			
//			for(int k = 0; k < comArr.length; k++) {
//				System.out.println("------컴공과 성적순위------");
//				System.out.println("순위 : " + (k + 1));
//				comArr[k].printInfo();
//			}
//		}
		mojorRank(mstArr, "수학");
		mojorRank(engArr, "영어");
		mojorRank(comArr, "컴공");
	}
	
	
	
	public void mojorRank(Student[] stArr, String major) {
		if(stArr.length != 0) {
			//성적 순위대로 정렬
			//성적이 높은 사람이 앞으로 성적이 낮은 사람이 뒤로
			for(int i = 0; i < stArr.length; i++) {
				for(int j = 0; j < i; j++) {
					if(i > 0 && stArr[i].getAvg() > stArr[j].getAvg()) {
						if(major.equals("수학")) {
							MathStudent temp = (MathStudent) stArr[i];
							stArr[i] = stArr[j];
							stArr[j] = temp;
						} else if(major.equals("영어")) {
							EngStudent temp = (EngStudent) stArr[i];
							stArr[i] = stArr[j];
							stArr[j] = temp;
						} else if(major.equals("컴공")) {
							ComStudent temp = (ComStudent) stArr[i];
							stArr[i] = stArr[j];
							stArr[j] = temp;
						}
					}
				}
			}
			
			//성적순위대로 학생정보 출력
			for(int k = 0; k < stArr.length; k++) {
				System.out.println("------" + major + "과 성적순위------");
				System.out.println("순위 : " + (k + 1));
				stArr[k].printInfo();
			}
		}
	}
}
