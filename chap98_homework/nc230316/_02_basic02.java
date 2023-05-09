package chap98_homework.nc230316;

import java.util.Scanner;

public class _02_basic02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];
		int sum = 0;
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print("정수를 입력하세요.");
			nums[i] = sc.nextInt();
		}
		
		for(int num : nums) {
			sum += num;
			System.out.println(num);
		}
		
		System.out.println("배열의 총합 : " + sum);
		
		sc.close();
	}

}
