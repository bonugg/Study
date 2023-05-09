package chap99_etc;

public class _02_countKorean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 변수 선언 및 초기화
		String str = "가A나B다C라D";
		//문자 하나 씩 꺼내서 한글 판별할 변수
		char ch;
		//한글 개수 셀 변수
		int kCnt = 0;
		
		//2. 로직 처리
		//반복문으로 문자 하나씩 꺼내서 한글여부 판별
		for(int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			
			if(ch >= 44032 && ch <= 55203) {
				kCnt++;
				//kCnt += 1;
				//kCnt = kCnt + 1;
			}
		}
		
		System.out.println(kCnt);
	}

}
