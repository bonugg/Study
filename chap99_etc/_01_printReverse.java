package chap99_etc;

public class _01_printReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "AbcDeF";
		
		//대소문자 변환 된 문자열
		String capStr = "";
		
		//fEdCBa
		//대문자 소문자 바꿔주는 작업
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			char capCh = ch >= 'A' && ch <= 'Z' ?
					(char)((int)ch + 32) : 
					(char)((int)ch - 32);
			
			//capStr = capStr + capCh;
			//capStr = a;
			//capStr = a + B; => aB;
			//capStr = aB + C; => aBC;
			//..
			//capStr = aBCdE + f => aBCdEf;
			//capStr = a + "";
			//capStr = B + a;
			//capStr = C + Ba;
			//역순으로 담기
			//capStr = "a" + ""; => a
			//capStr = "B" + "a" => Ba
			capStr = capCh + capStr;
		}
		
		System.out.println(capStr);
		
		//반대로 출력
		//capStr = "aBCdEf";
//		for(int i = capStr.length() - 1; i >= 0; i--) {
//			System.out.print(capStr.charAt(i));
//		}
	}

}
