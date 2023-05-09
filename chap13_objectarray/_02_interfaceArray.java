package chap13_objectarray;

import chap13_objectarray.clazz.English;
import chap13_objectarray.clazz.ILecture;
import chap13_objectarray.clazz.MathMetics;
import chap13_objectarray.clazz.Programming;

public class _02_interfaceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ILecture[] lecArr = new ILecture[5];
		
		lecArr[0] = new English("영문법", 30, 100);
		lecArr[1] = new MathMetics("미적분", 15, 120);
		lecArr[2] = new Programming("자바", 50, 90);
		try {
			for(int i = 0; i < lecArr.length; i++) {
				lecArr[i].proceedLecture();
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
