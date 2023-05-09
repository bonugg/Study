package chap19_multithread;

import chap19_multithread.clazz.Test;
import chap19_multithread.clazz.Test1;
import chap19_multithread.clazz.Test2;
import chap19_multithread.clazz.Test3;

public class useOfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		
		Test1 t1 = new Test1();
		Test2 t2 = new Test2();
		Test3 t3 = new Test3();
		
		t1.setT(t);
		t2.setT(t);
		t3.setT(t);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
