package chap98_homework.nc230317;

public class InkjetPrinter extends Printer {
	int inkAmount;
	
	InkjetPrinter() {
		this.model = "잉크젯";
		this.company = "삼성";
		this.connectType = "USB";
		this.paper = 100;
		this.inkAmount = 100;
	}
	
	@Override
	public void print() {
		System.out.println(this.company + " " + this.model + "출력합니다.");
		this.paper -= 1;
		this.inkAmount -= 5;
		System.out.println("출력완료했습니다.");
		System.out.println("남은 용지 :  " + this.paper + "남은 잉크 : " + this.inkAmount + "% 입니다.");
	}
	
	public void powerOn() {
		System.out.println(this.company + " " + this.model + "������ �����ϴ�.");
		System.out.println("���� ���̴� " + this.paper + "�� ��ũ�� " + this.inkAmount + "% ���ҽ��ϴ�.");
	}
	
	public void powerOff() {
		System.out.println(this.company + " " + this.model + "������ �����ϴ�.");
		System.out.println("���� ���̴� " + this.paper + "�� ��ũ�� " + this.inkAmount + "% ���ҽ��ϴ�.");
	}
}
