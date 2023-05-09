package chap98_homework.nc230324;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class _03_advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 2001년 12월 19일이 결혼기념일인 부부가 있다. 
//	    윤년이 있는 년도에는 결혼기념일의 날짜를 하루씩 더하기로 했다.
//	    2022년의 결혼기념일 날짜를 구하세요.
		Calendar cal1 = Calendar.getInstance();
		cal1.set(2001, 11, 19);
		
		for(int i = 2001; i <= 2022; i++) {
			if(isLeap(i)) {
				cal1.add(Calendar.DATE, 1);
			}
		}
		Map<String, Integer> map = new HashMap<String, Integer>();
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();		
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM월 dd일");
		
		Date d1 = new Date(cal1.getTimeInMillis());
		
		System.out.println("2022년 결혼기념일 날짜는 " 
				+ sdf1.format(d1)
				+ "입니다.");
		System.out.println("------------------------------");
		
//		2. 사용자 입력한 문자열에서 연속된 동일한 문자를 찾고
//		     연속된 동일한 문자를 발견했을 때 하나빼고 다 제거하여
//		     출력하세요. (단, 대소문자 구분함. StringBuilder를 사용하세요.)
//		     ex) aabbcdeffaaaaynguuuuuu -> abcdefayngu
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요.");
		StringBuilder sb = 
				new StringBuilder(sc.nextLine());
		
		System.out.println("입력한 문자열 : " + sb);
		
		for(int i = 0; i < sb.length(); i++) {
			if(i > 0 && sb.charAt(i) == sb.charAt(i - 1)) {
				sb = sb.delete(i, i + 1); 
				//delete 하면 i + 1 자리에 있던 문자가 i자리로
				//오게돼서 i자리를 다시 검사
				i--;
			}
		}
		
		System.out.println("연속된 동일한 문자를 제거한 문자열 : " + sb);
		System.out.println("------------------------------");
		    
//		3. 사용자가 두 개의 날짜(yyyy-MM-dd 형식)를 입력하고 입력받은
//		    두 날짜 사이의 날짜를 모두 출력하세요. (Calendar 클래스를 사용하세요).
//		    ex) 2023-01-29 2023-02-05 입력
//			출력  =>  2023-01-29
//		             2023-01-30
//		             2023-01-31
//		             2023-02-01
//		             2023-02-02
//		             2023-02-03
//		             2023-02-04
//		             2023-02-05
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.print("첫 번째 날짜를 입력하세요.\n(년도4자리-월2자리-일2자리 형식으로 작성)\n");
		String inputDate1 = sc.nextLine();
		System.out.print("두 번째 날짜를 입력하세요.\n(년도4자리-월2자리-일2자리 형식으로 작성)\n");
		String inputDate2 = sc.nextLine();
		
		Date d2 = new Date();
		Date d3 = new Date();
		
		try {
			d2 = sdf2.parse(inputDate1);
			d3 = sdf2.parse(inputDate2);
		} catch(ParseException e) {
			System.out.println(e.getMessage());
		}
		
		int compare = d2.compareTo(d3);
		
		Calendar cal2 = Calendar.getInstance();
		Calendar cal3 = Calendar.getInstance();
		
		cal2.setTime(d2);
		cal3.setTime(d3);
		
		if(compare > 0) {
			long diff = cal2.getTimeInMillis() - cal3.getTimeInMillis();
			
			long day = diff / (1000 * 60 * 60 * 24);
			
			System.out.println(sdf2.format(
						new Date(cal3.getTimeInMillis())));
			
			for(long i = 1; i < day; i++) {
				cal3.add(Calendar.DATE, 1);
				System.out.println(sdf2.format(
						new Date(cal3.getTimeInMillis())));
			}
		} else if(compare < 0) {
			long diff = cal3.getTimeInMillis() - cal2.getTimeInMillis();
			
			long day = diff / (1000 * 60 * 60 * 24);
			
			System.out.println(sdf2.format(
					new Date(cal2.getTimeInMillis())));
			
			for(long i = 0; i < day; i++) {
				cal2.add(Calendar.DATE, 1);
				System.out.println(sdf2.format(
						new Date(cal2.getTimeInMillis())));
			}
		} else {
			System.out.println("두 날짜는 같습니다.");
		}
		
		sc.close();
	}
	
	public static boolean isLeap(int year) {
		return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
	}

}
