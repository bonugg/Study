package chap20_lambda;

import chap20_lambda.clazz.UseOfCompareStr;

public class _07_comparStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseOfCompareStr uocs = new UseOfCompareStr();
		
		//uocs.judgeEquals((a, b) -> a.equals(b));
		//uocs.judgeEquals(String :: equals);
		uocs.judgeEquals((a, b) -> {
			return a.equals(String.valueOf(b));
		});
	}
	
}
