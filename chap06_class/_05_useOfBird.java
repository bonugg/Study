package chap06_class;

import chap06_class.animal.Bird;

public class _05_useOfBird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird = new Bird("참새", "모이");
		Bird eagle = new Bird("독수리", "뱀");
		Bird dakdulgi = new Bird("닭둘기", "잡식");
		//bird.name = "참새";
		//bird.food = "모이";
		Bird b = new Bird();
		//bird.fly(2, 3, "aa");
		//bird.cry();
		bird.eat();
		eagle.eat();
		dakdulgi.eat();
	}

}
