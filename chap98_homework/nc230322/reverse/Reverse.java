package chap98_homework.nc230322.reverse;

public class Reverse {
	public String reverseString(String str) {
		String reverse = "";
		
		for(int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		
		return reverse;
	}
}
