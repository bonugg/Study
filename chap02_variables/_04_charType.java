package chap02_variables;

public class _04_charType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. char타입의 변수 선언, 초기화
		//유니코드의 값을 알 때는 유니코드의 값을 저장해도 된다.
		char ch1 = 'A';
		char ch2 = 65;
		char ch3 = '\u0041';
		
		System.out.println(ch1 + ", " + ch2 +
				", " + ch3);
		
		//2. 유니코드 값을 모르는 문자의 유니코드를 추출하는 방법
		int uniCode = '자';
		
		System.out.println(uniCode);
		
		//3. char타입에서 빈 칸을 변수에 저장하고 싶을 때는
		//space바로 공백 한 칸을 넣어줘야 한다.
		//완전 빈칸에 대한 유니코드가 존재하지 않기 때문에
		//문자형으로 변환이 불가능하다.
		//char empty = ''; 
		char empty2 = ' ';
	}

}
