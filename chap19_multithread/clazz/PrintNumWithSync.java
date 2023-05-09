package chap19_multithread.clazz;

public class PrintNumWithSync {
	private int num;

	public void setNum(int num) {
		this.num = num;
	}
	
	//동기화 메소드
	public synchronized void printNum1(int num) {
		this.setNum(num);
		
		for(int i = 1; i <= this.num; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(100);
			} catch(InterruptedException ie) {
				System.out.println(ie.getMessage());
			}
		}
	}
	
	public void printNum2(int num) {
		//동기화 블록 : 선점한 스레드의 작업이 끝날때까지 실행안되도록
		//동기화 블록 선언
		synchronized(this) {
			this.setNum(num);
		}
		
		for(int i = this.num; i <= this.num * 2; i++) {
			System.out.println(i);
		}
	}
}
