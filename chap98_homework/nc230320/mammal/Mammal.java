package chap98_homework.nc230320.mammal;

public class Mammal {
	String race;
	
	Mammal() {
		System.out.println(race + "는(은) 포유류과입니다.");
	}
	
	Mammal(String race) {
		this.race = race;
		System.out.println(race + "는(은) 포유류과입니다.");
	}
	
	public void calve() {
		System.out.println(race + "는(은) 새끼를 낳습니다.");
	}
}
