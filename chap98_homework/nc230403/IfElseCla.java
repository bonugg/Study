package chap98_homework.nc230403;

public class IfElseCla implements InterIfCla, InterElse {

	@Override
	public void makeElse(int num) {
		// TODO Auto-generated method stub
		if(num > 5) {
			System.out.println("5보다 큽니다.");
		}
	}

	@Override
	public void makeIf(int num) {
		// TODO Auto-generated method stub
		if(num < 5) {
			System.out.println("5보다 작습니다.");
		} else {
			makeElse(num);
		}
	}
	
	public void makeElseIf(int num) {
		if(num == 5) {
			System.out.println("5와 같습니다.");
		} else {
			makeIf(num);
		}
	}

}
