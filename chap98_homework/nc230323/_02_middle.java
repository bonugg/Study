package chap98_homework.nc230323;

import java.util.Scanner;

public class _02_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		1. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
//	    비어있는 바이트의 공간을 b, i, t가 반복되어 들어가도록 모두 채우세요.
		StringBuffer sb1 = new StringBuffer(30);
		sb1 = sb1.append("hello");
		
		int len = sb1.capacity() - sb1.length();
		
		for(int i = 0; i < len; i++) {
			if(i % 3 == 0) {
				sb1 = sb1.append("b");
			} else if(i % 3 == 1) {
				sb1 = sb1.append("i");
			} else if(i % 3 == 2) {
				sb1 = sb1.append("t");
			}
		}
		
		System.out.println(sb1);

//		2. "유용한 클래스는 많다. 다양한 라이브러리를 활용한다."라는 문자열이 있을때
//		     사용자가 정수를 입력하고 문자열을 거꾸로 만든 문자열의 정수 인덱스의 문자를 출력하세요.
		StringBuffer sb2 = new StringBuffer("유용한 클래스는 많다. 다양한 라이브러리를 활용한다.");
		
		sb2 = sb2.reverse();
		
		System.out.print("정수를 하나 입력하세요.");
		int inputNum1 = sc.nextInt();
		
		System.out.println(sb2.charAt(inputNum1));
		
//		3. 처음에 은행에 맡긴 돈은 10000원입니다
//		   금리는 연 10%입니다
//		   복리이자로 계산했을 때 10년후 얼마가 될까요?
		int money = 10000;
		
		for(int i = 1; i <= 10; i++) {
			//money + money * 0.1 => money * (1 + 0.1)
			money *= 1.1;
		}
		
		System.out.println("10년 후 금액 : " + money);
		
//		4. 재귀메소드를 이용해 사용자가 입력한 숫자까지의 합을 구하시오.
		System.out.print("정수를 하나 입력하세요.");
		int inputNum2 = sc.nextInt();
		
		System.out.println("1부터 " + inputNum2 + "까지의 합 : " + sum(inputNum2));
		
		sc.close();
	}
	
	static int sum(int n) {
		if(n == 0) {
			return 0;
		} else {
			return n + sum(n - 1);
		}
	}
}
