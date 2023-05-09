package chap99_etc;

import java.util.Random;
import java.util.Scanner;

public class _05_inputNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("1~200사이의 숫자를 입력하세요.(201 : 종료) : ");
		
		Scanner sc = new Scanner(System.in);
		
		//컴퓨터는 변수에 1~200 랜덤값
		Random random = new Random();
		int com;
		
		//재시작 플래그
		boolean regameFlag = false;
		
		com = random.nextInt(200) + 1;
		
		while(true) {
			System.out.println(com);
			//사용자 입력 정수 받기 nextInt
			int input = sc.nextInt();
			
			//201이면 while문 종료
			if(input == 201) {
				System.out.println("종료합니다.");
				break;
			}
			
			//com == input
			//맞췄습니다. 
			//계속 하시겠습니까?
			//1 => com=새로운 1~200까지의 난수, 다시게임 시작
			//0 => 게임종료
			if(com == input) {
				System.out.print("맞췄습니다. 계속하시겠습니까?(1: 다시하기, 0: 종료)");
				
				while(true) {
					int regame = sc.nextInt();
				
					if(regame == 1) {
						com = random.nextInt(200) + 1;
						System.out.print("1~200사이의 숫자를 입력하세요. : ");
						regameFlag = true;
						break;
					} else if(regame == 0) {
						System.out.println("종료합니다.");
						regameFlag = false;
						break;
					} else {
						System.out.println("잘못 입력하셨습니다.");
						continue;
					}
				}
				
				if(!regameFlag) {
					break;
				}
			} else {
				//틀렸습니다. 다시 입력하세요.
				//입력값 다시 받도록
				System.out.print("틀렸습니다. 1~200중에 다시 입력하세요. : ");
				continue;
			}
		}
		
		sc.close();
	}

}
