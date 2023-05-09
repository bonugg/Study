package chap98_homework.nc230315;

import java.util.Scanner;

public class _05_advance02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num >= 1 && num <= 99) {
			int tenNum = num / 10;
			int oneNum = num - tenNum * 10;
			int count = 0;
			
			if(tenNum > 0 && tenNum % 3 == 0) {
				count++;
			}
			
			if(oneNum > 0 && oneNum % 3 == 0) {
				count++;
			}
			
			if(count == 1) {
				System.out.println("박수짝");
			} else if(count == 2) {
				System.out.println("박수짝짝");
			} else {
				System.out.println("3, 6, 9를 찾을 수 없습니다.");
			}
		} else {
			System.out.println("99이하의 수만 입력하세요.");
		}
	
		sc.close();
	}

}
