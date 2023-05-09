package chap98_homework.nc230322;

import java.util.Scanner;

public class _01_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		1. 사용자가 입력한 문자열을 받아서 가운데 문자를 출력하세요. 
//	    문자열의 길이가 짝수면 가운데 두 글자 출력. ex) 비둘기 -> 둘, 비트캠프 -> 트캠
		System.out.print("문제 1번 단어를 입력하세요.");
		String str1 = sc.nextLine();
		
		if(str1.length() % 2 == 0) {
			System.out.println(str1.substring(str1.length() / 2 - 1, str1.length() / 2 + 1));
		} else {
			System.out.println(str1.charAt(str1.length() / 2));
		}
		
//		2. 사용자가 입력한 문자열에서 가, 바의 개수를 새서 출력하세요.
//		    '0개면 가, 바가 존재하지 않습니다.'라고 출력.
		System.out.print("문제 2번 단어를 입력하세요.");
		String str2 = sc.nextLine();
		
		int rkCnt = 0;
		int qkCnt = 0;
		
		for(int i = 0; i < str2.length(); i++) {
			if(str2.charAt(i) == '가') {
				rkCnt++;
			} else if(str2.charAt(i) == '바') {
				qkCnt++;
			}
		}
		
		if(rkCnt + qkCnt == 0) {
			System.out.println("가, 바가 존재하지 않습니다.");
		} else {
			System.out.println("가 : " + rkCnt + "개, "
					+ "바 : " + qkCnt + "개");
		}
//		3. 사용자가 입력한 문자열에서 알파벳의 모음을 제거하여 출력하세요.
//		    대문자 모음, 소문자 모음 모두 제거. 모음은 a, e, i, o, u
		System.out.print("문제 3번 단어를 입력하세요.");
		String str3 = sc.nextLine();
		
		System.out.println(str3.replaceAll("[aeiouAEIOU]", ""));
		
//		4. 사용자가 입력한 문자열1, 문자열2 문자열1이 문자열2를 포함하면
//		    '포함합니다.'를 출력, 아니면 '포함하지 않습니다.'를 출력
		System.out.print("문제 3번 문자열1을 입력하세요.");
		String str4 = sc.nextLine();
		System.out.print("문제 3번 문자열2을 입력하세요.");
		String str5 = sc.nextLine();
		
		if(str4.contains(str5)) {
			System.out.println("포함합니다.");
		} else {
			System.out.println("포함하지 않습니다.");
		}
		
		sc.close();
	}

}
