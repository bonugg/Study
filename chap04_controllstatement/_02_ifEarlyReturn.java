package chap04_controllstatement;

public class _02_ifEarlyReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lunchPrice = 10000;
		
		String str = getFeeling(lunchPrice);
		System.out.println(str);
	}
	
	public static String getFeeling(int price) {
		if(price >= 10000) {
			return "너무 비싸다";
		} 
		
		return getFeeling2(price);
	}
	
	public static String getFeeling2(int price) {
		if(price >= 8000) {
			return "조금 비싸다";
		} 
		
		return "적정하거나 싼 편이다";
	}
}
