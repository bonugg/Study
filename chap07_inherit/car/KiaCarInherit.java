package chap07_inherit.car;

public class KiaCarInherit extends Car {
	public int aaa;
	/*
	public KiaCarInherit(String company, 
			String model, String color,
			int pirce, int aaa) {
		super(company, model, color, price);
		this.aaa = aaa;
	}*/
	
	
	public void speedUp() {
		//super.speedUp();
		System.out.println("엑셀을 밟는다.");
	}
	
	public void speedDown() {
		System.out.println("브레이크를 밟는다.");
	}
	
	public void openDoor() {
		
	}
}
