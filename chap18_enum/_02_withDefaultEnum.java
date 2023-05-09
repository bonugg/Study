package chap18_enum;

import chap18_enum.eunms.DefaultMonth;

public class _02_withDefaultEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DefaultMonth형의 변수 선언
		//DefaultMonth.JAN을 값으로 갖는 
		//DefaultMonth의 열거형 객체가 하나 생성
		DefaultMonth jan = DefaultMonth.JAN;
		
		//DefaultMonth의 열거형 객체의 이름(상수의 이름)
		//=> JAN
		System.out.println(jan);
		//ordinal() => 해당 상수의 인덱스
		System.out.println(jan.ordinal());
		//DefaultMonth의 열거형 객체의 이름(상수의 이름)
		//=> AUG
		System.out.println(DefaultMonth.AUG);
	}

}
