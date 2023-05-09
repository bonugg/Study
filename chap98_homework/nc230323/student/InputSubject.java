package chap98_homework.nc230323.student;

import java.util.Scanner;

public class InputSubject {	
	//과목정보를 입력해주는 메소드
	public void inputSubjectInfo(Scanner sc, Student[] stArr) {
		//기본정보가 있는 학생인지 검사하기 위해 학번을 먼저 받음
		System.out.print("과목과 학점을 입력할 학생의 학번을 입력하세요.");
		int sno = sc.nextInt();
		
		//학번에 대한 기본정보가 없을 떄
		if(stArr[sno - 1] == null) {
			System.out.println("기본정보가 없는 학생입니다.");
		} else {
			//학번에 대한 기본정보가 있을 때
			//해당 학생이 수강한 과목개수를 받아줌
			//과목배열과 점수배열을 과목개수만큼 만들어 주기 위해서
			System.out.print(stArr[sno - 1].getName() 
					+ " 학생이 수강한 강의의 개수를 입력하세요.");
			int cnt = sc.nextInt();
			sc.nextLine();
			
			stArr[sno - 1].initSubScore(cnt);
			
			for(int i = 0; i < cnt; i++) {
				System.out.print("과목을 입력하세요.");
				String subject = sc.nextLine();
				System.out.print("기말고사 점수를 입력하세요.");
				int score = sc.nextInt();
				sc.nextLine();
				stArr[sno - 1].saveInfo(i, subject, score);
			}
			//학생객체
			//학번
			//이름
			//과목배열
			//점수배열
		}
	}
}
