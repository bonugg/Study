package chap19_multithread;

public class _02_anonymousThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread() {
			@Override
			public void run() {
				for(int i = 1; i <= 5; i++) {
					
					System.out.println(i);
					
					try {
						Thread.sleep(500);
					} catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		t.start();
		
		for(int i = 6; i <= 10; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
