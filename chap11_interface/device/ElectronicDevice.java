package chap11_interface.device;

public interface ElectronicDevice {
	void powerOn();
	void powerOff();
	
	default void reset() {
		System.out.println("장치를 리셋합니다.");
	}
	
	static void warn() {
		System.out.println("알람을 울리다.");
	}
}
