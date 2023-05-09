package chap04_controllstatement;

import java.util.Scanner;

public class _08_duplicatedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("2~9까지 입력. 0 ,1 종료 : ");
			num = sc.nextInt();
			
			if(num == 0 || num == 1) {
				System.out.println("종료되었습니다.");
				break;
			}
			
			for(int i = 2; i <= num; i++) {
				for(int j = 1; j <= 9; j++) {
					System.out.print(i + " * " + j + " = " + i * j + "\t");
				}
				System.out.println();
			}
		}
	}

}
