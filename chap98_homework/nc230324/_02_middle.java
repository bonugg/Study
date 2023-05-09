package chap98_homework.nc230324;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class _02_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
//		1. 사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)에 add 메소드로 3일뒤로 변경하고
//	    yyyy-MM-dd 형식으로 출력하세요. (SimpleDateFormat 클래스 사용. SimpleDateFormat의
//	    parse() 메소드를 이용하면 String -> Date로 변환가능)
		System.out.print("날짜를 입력하세요.\n(년도4자리-월2자리-일2자리 형식으로 작성)\n");
		String inputDate1 = sc.nextLine();
		
		Date d1 = new Date();
		try {
			d1 = sdf.parse(inputDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		System.out.println(sdf.format(d1));
		System.out.println("-------------------------------------");
//	    2. 길이가 8이며 한글로 된 요일이 저장되어 있는 요일 배열을 만들고
//	    사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)의 요일을 한글로 출력하세요.
		String[] dayArr = {"", "일요일", "월요일", "화요일", "수요일", 
						   "목요일", "금요일", "토요일"};
		
		System.out.print("날짜를 입력하세요.\n(년도4자리-월2자리-일2자리 형식으로 작성)\n");
		inputDate1 = sc.nextLine();
		
		Date d2 = new Date();
		try {
			d2 = sdf.parse(inputDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(d2);
		
		System.out.println(sdf.format(d2) + "는 " 
				+ dayArr[cal1.get(Calendar.DAY_OF_WEEK)] 
				+ "입니다.");
		System.out.println("-------------------------------------");
//	    3. 두 개의 날짜 데이터 2023-03-15 20:31:45와 2021-07-08 11:58:04의 차이를
//	    시 분 초 형태로 나타내시오.
		Calendar cal2 = Calendar.getInstance();
		Calendar cal3 = Calendar.getInstance();
		
		cal2.set(2023, 2, 15, 20, 31, 45);
		cal3.set(2021, 6, 8, 11, 58, 04);
		
		long diffCal = cal2.getTimeInMillis() - cal3.getTimeInMillis();
		
		long time = diffCal / (1000 * 60 * 60);
		diffCal = diffCal % (1000 * 60 * 60);
		long minute = diffCal / (1000 * 60);
		diffCal = diffCal % (1000 * 60);
		long second = diffCal / 1000;
		
		System.out.println("두 날짜의 차이는 " + time + "시간 " + minute + "분 "
				+ second + "초입니다.");
		
		sc.close();
	}

}
