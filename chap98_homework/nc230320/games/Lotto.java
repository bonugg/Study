package chap98_homework.nc230320.games;

import java.util.Scanner;

public class Lotto extends GamesClass {
	//당첨번호 담아줄 배열 6개 + 보너스번호 1개
	//인덱스가 0~5: 로또번호, 인덱스 6: 보너스번호
	int[] lottoNum = new int[7];
	
	//사용자 번호 담아줄 배열
	//6개 다 맞을 경우 1등
	//5개 + 보너스 2등
	//5개 3등
	//4개 4등
	//3개 5등
	//나머지는 꽝
	int[] userNum = new int[6];
	
	//맞은 숫자 개수 세는 변수
	int correctCnt = 0;
	
	//보너스번호 맞았는 지 확인하는 변수
	//맞았으면 true로 변경
	boolean bonus = false;
	
	//중복체크에서 사용할 변수(중복판단 변수)
	//boolean isDuplicated = false;
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void start() {
		//랜덤 7개의 값이 lottoNum에 담기고 출력
		generateRandom();
		
		//사용자 입력 값 6개 받아서 userNum에 담아주기
		getUserInput();
		
		//당첨번호와 사용자번호 비교
		compareNum();
		
		//로또 결과 발표
		printResult();
	}
	
	//1~45중 7개의 랜덤 값 lottoNum에 담아주는 메소드
	//lottoNum 출력도 포함
	//void generateRandom
	public void generateRandom() {
		//메소드의 기능
		//1~45까지중 랜덤 7개 배열에 담아줌(중복은 제거)
		for(int i = 0; i < lottoNum.length; i++) {			
			lottoNum[i] = (int)(Math.random() * 45) + 1;
			
			if(i > 0) {
				if(isDuplicate(i, lottoNum)) {
					i--;
					continue;
				}
			}
		}
		
		//로또 당첨번호 출력
		System.out.print("이번 주 로또번호는 ");
		for(int i = 0; i < lottoNum.length; i++) {
			if(i == 6) {
				System.out.println("보너스 번호: " + lottoNum[i]);
			} else {
				System.out.print(lottoNum[i] + ", ");
			}
		}
	}
	
	//1~45까지 사용자 입력 값 6개 받아서 userNum에 담아주는 메소드
	//void getUserInput
	public void getUserInput() {
		//메소드의 기능
		//사용자 입력 값 6개 받기
		for(int i = 0; i < userNum.length; i++) {
			System.out.print("1~45까지의 정수 중 하나를 입력하세요(중복불가).");
			userNum[i] = sc.nextInt();
			
			//1~45외에 값 처리
			if(userNum[i] < 1 || userNum[i] > 45) {
				System.out.println("잘못 입력하셨습니다.");
				i--;
				continue;
			} else {
				//중복체크
				if(i > 0) {
					if(isDuplicate(i, userNum)) {
						i--;
						continue;
					}
				}
			}
		}
	}
	
	//중복체크 메소드
	//중복일 경우 true, 중복아닐 때는 false 리턴
	//boolean isDuplicate
	public boolean isDuplicate(int i, int[] arr) {
		for(int j = 0; j < i; j++) {
			if(arr[i] == arr[j]) {
				System.out.println("중복된 값입니다. 다시 입력하세요.");
				return true;
			}
		}
		
		return false;
	}
	
	
	//당첨번호와 사용자번호 비교해주는 메소드
	//void compareNum
	public void compareNum() {
		for(int i = 0; i < lottoNum.length; i++) {
			for(int j = 0; j < userNum.length; j++) {
				//로또번호 인덱스가 i인 값 한 개와 사용자번호 0~5까지의
				//6개랑 전부 비교
				if(lottoNum[i] == userNum[j]) {
					//인덱스가 6(보너스번호)가 맞았는지
					if(i == 6) {
						bonus = true;
					} else {
						//보너스를 번호를 제외한 번호가 맞았는지
						correctCnt++;
					}
				}
			}
		}
	}
	
	//등수출력 메소드
	//void printResult
	public void printResult() {
		if(correctCnt == 6) {
			System.out.println("1등입니다.");
		} else if(correctCnt == 5) {
			if(bonus) {
				System.out.println("2등입니다.");
			} else {
				System.out.println("3등입니다.");
			}
		}  else if(correctCnt == 4) {
			System.out.println("4등입니다.");
		}  else if(correctCnt == 3) {
			System.out.println("5등입니다.");
		} else {
			System.out.println("꽝입니다.");
		}
	}
	
	
	
	
}
