package chap15_usefulClass;

public class _06_stringBuffer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1 = new StringBuffer("bitcamp");
		StringBuffer sb2 = new StringBuffer("bitcamp");
		
		System.out.println(sb1 == sb2);
		//equals()가 오버라이딩되어 있지 않아서
		//문자열의 값을 비교할 수 없다.
		System.out.println(sb1.equals(sb2));
		
		//문자열로 변환해서 값을 비교한다.
		String str1 = sb1.toString();
		String str2 = sb2.toString();
		
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str2);
		
		
		
	}

}
