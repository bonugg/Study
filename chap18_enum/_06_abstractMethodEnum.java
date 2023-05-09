package chap18_enum;

import chap18_enum.eunms.Calculator;

public class _06_abstractMethodEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator add = Calculator.PLUS;
		int result = add.calculate(10, 5);
		System.out.println(result);
		
		Calculator[] cArr = Calculator.values();
		for(Calculator c : cArr) {
			System.out.println(
					c.calculate(10, 4));
		}
	}

}
