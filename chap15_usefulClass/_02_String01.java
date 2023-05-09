package chap15_usefulClass;

public class _02_String01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문자열 객체 생성
		String str1 = "bitcamp";
		str1 = "naver"; //새로 객체를 만든다.
		String str2 = new String("bitcamp");
		//이미 생성된 동일한 문자열이 있으면
		//그 문자열을 사용한다.
		//str2 = "naver";
		//문자열을 공유하고 싶지 않으면
		//새로운 문자열을 생성자를 통해 만든다.
		str2 = new String("naver");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		char[] chArr = {'b', 'i', 't', 'c', 'a',
				'm', 'p'};
		
		String str3 = new String(chArr);
		
		//같은 문자열인지 비교
		if(str1.equals(str3) && str2.equals(str3)) {
			System.out.println("str1, str2, str3는"
					+ " 같은 문자열입니다.");
		} else {
			System.out.println("str1, str2, str3는"
					+ " 다른 문자열입니다.");
		}
		
		//문자열에서 해당 인덱스의 문자 확인
		char ch = str1.charAt(4);
		System.out.println("str1의 index 4에 있는 문자는 "
				+ ch + "입니다.");
		
		//두 문자열 같은지 비교
		if(str1.compareTo(str2) == 0) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
		
		//문자열 붙이기
		System.out.println(str1.concat("navercloud"));
		
		
		
		
	}

}
