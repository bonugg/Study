package chap10_abstraction.product;

public abstract class Tv {
	public int lastChannel = 1;
	
	//전원을 켜다
	//추상 메소드
	//선언부만 정의하고 구현부는 자식클래스에서 정의
	public abstract void powerOn();
	
	public abstract void powerOff();
	
	public abstract void operate(int channel);
	
	public void moveTo(int channel) {
		System.out.println(channel + "로 이동합니다.");
	}
	
	public void channelUp() {
		lastChannel++;
	}
	
	public void channelDown() {
		lastChannel--;
	}
	
	
	
}
