package chap98_homework.nc230320.games;

import java.util.Scanner;

public class NumBaseball extends GamesClass {
	//1. 필요한 변수들 선언
	//스트라이크와 볼의 개수를 세어줄 변수
	private int strike = 0;
	private int ball = 0;
	
	//게임 회수(사용자가 입력할 때마다 1씩 증가)
	private int gameCnt = 0;
	
	//컴퓨터 랜덤 값 3개 저장할 배열(중복 불가능)
	private int[] com = new int[3];
	
	//유저가 입력한 3개 값 저장할 배열(중복 불가능)
	private int[] user = new int[3];
	
	//입력값 받을 스캐너
	private Scanner sc = new Scanner(System.in);
	
	//게임 시작 메소드
	public void start() {
		//2. 랜덤 값 3개 생성(중복되면 다시 생성하도록 처리)
		//중복처리 방식 : 0번째 인자 값은 검사 X, 1번째 인자 값부터 검사
		//현재 입력된 인덱스의 값이랑 전에 입력된 모든 값 비교 같은 게 나오면
		//i--, 다시 for문으로 돌아가도록
		//generateRandom메소드에서 com배열에 랜덤 값 3개 담아줌
		generateRandom();
		
		//com 배열 확인
		System.out.println(com[0] + ", " + com[1] + ", " + com[2]);
		
		//3. 사용자 입력 값 3개 받아서 user배열에 저장
		//gameCnt++; 회수 증가
		//3스트라이크가 될 때 까지 반복되도록 while 무한루프로 감싸줌
		while(true) {
			//사용자가 다시 입력하기 전에 strike와 ball 0으로 초기화
			//초기화 안하면 이전 입력된 값의 strike, ball의 값을 가지고있음
			strike = 0;
			ball = 0;
			
			//사용자 입력 값 3번 받아서 user배열에 담아줌
			getUserInput();
			
			//사용자 입력 값 확인
			System.out.println(user[0] + ", " + user[1] + ", " + user[2]);
			
			//judgeStrike 메소드에서 strike가 3이상일 경우
			//true를 리턴하기 때문에 if문의 메소드가 true일 때는
			//무조건 strike가 3이상이다 => 게임종료
			//strike < 3 => 다시 사용자 값 입력받기(while문으로 돌아가기)
			if(judgeStrike()) {
				break;
			} else {
				continue;
			}
		
		}
	}
	
	//랜덤 값 3개 생성해서 com배열에 담아주는 메소드(중복체크)
	//전역변수인 com배열에 값을 담아주므로 리턴 값이 없는 void
	//generateRandom
	public void generateRandom() {
		for(int i = 0; i < com.length; i++) {
			com[i] = (int)(Math.random() * 9) + 1;
			
			//중복체크
			//checkUplicate() 메소드의 결과가 true일 때
			if(i > 0) {
				if(checkDuplicate(com, i)) {
					//중복일 경우
					i--;
					continue;
				}
			}
		}
	}
	
	
	//사용자 입력 값 받아서 user배열에 담아주는 메소드(중복체크)
	//전역변수인 user배열에 값을 담아주므로 리턴 값이 없는 void
	//getUserInput
	public void getUserInput() {
		for(int i = 0; i < user.length; i++) {
			System.out.println("1 ~ 9까지의 정수 하나 입력 : ");
			user[i] = sc.nextInt();
			
			//중복체크
			if(i > 0) {
				if(checkDuplicate(user, i)) {
					i--;
					continue;
				}
			}
		}
		
		//중복값이 없는 온전한 user배열이 완성
		gameCnt++;
	}
	
	
	//중복체크 메소드(리턴 값 boolean으로 true, false)
	//checkDuplicate
	//arr은 com배열이나 user배열을 받아줄 매개변수
	public boolean checkDuplicate(/*int flag,*/ int[] arr, int num) {
		for(int j = 0; j < num; j++) {
			//1. flag 사용 방식
			/*if(flag == 1) {
				if(com[num] == com[j]) {
					return true;
				}
			} else {
				if(user[num] == user[j]) {
					return true;
				}
			}*/
			//2. 서로 다른 배열을 받을 수 있는 변수 사용
			if(arr[num] == arr[j]) {
				//중복된 경우
				return true;
			}
		}
		
		//중복이 안된 경우
		//for문안의 if문을 타지 않으면 결국 for문 밖까지 나오게 된다.
		return false;
	}
	
	
	//스트라이크/볼 판정, 스트라이크/볼 출력,
	//스트라이크 개수로 계속 입력인지 게임종료인지 판단해주는 메소드
	//(리턴 값 boolean으로 true, false) 
	//strike < 3 return false; else return ture;
	//judgeStrike
	public boolean judgeStrike() {
		//스트라이크/볼 판정
		for(int i = 0; i < com.length; i++) {
			for(int j = 0; j < user.length; j++) {
				if(com[i] == user[j]) {
					if(i == j)
						strike++;
					else
						ball++;
				}
			}
		}
		
		//스트라이크/볼 출력
		System.out.println(strike + "스트라이크, " + ball + "볼");
		
		//스트라이크 개수에 따른 리턴
		if(strike < 3) {
			return false;
		} else {
			System.out.println(gameCnt + "회만에 맞추셨습니다.");
			return true;
		}
	}
	
	
	
	
}
