package chap11_interface.device;

public class SamsungTv implements Tv {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("삼성티비 화면을 켭니다.");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("삼성티비 전원을 켭니다.");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("삼성티비 전원을 끕니다.");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("삼성티비 스피커를 켭니다.");
	}

	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("삼성티비 " + channel +
				"로 채널을 변경합니다.");
	}

}
