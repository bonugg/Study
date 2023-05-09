package chap19_multithread.clazz;

public class WhileThread extends Thread{
	private boolean stop = false;

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		//File f = new File();
		while(!stop) {
			System.out.println("스레드 실행됨");
		}
		
		
		System.out.println("스레드 종료");
	}
}
