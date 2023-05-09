package chap98_homework.nc230315;

public class _02_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 1;
		
		while(num1 <= 10) {
			if(num1 % 2 == 0) {
				System.out.println(num1);
			}
			num1++;
		}
		System.out.println("----------------------------");
		
		int sum = 0;
		
		for(int i = 1; i <= 1000; i++) {
			if(i % 2 == 0 && i % 7 == 0) {
				System.out.println(i);
				sum += i;
			}
		}
		
		System.out.println("1000이하인 2와 7의 공배수의 합 : " + sum);
		System.out.println("----------------------------");
		
		for(int i = 1;i <= 9; i++) {		
			for(int j = 2; j <= 9; j++) {
				System.out.print(j + " * " + i + " = " + i * j + "\t");
			}
				System.out.println("\n");
		}
	}

}
