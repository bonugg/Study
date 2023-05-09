package chap98_homework.nc230320.arrayutils;

public class ArrayUtility {
	public static double[] intToDouble(int[] source) {
		double[] returnArr = new double[source.length];
		
		for(int i = 0; i < source.length; i++) {
			returnArr[i] = source[i];
		}
		
		return returnArr;
	}
	
	public static int[] doubleToInt(double[] source) {
		int[] returnArr = new int[source.length];
		
		for(int i = 0; i < source.length; i++) {
			returnArr[i] = (int)source[i];
		}
		
		return returnArr;
	}
}
