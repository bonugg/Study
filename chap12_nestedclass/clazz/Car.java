package chap12_nestedclass.clazz;

public class Car {
	public void speedUp() {
		class Engine {
			int fuelAmount;
			
			public Engine(int fuelAmount) {
				this.fuelAmount = fuelAmount;
			}
			
			public void useFuelAmount() {
				this.fuelAmount -= 10;
			}
		}
		
		Engine eg = new Engine(100);
		eg.useFuelAmount();
		
		System.out.println("연료가 " + eg.fuelAmount 
				+ "% 남았습니다.");
	}
}
