package chap19_multithread;

public class _03_threadName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1 = Thread.currentThread();
		System.out.println(thread1.getName() + "동작중");
		
		for(int i = 0; i < 3; i++) {
			Thread thread2 = new Thread() {
				@Override
				public void run() {
					System.out.println(getName() + "동작중");
				}
			};
			
			thread2.start();
		}
		
		Thread thread3 = new Thread() {
			@Override
			public void run() {
				System.out.println(getName() + "동작중");
			}
		};
		
		thread3.setName("No3-Thread");
		thread3.start();
	}

}
