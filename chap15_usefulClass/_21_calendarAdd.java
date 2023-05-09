package chap15_usefulClass;

import java.util.Calendar;

public class _21_calendarAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		
		cal.set(2019, 4, 17);
		
		//7일 후
		cal.add(Calendar.DATE, 7);
		System.out.println(
				cal.get(Calendar.YEAR) + "년 " +
			   (cal.get(Calendar.MONTH) + 1) + "월 " +
			    cal.get(Calendar.DATE) + "일");
		
		//3달 후
		cal.add(Calendar.MONTH, 3);
		System.out.println(
				cal.get(Calendar.YEAR) + "년 " +
			   (cal.get(Calendar.MONTH) + 1) + "월 " +
			    cal.get(Calendar.DATE) + "일");
		
		//5년 후
		cal.add(Calendar.YEAR, 5);
		System.out.println(
				cal.get(Calendar.YEAR) + "년 " +
			   (cal.get(Calendar.MONTH) + 1) + "월 " +
			    cal.get(Calendar.DATE) + "일");
		
		//roll 메소드(다른 단위의 변화는 무시하고 
		//          지정한 단위에서만 연산)
		cal.add(Calendar.DATE, 31);
		System.out.println(
				cal.get(Calendar.YEAR) + "년 " +
			   (cal.get(Calendar.MONTH) + 1) + "월 " +
			    cal.get(Calendar.DATE) + "일");
		
		cal.roll(Calendar.DATE, 31);
		System.out.println(
				cal.get(Calendar.YEAR) + "년 " +
			   (cal.get(Calendar.MONTH) + 1) + "월 " +
			    cal.get(Calendar.DATE) + "일");
		
		
		
		
		
	}

}
