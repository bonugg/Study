package chap98_homework.nc230321;

import chap98_homework.nc230321.calc.Calculator;

public class _02_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		
		Calculator.Add add = cal.new Add();
		Calculator.Sub sub = cal.new Sub();
		Calculator.Mul mul = cal.new Mul();
		Calculator.Div div = cal.new Div();
		
		System.out.println(add.add(10, 5));
		System.out.println(sub.sub(10, 5));
		System.out.println(mul.mul(10, 5));
		System.out.println(div.div(10, 5));
		
	}

}
