package chap07_inherit.animal;

public class Animal {
	public int age;
	public int size;
	public int legCnt;
	public boolean hasWing;
	
	public Animal() {
		
	}
	
	public Animal(int age, int size, int legCnt,
			boolean hasWing) {
		this.age = age;
		this.size = size;
		this.legCnt = legCnt;
		this.hasWing = hasWing;
	}
	
	public void eat() {
		System.out.println("식사를 한다.");
	}
}
