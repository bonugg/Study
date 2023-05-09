package chap98_homework.nc230316;

import java.util.Scanner;

public class _04_basic04 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print("정수를 입력하세요.");
			nums[i] = sc.nextInt();
		}
		
		for(int num : nums) {
			if(num % 2 == 0 || num % 3 == 0) {
				System.out.println(num);
			}
		}
		
		sc.close();
	}
	
}
