package chap08_static.clazz;

public class Weight {
	public void twoWeightKgSum() {
		int a = 76;
		int b = 65;
		
		Common com = new Common();
		
		String sum = com.add(a, b, "kg");
		System.out.println(sum);
	}
	
	public void twoWeightGramSum() {
		int a = 76;
		int b = 65;
		
		Common com = new Common();
		
		String sum = com.sub(a * 1000, b * 1000, "g");
		System.out.println(sum);
	}
}
