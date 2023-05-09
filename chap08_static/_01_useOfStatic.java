package chap08_static;

import chap08_static.clazz.Car;

public class _01_useOfStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3. 클래스 변수와 클래스 메소드의 사용
		//   객체 생성없이 바로 사용가능
		Car.grade = "A";
		Car.printCurrentGrade();
		
		//인스턴스 변수와 메소드는 객체생성없이
		//접근하거나 호출하면 에러가 발생
		//Car.company = "기아";
		//Car.carInfo();
		
		//인스턴스 변수와 인스턴스 메소드는 
		//객체가 생성됐을 때만 사용가능
		Car c = new Car();
		c.company = "현대";
		c.model = "제네시스";
		c.carInfo();
		
		
		
		
		
	}

}
