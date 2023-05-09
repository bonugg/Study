package chap02_variables;

public class _09_constant {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//DB 커넥션 풀의 최대 DB 연결 개수 = 20
		final int MAX_CONNECTION = 20;
		
		//상수는 선언만 하고 나중에 값을 저장해도 된다.
		final int MAX_VALUE;
		MAX_VALUE = 10;
		
		//한 번 지정된 상수의 값은 변경할 수 없다.
		//MAX_CONNECTION = 30;
		
		int userCnt = 0;
		
		
		while(true) {
			userCnt++;
			
			System.out.println("현재 사용자 수 : " + userCnt);
			if(userCnt > MAX_CONNECTION) {
				break;
			}
			
			Thread.sleep(1000);
		}
		
		System.out.println("DB 연결이 모두 사용중입니다.");
	}
	
}
