package chap10_abstraction;

import chap10_abstraction.academy.Academy;
import chap10_abstraction.academy.ComputerAcademy;
import chap10_abstraction.academy.EnglishAcademy;

public class _01_abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//추상클래스는 인스턴스화 불가
		//Academy ac = new Academy();
		Academy ac = new EnglishAcademy();
		
		ac.teach();
		ac.solveHomework();
		ac.rest();
		ac.attend();
		
		System.out.println("---------------");
		
		ac = new ComputerAcademy();
		
		ac.teach();
		ac.solveHomework();
		ac.rest();
		ac.attend();
	}

}
