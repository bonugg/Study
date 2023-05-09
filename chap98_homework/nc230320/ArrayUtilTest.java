package chap98_homework.nc230320;

import chap98_homework.nc230320.arrayutils.ArrayUtility2;

public class ArrayUtilTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		int[] arr = {1, 2, 3, 4};
		int[] arr2 = {3, 4, 5, 6};
		
		int[] arr3 = ArrayUtility2.remove(arr, arr2);
		
		for(int i = 0; i < arr3.length; i++) {
			
			System.out.println(arr3[i]);
		}
	}

}
