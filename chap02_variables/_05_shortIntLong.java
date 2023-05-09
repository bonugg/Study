package chap02_variables;

public class _05_shortIntLong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. short타입 변수 선언, 초기화
		short sNum1 = 10;
		short sNum2 = 20;
		
		//2. 자바에서 정수 연산은 기본적으로 4byte인 
		//int형으로 연산되기 때문에 short타입의 변수가
		//int타입으로 변환된 후 연산하고 결과도 int타입으로
		//나온다.
		int result1 = sNum1 + sNum2;
		
		//3. long타입 변수 선언 및 초기화
		long lNum1 = 10L;
		//int의 범위를 넘어가는 리터럴에 L을 붙이지 않으면
		//에러 발생
		//long타입의 리터럴에는 L, l을 항상 붙인다.
		long lNum2 = 10000000000000L;
		
		//4. int보다 바이트 크기가 큰 타입과 연산될 때는
		//4byte로 연산이 되지 않고 바이트 크기가 큰 타입으로
		//변환된 후 연산이 진행된다.
		long result2 = lNum2 + result1;
		
		//L, l을 붙이는 것에 차이는 없다.
		long lNum3 = 100000000000000L;
		long lNum4 = 100000000000000l;
		
		
		
		
		
		
	}

}
