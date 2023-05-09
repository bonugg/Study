package chap07_inherit.car;

public class KiaCar {
	public String company;
	public String model;
	public String color;
	public int price;
	
	public void carInfo() {
		System.out.println("제조사: " + company);
		System.out.println("모델: " + model);
		System.out.println("색상: " + color);
		System.out.println("가격: " + price);
	}
	
	public void speedUp() {
		System.out.println("엑셀을 밟는다.");
	}
	
	public void speedDown() {
		System.out.println("브레이크를 밟는다.");
	}
}
