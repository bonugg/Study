package chap20_lambda.clazz;

public class MulAndDiv {
	public void action1(Mul mul) {
		int a = 10;
		
		mul.multiply(a);
	}
	
	public void action2(Div div) {
		int a = 10;
		int b = 5;
		
		div.divide(a, b);
	}
}
