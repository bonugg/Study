package chap99_etc.game;

import java.util.Scanner;

public class NumBaseball {
	//게임 룰 : 컴퓨터가 3개(0~9)의 랜덤값을 가지고 
	//        사용자가 3개(0~9)의 숫자를 입력(중복불가능)
	//		  컴퓨터의 3개의 숫자와 사용자의 3개의 숫자를
	//        비교하는 데 숫자만 같으면 볼로 판정
	//        숫자와 위치까지 모두 같으면 스트라이크로 판정
	//        몇 스트라이크 몇 볼인지 출력
	//        3 스트라이크시 몇 회만에 맞췄는지 출력하고 게임종료
	//        다시 게임 진행할 지 물어보고(1: 리스타트, 0: 종료)
	//스트라이크와 볼의 개수를 세어줄 변수
	private int strike = 0;
	private int ball = 0;
	
	//몇 번 맞췄는지 세어줄 변수
	private int gameCnt = 0;
	
	//컴퓨터 랜덤값 담아줄 배열
	int[] com = new int[3];
	
	//사용자 입력값 저장할 배열
	int[] user = new int[3];
	
	Scanner sc = new Scanner(System.in);
	
	//게임 시작 메소드
	public void start() {
		while(true) {
			generateRandom();
			
			//컴퓨터 배열 확인
			System.out.println(com[0] + ", " 
					+ com[1] + ", " + com[2]);
			
			while(true) {
				strike = 0;
				ball = 0;
				
				getUserInput();
				
				//사용자 입력값 확인
				System.out.println(user[0] + ", "
						+ user[1] + ", " + user[2]);
				
				if(judgetStrike()) {
					break;
				} else {
					continue;
				}
			}
			
			if(reGame()) {
				continue;
			} else {
				break;
			}
		}
	}
	
	//컴퓨터 랜덤 값 3개 생성해주는 메소드
	public void generateRandom() {
		for(int i = 0; i < com.length; i++) {
			com[i] = (int)(Math.random() * 10);
			//중복체크
			//true면 중복, false면 중복안됨
			if(i > 0) {
				if(checkDuplicate(com, i)) {
					i--;
					continue;
				}
			}
		}
	}
	
	//중복값 체크 메소드
	public boolean checkDuplicate(int[] arr, int num) {
		boolean isDuplicated = false;
		
		for(int i = 0; i < num; i++) {
			//현재 배열에 저장된 값과 
			//현재 배열에 저장된 값의 인덱스 -1 까지의 
			//값들을 비교
			if(arr[num] == arr[i]) {
				isDuplicated = true;
			}
		}
		
		return isDuplicated;
	}
	
	//유저의 입력값을 받아서 배열에 담아주는 메소드
	public void getUserInput() {
		for(int i = 0; i < user.length; i++) {
			user[i] = sc.nextInt();

			//중복체크
			if(i > 0) {
				if(checkDuplicate(user, i)) {
					i--;
					continue;
				}
			}
		}
		
		gameCnt++;
	}
	
	//스트라이크 볼 판정하는 메소드
	public boolean judgetStrike() {
		for(int i = 0; i < com.length; i++) {
			for(int j = 0; j < user.length; j++) {
				//최소 볼 확보
				if(com[i] == user[j]) {
					if(i == j) {
						//스트라이크 판정
						strike++;
					} else {
						//볼 판정
						ball++;
					}
				}
			}
			
		}
		System.out.println(strike + "스트라이크, " 
				+ ball + "볼");
		
		if(strike == 3) {
			System.out.println(gameCnt + "회만에 맞추셨습니다.");
			return true;
		}
		
		return false;
	}
	
	
	//재게임 여부
	public boolean reGame() {
		boolean isRegame = false;
		
		while(true) {
			System.out.print("다시 게임을 진행하시겠습니까?(1: 재시작, 0: 종료)");
			int regame = sc.nextInt();
			
			if(regame == 1) {
				gameCnt = 0;
				isRegame = true;
				break;
			} else if(regame == 0) {
				break;
			} else {
				System.out.println("잘 못 입력하셨습니다.");
				continue;
			}
		}
		return isRegame;
	}
	
	
}
