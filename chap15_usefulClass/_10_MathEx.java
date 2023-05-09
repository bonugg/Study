package chap15_usefulClass;

import java.util.Scanner;

public class _10_MathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] numArr = new int[5];
		//사용자가 5개 정수 입력 => 배열에 저장
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = sc.nextInt();			
		}
		
		int max = numArr[0];
		int min = numArr[0];
		//Math.max와 Math.min을 이용하여 
		//최소값, 최대값 구하기
		for(int i = 0; i < numArr.length; i++) {
			max = Math.max(max, numArr[i]);
			min = Math.min(min, numArr[i]);
		}
		
		System.out.println(max);
		System.out.println(min);
		
		sc.close();
	}

}
