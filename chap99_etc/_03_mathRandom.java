package chap99_etc;

public class _03_mathRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 난수발생 첫번째 방식
		//Math.random() 사용
		//0 <= Math.random() < 1 사이의 난수
		System.out.println(Math.random());
		
		//2. 1 <= Math.random() < 11
		//0 <= Math.random() * 10 < 10
		//1 <= (int)(Math.random() * 10) + 1 < 11 
		int rand = (int)(Math.random() * 10) + 1;
		System.out.println(rand);
		
		//3. 1~45까지 난수 발생기
		//0 + 1 <= 변수 < 45 + 1
		int rand2 = (int)(Math.random() * 45) + 1;
		System.out.println(rand2);
		
		//4. 200~299까지 난수 발생기
		//0 <= vari < 100
		int rand3 = (int)(Math.random() * 100) + 200;
		System.out.println(rand3);
		
		//a~b까지 랜덤
		//(int)(Math.random() * (b - a + 1)) + a
		
		
	}

}
