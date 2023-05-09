package chap15_usefulClass;

import java.text.DecimalFormat;

public class _23_decimalFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = 
				new DecimalFormat("###,###");
		
		int price1 = 100000;
		int price2 = 1000000000;
		
		System.out.println(df.format(price1));
		System.out.println(df.format(price2));
	}

}
