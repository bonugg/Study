package chap19_multithread.clazz;

public class Test {
	private int num;

	public void setNum(int num) {
		this.num = num;
	}
	
	public synchronized void printNum1(int num) {
		this.setNum(num);
		
		for(; this.num <= 10; this.num++) {
			if(this.num % 3 == 0) {
				System.out.print(this.num + " ");
			}
		}
	}
	
	public synchronized void printNum2(int num) {
		this.setNum(num);
		
		for(; this.num <= 10; this.num++) {
			if(this.num % 3 == 1) {
				System.out.print(this.num + " ");
			}
		}
	}
	
	public synchronized void printNum3(int num) {
		synchronized(this) {
			this.setNum(num);
		}
		
		for(; this.num <= 10; this.num++) {
			if(this.num % 3 == 2) {
				System.out.print(this.num + " ");
			}
		}
	}
}
