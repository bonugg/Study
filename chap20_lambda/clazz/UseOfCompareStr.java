package chap20_lambda.clazz;

public class UseOfCompareStr {
	public void judgeEquals(CompareStr cs) {
		boolean result = cs.compareTwoStr("naver", 1000);
		
		if(result == true) {
			System.out.println("두 문자열은 같습니다.");
		} else {
			System.out.println("두 문자열은 다릅니다.");
		}
	}
}
