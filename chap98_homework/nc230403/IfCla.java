package chap98_homework.nc230403;

public class IfCla {
//	IfCla 라는 클래스를 정의하고 멤버변수로는 ElseCla라는 클래스 타입의 변수를 가지고 있게 구현하고
//    makeIf(int num)를 만들어서 사용자가 입력한 정수(1 ~ 10)를 매개변수로 받아서 1과 같은지 비교해서 같으면 "정답입니다."를 출력하는 메소드를 구현하고
//   그 안에서 ElseCla에 존재하는 makeElse(int num) 메소드를 호출하여 1이 아닐때는 "오답입니다"라고 출력하세요.
	ElseCla ec = new ElseCla();
	
	public void makeIf(int num) {
		if(num == 1) {
			System.out.println("정답입니다.");
		} else {
			ec.makeElse(num);
		}
	}
}
