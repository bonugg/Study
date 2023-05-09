package chap19_multithread.clazz;

public class AutoSaveThread extends Thread {
	public void save() {
		System.out.println("자동 저장되었습니다.");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				break;
			}
			
			save();
		}
	}
}
