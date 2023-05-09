package chap02_variables;

public class _03_byteType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. byte타입의 변수 선언, 초기화
		byte num1 = -128;
		byte num2 = 127;
		
		//2. 범위를 초과하는 값을 저장하면 에러 발생
		//byte num3 = -129;
		//byte num4 = 128;
		
		//3. 선언된 byte타입의 변수 값을 범위를 
		//초과하는 값으로 증감연산자를 통해 변경했을때
		//증감연산자 ++, --
		//num1++; => num1 = num1 + 1;
		//num1--; => num1 = num1 - 1;
		num1--;
		num2++;
		
		//최소값보다 값이 작아질 경우 최대값(127)부터 다시 시작
		System.out.println(num1);
		
		//최대값보다 값이 커질 경우 최소값(-128)부터 다시 시작
		System.out.println(num2);
		
		
		
		
		
		
	}

}
