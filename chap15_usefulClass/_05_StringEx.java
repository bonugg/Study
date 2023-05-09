package chap15_usefulClass;

import java.util.Scanner;

public class _05_StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println(str.replace("비트", "")
							   .replace("네이버", "")
							   .replace("클라우드", ""));
		
		sc.close();
	}

}
