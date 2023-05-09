package chap09_polymorphism;

import chap09_polymorphism.product.LgTv;
import chap09_polymorphism.product.SamsungTv;
import chap09_polymorphism.product.Tv;

public class _03_withPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 다형성을 이용해 Tv 바꾸기
		//부품만 교체하면 된다.
		Tv tv = new LgTv();
		
		tv.powerOn();
		tv.operate(11);
		tv.powerOff();
		tv.powerOn();
//		Object o = new LgTv();
//		o = new SamsungTv();
//		o = new Tv();
		tv = new SamsungTv();
		tv.powerOn();
		tv.operate(11);
		tv.powerOff();
		tv.powerOn();
		
		//Map<String, Object>
		//{company: ["현대", "기아", "쉐보레"]}
		System.out.println(tv.toString());
		
		
		
		
		
	}

}
