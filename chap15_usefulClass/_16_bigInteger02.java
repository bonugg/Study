package chap15_usefulClass;

import java.math.BigInteger;

public class _16_bigInteger02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		for(int i = 1; i < 100; i++) {
			System.out.println(i + "! = " + factorial(BigInteger.valueOf(i)));
			Thread.sleep(500);
		}
	}
	
	static BigInteger factorial(BigInteger n) {
		if(n.intValue() == 0) {
			return BigInteger.ONE;
		} else {
			//재귀메소드(함수) : 메소드안에서 해당 메소드 다시 호출
			return n.multiply(factorial(n.subtract(BigInteger.ONE)));
		}
	}
}
