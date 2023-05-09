package chap98_homework.nc230320.mammal;

public class Lion extends Cat{
	Lion() {
		super("사자");
	}
	
	public void hunt() {
		System.out.println(this.race + "는(은) 사냥을 합니다.");
	}
}
