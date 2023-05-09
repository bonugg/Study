package chap15_usefulClass;

import java.util.Calendar;

public class _18_calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar today = Calendar.getInstance();
		
		String[] days = {"", "일요일", "월요일", "화요일",
						"수요일", "토요일", "금요일", "토요일"};

		
		//HOUR는 오전, 오후 상관없이 0 ~ 11로 시간을 표시
		System.out.println("현재 시간은 " 
				+ today.get(Calendar.HOUR) +
				":" + today.get(Calendar.MINUTE) 
				+ ":" + today.get(Calendar.SECOND));
		//HOUR_OF_DAY 0 ~ 23으로 시간을 표시
		System.out.println("현재 시간은 " 
				+ today.get(Calendar.HOUR_OF_DAY));
		
		//오전(0), 오후(1) 표시해주는 AM_PM
		System.out.println("오전 or 오후 : " 
				+ today.get(Calendar.AM_PM));
		
		System.out.println("올해 년도는 " 
				+ today.get(Calendar.YEAR));
		//월은 0부터 시작 0(1월) ~ 11(12월)
		System.out.println("현재 월은 " 
				+ today.get(Calendar.MONTH));
		
		System.out.println("올해의 몇째주 : " 
				+ today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이번달의 몇째주 : " 
				+ today.get(Calendar.WEEK_OF_MONTH));
		
		//요일은 1부터 시작 1(일요일) ~ 7(토요일)
		System.out.println("무슨 요일 : " 
				+ days[today.get(Calendar.DAY_OF_WEEK)]);
		
		Calendar oneDay = Calendar.getInstance();
		
		oneDay.set(2023, 0, 11, 22, 54, 32);
		
		System.out.println("무슨 요일 : " 
				+ days[oneDay.get(Calendar.DAY_OF_WEEK)]);
		
		System.out.println("oneDay는 " + 
				oneDay.get(Calendar.YEAR) + "년 " +
				(oneDay.get(Calendar.MONTH) + 1) + "월 " +
				oneDay.get(Calendar.DATE) + "일");
		
		System.out.println(toString(oneDay));
	}
	
	public static String toString(Calendar cal) {
		return cal.get(Calendar.YEAR) + "년 " +
			   (cal.get(Calendar.MONTH) + 1) + "월 " +
				cal.get(Calendar.DATE) + "일";
	}
}
