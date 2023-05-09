package chap18_enum;

import chap18_enum.eunms.RGB;

public class _04_useOfRGB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RGB red = RGB.RED;
		RGB green = RGB.valueOf("GREEN");
		RGB blue = Enum.valueOf(
							RGB.class, "BLUE");
		
		System.out.println("빨간색은 " + 
				red.getRed() + ", " + red.getGreen()
				+ ", " + red.getBlue());
		
		System.out.println("초록색은 " + 
				green.getRed() + ", " + green.getGreen()
				+ ", " + green.getBlue());
		
		System.out.println("파란색은 " + 
				blue.getRed() + ", " + blue.getGreen()
				+ ", " + blue.getBlue());
		
		blue.makeWhite();
	}

}
