package chap98_homework.nc230317;

public class UseOfPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LazerjetPrinter lj = new LazerjetPrinter();
		InkjetPrinter ij = new InkjetPrinter();
		
		lj.print();
		lj.print();
		
		ij.print();
		ij.print();
		ij.print();
	}

}
