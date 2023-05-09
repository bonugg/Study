package chap98_homework.nc230323;

import java.util.Scanner;

import chap98_homework.nc230323.student.MainPage;
import chap98_homework.nc230323.student.Student;

public class _03_advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainPage mp = new MainPage();
		
		Scanner sc = new Scanner(System.in);
		
		Student[] stArr = new Student[100];
		
		while(true) {
			mp.printMenu(sc, stArr);
		}
	}

}
