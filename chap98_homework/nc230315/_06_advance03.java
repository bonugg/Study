package chap98_homework.nc230315;

public class _06_advance03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int a = 0; a < 10; a++) {
			for (int b = 0; b < 10; b++) {
				int numAB = a * 10 + b;
				int numBA = b * 10 + a;
				if (numAB + numBA == 99) {
					System.out.println("A = " + a + ", B = " + b);
				}
			}
		}
	}

}
