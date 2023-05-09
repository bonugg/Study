package chap10_abstraction.academy;

public class EnglishAcademy extends Academy {

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("영어학원에서 영어를 가르치다.");
	}

	@Override
	public void solveHomework() {
		// TODO Auto-generated method stub
		System.out.println("영어학원에서 영문법 숙제를 풀다.");
	}

	@Override
	public void rest() {
		// TODO Auto-generated method stub
		System.out.println("영어학원에서 쉬는 시간에는 쉰다.");
	}

	@Override
	public void attend() {
		// TODO Auto-generated method stub
		System.out.println("영어학원에 출석하다.");
	}
}
