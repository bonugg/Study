package chap98_homework.nc230320.arrayutils;

public class ArrayUtility2 {
	public static int[] concat(int[] s1, int[] s2) {
		int[] returnArr = new int[s1.length + s2.length];
		
		int index = 0;
		
		for(int i = 0; i < s1.length; i++) {
			returnArr[index++] = s1[i];
		}
		
		for(int i = 0; i < s2.length; i++) {
			returnArr[index++] = s2[i];
		}
		
		return returnArr;
	}
	
	public static int[] remove(int[] s1, int[] s2) {
		
		int[] indexArr = new int[s1.length];
		
		int index = 0;
		int dupCnt = 0;

		for(int i = 0; i < s1.length; i++) {
			for(int j = 0; j < s2.length; j++) {
				if(s1[i] == s2[j]) {
					indexArr[index++] = i;
					dupCnt++;
					break;
				}
			}
		}
		
		int[] returnArr = new int[s1.length - dupCnt];
		
		index = 0;
		
		for(int i = 0; i < s1.length; i++) {
			boolean isDup = false;
			
			for(int j =0 ; j < dupCnt; j++) {
				if(i == indexArr[j]) {
					isDup = true;
					break;
				}
			}
			
			if(isDup) {
				continue;
			}
			
			returnArr[index++] = s1[i];
		}
		
		return returnArr;
	}
}
