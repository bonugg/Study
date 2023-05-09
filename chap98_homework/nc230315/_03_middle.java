package chap98_homework.nc230315;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _03_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int com = rd.nextInt(3);
		
		System.out.print("가위, 바위, 보 중 하나를 입력하세요. : ");
		String input = sc.nextLine();
		int inputNum = 0;
		
		if(input.equals("가위")) {
			inputNum = 0;
		} else if(input.equals("바위")) {
			inputNum = 1;
		} else if(input.equals("보")) {
			inputNum = 2;
		}
		
		if(com == inputNum) {
			System.out.println("비겼습니다.");
		} else {
			if((inputNum == 0 && com == 2) ||
				(inputNum == 1 && com == 0) ||
				(inputNum == 2 && com == 1)) {
				System.out.println("이겼습니다.");
			} else {
				System.out.println("졌습니다.");
			}
		}
		
		sc.close();
	}

}
