package chap08_static.clazz;

public class Height {
	public void twoHeightSum() {
		int a = 180;
		int b = 176;
		
		String sum = Common.add(a, b, "cm");
		
		System.out.println(sum);
	}
}
