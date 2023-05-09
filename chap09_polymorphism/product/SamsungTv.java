package chap09_polymorphism.product;

public class SamsungTv extends Tv {
	public void powerOn() {
		System.out.println("제조사 : samsung");
		super.powerOn();
	}
	
	public void powerOff() {
		System.out.println("제조사 : samsung");
		super.powerOff();
	}
	
	public void operate(int channel) {
		super.operate(channel);
	}
}
