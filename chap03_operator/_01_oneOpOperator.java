package chap03_operator;

public class _01_oneOpOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 부호연산자
		int num1 = 10;
		
		System.out.println(+num1);
		System.out.println(-num1);
		System.out.println("-----------------");
		
		//2. 전위 증감연산자
		int num2 = 20;
		
		if(++num2 > 20) {
			System.out.println("num2는 20보다 큽니다.");
		}
		//출력값 : 20, num2 : 20
		System.out.println(--num2);
		System.out.println("-----------------");
		
		//3.후위 증감연산자
		int num3 = 20;
		
		if(num3++ > 20) {
			System.out.println("num3는 20보다 큽니다.");
		}
		//출력값 : 21, num3 : 20
		System.out.println(num3--);
		System.out.println("-----------------");
		
		//4. 전위, 후위 증감연산자의 혼합
		int num4 = 40;
		
		//출력값 : 40, num4 : 41
		System.out.println(num4++); 
		//출력값 : 41, num4 : 40
		System.out.println(num4--);
		//출력값 : 41, num4 : 41
		System.out.println(++num4);
		//num4 : 41
		System.out.println(num4);
	}

}
