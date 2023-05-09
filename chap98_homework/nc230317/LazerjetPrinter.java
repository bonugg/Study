package chap98_homework.nc230317;

public class LazerjetPrinter extends Printer {
	int tonerAmount;
	
	public LazerjetPrinter() {
		this.model = "레이저젯";
		this.company = "LG";
		this.connectType = "USB";
		this.paper = 100;
		this.tonerAmount = 100;
	}
	
	@Override
	public void print() {
		System.out.println(this.company + " " + this.model + "출력합니다.");
		this.paper -= 1;
		this.tonerAmount -= 3;
		System.out.println("출력완료했습니다.");
		System.out.println("남은 용지 : " + this.paper + "남은 토너 :  " + this.tonerAmount + "% 입니다.");
	}
	
	public void turnOn() {
		System.out.println(this.company + " " + this.model + "������ �����ϴ�.");
		System.out.println("���� ���̴� " + this.paper + "�� ��ũ�� " + this.tonerAmount + "% ���ҽ��ϴ�.");
	}
	
	public void turnOff() {
		System.out.println(this.company + " " + this.model + "������ �����ϴ�.");
		System.out.println("���� ���̴� " + this.paper + "�� ��ũ�� " + this.tonerAmount + "% ���ҽ��ϴ�.");
	}
}
