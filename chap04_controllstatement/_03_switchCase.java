package chap04_controllstatement;

public class _03_switchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String grade = "B";
		
		switch(grade) {
			case "A":
				System.out.println("점수는 90점"
						+ "이상입니다.");
				break; //일치하는 조건을 만나면 switch문 종료
			case "B":
				System.out.println("점수는 90점"
						+ "미만 80점이상입니다.");
				break;
			case "C":
				System.out.println("점수는 80점"
						+ "미만 70점이상입니다.");
				break;
			default:
				System.out.println("점수는 70점"
						+ "미만입니다.");
				break;
		}
	}

}
