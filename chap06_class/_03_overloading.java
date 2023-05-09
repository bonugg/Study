package chap06_class;

import chap06_class.calc.Multiple;

public class _03_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiple mul = new Multiple();
		mul.setNum1(4);
		mul.setNum2(3);
		
		System.out.println("매개변수가 없는 multi()");
		System.out.println(mul.multi());
		System.out.println("매개변수가 한 개인 multi()");
		System.out.println(mul.multi(4));
		System.out.println("매개변수가 두 개인 multi()");
		System.out.println(mul.multi(4, 3));
	}

}
