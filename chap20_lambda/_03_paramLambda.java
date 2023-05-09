package chap20_lambda;

import chap20_lambda.clazz.MulAndDiv;

public class _03_paramLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MulAndDiv mad = new MulAndDiv();
		
		mad.action1(a -> System.out.println(a * a));
		
		mad.action2((a, b) -> {
			System.out.println(a / b);
			System.out.println((a * a) / (b * b));
		});	
	}

}
