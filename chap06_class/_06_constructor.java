package chap06_class;

import chap06_class.car.Car;

public class _06_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		Car car2 = new Car("현대");
		Car car3 = new Car("현대", "제네시스");
		Car car4 = new Car("현대", "아반떼", "검정");
		Car car5 = new Car("기아", "k9", "파란", 4000);
				
		car1.carInfo();
		System.out.println("----------------");
		car2.carInfo();
		System.out.println("----------------");
		car3.carInfo();
		System.out.println("----------------");
		car4.carInfo();
		System.out.println("----------------");
		car5.carInfo();
				
				
				
				
	}

}
