package chap98_homework.nc230321.car;

public class HybridCar implements ElectronicCar, FuelCar {
	private int fuel;
	private int battery;
	private int currentMode = 1;
	
	public HybridCar(int fuel, int battery) {
		this.fuel = fuel;
		this.battery = battery;
	}
	
	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		if(currentMode == 1) {
			this.fuel -= 3;
			System.out.println("속도를 높입니다. \n연료가 " + this.fuel + "% 남았습니다.");
		} else {
			this.battery -= 5;
			System.out.println("속도를 높입니다. \n배터리가 " + this.battery + "% 남았습니다.");
		}
	}

	@Override
	public void speedDown() {
		// TODO Auto-generated method stub
		if(currentMode == 1) {
			this.fuel -= 1;
			System.out.println("속도를 줄입니다. \n연료가 " + this.fuel + "% 남았습니다.");
		} else {
			this.battery -= 3;
			System.out.println("속도를 줄입니다. \n배터리가 " + this.battery + "% 남았습니다.");
		}
	}

	@Override
	public void addFuel() {
		// TODO Auto-generated method stub
		System.out.println("주유소에서 연료를 채웁니다.");
		this.fuel = 100;
	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		if(currentMode == 1) {
			this.battery += 1;
			System.out.println("고속주행 시 배터리가 충전됩니다.");
		} else {
			System.out.println("전기 소모 모드에서는 충전되지 않습니다.");
		}
	}
	
	public void changeMode() {
		if(currentMode == 1) {
			currentMode = 2;
			System.out.println("배터리 소모 모드로 전환됩니다.");
		} else {
			currentMode = 1;
			System.out.println("연료 소비 모드로 전환됩니다.");
		}
	}
}
