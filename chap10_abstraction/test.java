package chap10_abstraction;

import chap10_abstraction.product.LgTv;
import chap10_abstraction.product.Tv;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv tv = new LgTv();
		//추상클래스 자체를 인스턴스화는 불가능
		//Tv tv2 = new Tv();
	}

}
