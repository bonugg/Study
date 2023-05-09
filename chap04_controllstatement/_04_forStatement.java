package chap04_controllstatement;

public class _04_forStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~100까지 합의 값을 담아줄 변수
		int sum = 0;
		int i;
		
		for(i = 1; i <= 100; i++) {
			//sum = 0 + 1
			//sum = 1 + 2
			//sum = 3 + 3
			//..
			//sum = 4950 + 100
			//i = 101
			sum += i;
		}
		
		System.out.println("1~100까지의 합 : " +
				sum);
		System.out.println("마지막 i의 값 : " + i);
		
		
		int num = 0;
		
		for(int j = 0; j <= 1000; j++) {
			if(j % 13 == 0 && j % 23 == 0) {
				num += j;
				System.out.println(j);
				if(num > 500) {
					break;
				}
			}
			System.out.println("for문 밖의 j : " + j);
		}
		
		System.out.println("12, 13의 공배수의 합이 500을 넘어갈때의"
				+ "합 : " + num);
	}

}
