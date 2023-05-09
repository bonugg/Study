package chap98_homework.nc230322;

import java.util.Scanner;

public class _03_advance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		1. 사용자가 입력한 문자열을 순서대로 정리하세요.
//	    순서는 유니코드 값 오름차순으로 정리.
		System.out.print("문자열을 입력하세요.");
		String str1 = sc.nextLine();
		String answer = "";
		char[] chArr = str1.toCharArray();
		
		for(int i = 0; i < chArr.length; i++) {
			for(int j = 0; j < i; j++) {
				if(i > 0 && chArr[i] < chArr[j]) {
					char temp = chArr[i];
					chArr[i] = chArr[j];
					chArr[j] = temp;
				}
			}
		}
		
		answer = new String(chArr);
		
		System.out.println(answer);

//		2. 사용자가 입력한 문자열(단, 숫자로만 구성돼야함)을 
//		   정수형으로 바꿔주는 메소드 int convertToInt(String str)
//		   을 작성하세요. ex) "532" -> 532, "-714" -> -714
		System.out.print("정수를 입력하세요.");
		String str2 = sc.nextLine();
		
		int num = 0;
		
		if(str2.charAt(0) != '-') {
			num = Integer.valueOf(str2);
		} else {
			String temp = str2.replace("-", "");
			num = -Integer.valueOf(temp);
		}
		
		System.out.println(num);
		
//		3. 사용자가 영문자로만 구성된 문자열과 정수를 1개 입력합니다.
//		    해당 문자열에서 알파벳 대문자는 입력된 정수만큼 증가,
//		    알파벳 소문자는 입력된 정수만큼 감소된 새로운 문자열을 출력하세요.
//		    a에서 1 감소하면 z로 Z에서 1 증가하면 A로 순환됩니다.
//		    ex) OoOpGh, 2 -> QmQnIf 출력
		System.out.print("문자열을 입력하세요.");
		String str3 = sc.nextLine();
		System.out.print("정수를 입력하세요.");
		int num2 = sc.nextInt();
		String answer2 = "";
		
		for(int i = 0; i < str3.length(); i++) {
			if(str3.charAt(i) >= 'A' &&
					str3.charAt(i) <= 'Z') {
				if((char)(str3.charAt(i) + num2) 
						> 'Z') {
					answer2 += (char)(('A' - 1) + 
								(str3.charAt(i) + num2 - 'Z'));
				} else {
					answer2 += (char)(str3.charAt(i) + num2);
				}
			} else if(str3.charAt(i) >= 'a' &&
					str3.charAt(i) <= 'z') {
				if((char)(str3.charAt(i) - num2) 
						< 'a') {
					answer2 += (char)(('z' + 1) - 
								('a' - (str3.charAt(i) - num2)));
				} else {
					answer2 += (char)(str3.charAt(i) - num2);
				}
			}
		}
		
		System.out.println(answer2);
		sc.close();
	}
}
