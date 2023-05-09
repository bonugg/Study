package chap04_controllstatement;

import java.util.List;
import java.util.Scanner;

public class _06_infiniteWhile {
	List<Integer> intList;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//스캐너 객체
		Scanner sc = new Scanner(System.in);
		//스캐너를 사용할 때
		//next메소드를 혼용하여 사용하는 것은 좋지 않다.
		//nextInt, nextLine
		//하나의 next메소드만 사용하여 형변환을 해주는 것이 낫다.
		while(true) {
			System.out.print("1은 종료. 나머지는 계속 반복 : ");
			String inputStr = sc.nextLine();
			
			if(inputStr.equals("1")) {
				System.out.println("종료되었습니다.");
				break;
			}
			
			System.out.println(inputStr);
		}
	}

}
