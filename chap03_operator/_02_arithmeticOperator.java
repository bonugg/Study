package chap03_operator;

public class _02_arithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 대입연산자
		//왼쪽항에 오른쪽 항의 값을 대입(저장)한다.
		int num1 = 100;
		int num2 = 255;
		int num3 = 313;
		//오른쪽 항에 변수명을 사용해서
		//해당 변수의 값도 대입할 수 있다.
		int num4 = num3;
		
		//2. 산술연산자
		int result;
		
		//덧셈
		result = num1 + num2;
		System.out.println("num1 + num2 = " 
				+ result); //355
		
		//뺄셈
		result = num1 - num2;
		System.out.println("num1 - num2 = " 
				+ result); //-155
	
		//곱셈
		result = num1 * num2;
		System.out.println("num1 * num2 = " 
				+ result); //25500

		//나눗셈
		result = num1 / num2;
		System.out.println("num1 / num2 = " 
				+ result); //0

		//나머지
		result = num1 % num2;
		System.out.println("num1 % num2 = " 
				+ result); //100
		
		//3. 복합대입연산자
		num3 = 100;
		num4 = 15;
		
		num3 += num4; // => num3 = num3 + num4;
		System.out.println("num3 += num4 = " 
				+ num3); //num3 = 115
		
		num3 -= num4; // => num3 = num3 - num4;
		System.out.println("num3 -= num4 = " 
				+ num3); //num3 = 100
		
		num3 *= num4; // => num3 = num3 * num4;
		System.out.println("num3 *= num4 = " 
				+ num3); //num3 = 1500
		
		num3 /= num4; // => num3 = num3 / num4;
		System.out.println("num3 /= num4 = " 
				+ num3); //num3 = 100
		
		num3 %= num4; // => num3 = num3 % num4;
		System.out.println("num3 %= num4 = " 
				+ num3); //num3 = 10
		
		
		
		
		
		
		
	}

}
