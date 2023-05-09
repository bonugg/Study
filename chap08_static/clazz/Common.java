package chap08_static.clazz;

public class Common {
    static String add(int num1, int num2, String unit) {
		String result = (num1 + num2) + unit;
		
		return result;
	}
	
	public  String sub(int num1, int num2, String unit) {
		String result = (num1 - num2) + unit;
		
		return result;
	}
}
