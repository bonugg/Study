package chap20_lambda;

import chap20_lambda.clazz.UpperCaseInter;

public class _06_referParamMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		action(a -> a.toUpperCase());
		action(String :: toUpperCase);
	}
	
	public static void action(UpperCaseInter uci) {
		String result = 
				uci.allUpperCase("bit");
		
		System.out.println(result);
	}
}
