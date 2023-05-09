package chap08_static.clazz;

public class Car {
	//1. static 키워드로 클래스 변수 선언
	public static String grade;
	public String company;
	public String model;
	public String color;
	public int price;
	
	//2. static 키워드로 클래스 메소드 선언
	public static void printCurrentGrade() {
		System.out.println("현재 등급은 " + grade +
				"입니다.");
	}
	
	public void carInfo() {
		System.out.println("제조사 : " + company +
				"\n모델 : " + model);
	}
}
