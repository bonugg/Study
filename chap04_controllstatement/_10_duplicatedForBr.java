package chap04_controllstatement;

public class _10_duplicatedForBr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//외내부 for문이 몇번 실행 됐는지 담을 변수
		int iCnt = 0;
		int jCnt = 0;
		
		//외부 for 문의 break는 for문 전체를 종료
		for(int i = 0; i < 5; i++) {
			if(i == 3) {
				break;
			}
			iCnt++; //3
			//내부 for문의 break는 내부 for문만 종료
			for(int j = 0; j < 5; j++) {
				if(j == 2) {
					break;
				}
				jCnt++;//6
			}
		}
		
		System.out.println(iCnt);
		System.out.println(jCnt);
	}

}
