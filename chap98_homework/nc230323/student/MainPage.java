package chap98_homework.nc230323.student;

import java.util.Scanner;

public class MainPage {
	//메인메뉴 출력 메소드
	public void printMenu(Scanner sc, Student[] stArr) {
		System.out.println("------학적관리------");
		System.out.println("1. 학생정보 입력");
		System.out.println("2. 학생정보 검색");
		System.out.println("3. 학생정보 전체출력");
		System.out.println("4. 학과별 성적 순위");
		System.out.println("5. 종료");
		
		selectMenu(sc, stArr);
	}
	
	//메뉴 선택 메소드
	public void selectMenu(Scanner sc, Student[] stArr) {
		//학생정보 입력 객체
		InputStudentInfo ipStInfo = new InputStudentInfo();
		//학생정보 출력 객체
		PrintStInfo prStInfo = new PrintStInfo();
		//학과별 성적 순위 출력 객체
		PrintStRank pStRank = new PrintStRank();
		
		while(true) {
			System.out.print("메뉴를 고르세요.");
			
			int selMenu = sc.nextInt();
			boolean isCorrect =  true;
			
			switch(selMenu) {
				case 1:
					//학생정보 입력 객체의 메소드 호출
					//기본정보 입력할 건지 과목정보 입력할 건지
					//선택하게 해주는 메소드
					ipStInfo.printInpuMode(sc, stArr);
					break;
				case 2:
					System.out.print("검색할 학생의 학번을 입력하세요.");
					int sno = sc.nextInt();
					prStInfo.searchSt(sno, stArr);
					break;
				case 3:
					System.out.println("전체 학생의 정보를 출력합니다.");
					prStInfo.printAllStInfo(stArr);
					break;
				case 4:
					pStRank.makeMajorArr(stArr);
					break;
				case 5: 
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				default:
					System.out.println("잘못 입력하셨습니다.");
					isCorrect = false;
					continue;
			}
			
			if(isCorrect) {
				break;
			}
		}
	}
}
