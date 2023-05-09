package chap02_variables;

public class _02_scopeOfVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 지역 변수
		//메인 메소드의 지역 변수
		int mainNum = 10;
		int sum = 0;
		
		if(sum == 0) {
			int ifNum = 20;
			sum = mainNum + ifNum;
		} else {
			//if{}이 끝나서 if문의 지역변수인
			//ifNum이 사라져서 ifNum 재선언할 수 있다.
			int ifNum = 30;
			sum = mainNum + ifNum;
		}
		//if {}, else {} 블록 밖에서 
		//ifNum을 사용하면 없는 변수로 인식하여 에러 발생
		//System.out.println(ifNum);
		
		//getSum 메소드 안의 지역변수는 
		//getSum 메소드가 호출됐을 때 생성됐다가
		//메소드 실행이 끝나면 삭제된다.
		getSum();
		
		//메소드 실행 종료 시점
		//없는 변수로 인식하여 에러 발생
		//System.out.println(localResult);
		
	}
	
	public static void getSum() {
		int localVal1 = 10;
		int localVal2 = 20;
		int localResult = localVal1 + localVal2;
		
		System.out.println(localResult);
	}

}
