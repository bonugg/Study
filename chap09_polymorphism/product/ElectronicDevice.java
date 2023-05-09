package chap09_polymorphism.product;

public class ElectronicDevice {
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	public void operate(int num) {
		System.out.println("장치를 조작합니다.");
	}
}
