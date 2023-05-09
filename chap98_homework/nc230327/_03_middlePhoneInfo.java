package chap98_homework.nc230327;

import java.util.Scanner;

import chap98_homework.nc230327.phoneinfo.PhoneInfo;

public class _03_middlePhoneInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PhoneInfo phoneInfo = new PhoneInfo();
		
		Scanner sc = new Scanner(System.in);
		
		//switch~case문에서 break; 시 switch~case만 종료되기
		//때문에 while문을 종료시킬 플래그
		boolean isExit = false;
		
		while(true) {
			System.out.println("-----연락처 목록-----");
			System.out.println("1. 정보 입력");
			System.out.println("2. 모든 정보 출력");
			System.out.println("3. 이름으로 정보 검색");
			System.out.println("4. 종료");
			
			//nextInt는 enter 값을 처리하지 못하기 때문에
			//숫자 입력 후 엔터를 누르면 엔터값이 남아있다.
			int userInput = sc.nextInt();
			
			switch(userInput) {
				case 1:
					System.out.print("이름을 입력하세요. : ");
					String name = sc.next();
					sc.nextLine();
					System.out.print("번호를 입력하세요. : ");
					String phoneNum = sc.nextLine();
					
					phoneInfo.insertPhoneInfo(name, phoneNum);
					break;
				case 2:
					phoneInfo.printAllPhoneInfo();
					break;
				case 3:
					while(true) {
						System.out.print("조회하고 싶은 이름을 입력하세요.");
						String searchName = sc.next();
						
						if(!phoneInfo.printPhoneInfo(searchName)) {
							System.out.println("해당 이름의 사람을 찾을 수 없습니다.\n다시 입력하세요.");
							continue;
						}
						
						break;
					}
					break;
				case 4:
					isExit = true;
					break;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
					continue;
			}
			
			if(isExit) {
				break;
			}
		}
		
		sc.close();
	}

}
