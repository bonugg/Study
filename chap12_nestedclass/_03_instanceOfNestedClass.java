package chap12_nestedclass;

class NestedClass {
	class Add {
		int num1;
		int num2;
		
		int result;
		final static int num5 = 10;
		
		int add() {
			result = num1 + num2;
			return result;
		}
	}
	
	static class Sub {
		static int num3;
		static int num4;
		
		static int result1;
		static int sub() {
			result1 = num3 - num4;
			return result1;
		}
	}
}

public class _03_instanceOfNestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 정적 중첩 클래스의 사용
		NestedClass.Sub.num3 = 10;
		NestedClass.Sub.num4 = 5;
		System.out.println(NestedClass.Sub.sub());
		
		//2. 인스턴스 중첩 클래스의 사용
		//2-1. 외부클래스의 객체를 생성
		NestedClass nc = new NestedClass();
		
		//2-2. 중첩 클래스의 객체 생성
		NestedClass.Add add = nc.new Add();
		add.num1 = 12;
		add.num2 = 11;
		System.out.println(add.add());
		//final static으로 선언된 상수는
		//객체없이도 접근 가능
		System.out.println(NestedClass.Add.num5);
		
		
		
		
		
		
		
	}

}
