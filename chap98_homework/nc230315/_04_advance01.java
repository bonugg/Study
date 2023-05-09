package chap98_homework.nc230315;

import java.util.Scanner;

public class _04_advance01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int money = sc.nextInt();
		int count;
		String printStr = "";
		
		count = money / 50000;
		printStr += "<오만원 " + count + "매, ";
		money -= count * 50000; // money %= 50000;
		
		
		count = money / 10000;
		printStr += "만원 " + count + "매, ";
		money -= count * 10000; // money %= 10000;
		
		count = money / 5000;
		printStr += "오천원 " + count + "매, ";
		money -= count * 5000;
		
		count = money / 1000;
		printStr += "천원 " + count + "매, ";
		money -= count * 1000;
		
		count = money / 500;
		printStr += "500원 " + count + "개, ";
		money -= count * 500;
		
		count = money / 100;
		printStr += "100원 " + count + "개, ";
		money -= count * 100;
		
		count = money / 50;
		printStr += "50원 " + count + "개, ";
		money -= count * 50;
		
		count = money / 10;
		printStr += "10원 " + count + "개> 입니다.";
		money -= count * 10;
		
		System.out.println(printStr);
		
		sc.close();
	}

}
