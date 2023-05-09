package chap19_multithread.clazz;

public class Test1 extends Thread {
	private Test t;
	
	public void setT(Test t) {
		this.t = t;
	}
	
	@Override
	public void run() {
		t.printNum1(1);
	}
}
