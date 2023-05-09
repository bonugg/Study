package chap98_homework.nc230315;

public class _07_advance04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
	        for (int j = 4; j >= 0; j--) {
	        	if(i >= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
	        }
	        for(int k = 0; k < i; k++) {
	        	System.out.print("*");
	        }
	        System.out.println();
	    }
	}

}
