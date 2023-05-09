package chap98_homework.nc230317;

public class UseOfCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc[] calcs = new Calc[4];
		calcs[0] = new Add();
		calcs[1] = new Sub();
		calcs[2] = new Mul();
		calcs[3] = new Div();
		
		for(int i = 0; i < calcs.length; i++) {
			calcs[i].setValue(20, 10);
			System.out.println(calcs[i].calculate());
		}
	}

}
