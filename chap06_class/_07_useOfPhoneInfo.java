package chap06_class;

import java.io.*;
import java.nio.channels.NonWritableChannelException;
import java.util.Scanner;

import chap06_class.phone.PhoneInfo;

public class _07_useOfPhoneInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			PhoneInfo phoneInfo = new PhoneInfo();

			Scanner sc = new Scanner(System.in);
			phoneInfo.read();

			//switch~case문에서 break; 시 switch~case만 종료되기
			//때문에 while문을 종료시킬 플래그
			boolean isExit = false;

			while (true) {
				System.out.println("-----연락처 목록-----");
				System.out.println("1. 정보 입력");
				System.out.println("2. 모든 정보 출력");
				System.out.println("3. 인덱스로 정보 검색");
				System.out.println("4. 저장");
				System.out.println("5. 종료");

				//nextInt는 enter 값을 처리하지 못하기 때문에
				//숫자 입력 후 엔터를 누르면 엔터값이 남아있다.
				int userInput = sc.nextInt();

				switch (userInput) {
					case 1:
						System.out.print("이름을 입력하세요. : ");
						String name = sc.next();
						sc.nextLine();
						System.out.print("번호를 입력하세요. : ");
						String phoneNum = sc.nextLine();

						phoneInfo.insertPhoneNum(name, phoneNum);
						break;
					case 2:
						phoneInfo.printAllPhoneNum();
						break;
					case 3:
						while (true) {
							System.out.print("조회하고 싶은 번호를 입력하세요.(1~100)");
							int index = sc.nextInt();

							if (index < 1 || index > 100) {
								System.out.println("1~100 안의 값을 입력하세요.");
								continue;
							} else {
								phoneInfo.printPhoneNum(index);
								break;
							}
						}
						break;
					case 4:
						phoneInfo.write();
						break;
					case 5:
						isExit = true;
						break;
					default:
						System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
						continue;
				}

				if (isExit) {
					break;
				}
			}

			sc.close();
	}
}
