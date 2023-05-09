package chap19_multithread;

public class _01_useOfThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 스레드의 정의
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 1; i <= 5; i ++) {
					System.out.println(i);
					
//					try {
//						//현재 실행되는 스레드 중지 0.5초동안
//						//멈추면 다음 스레드 동작
//						//대기중인 메인스레드로 돌아간다.
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
				}
			}
		});
		
		//Thread t1 = new Thread();
		
		//2. 스레드의 실행
		thread.start();
		//t1.start();
		
		for(int i = 6; i <= 10; i++) {
			System.out.println(i);
			
//			try {
//				//현재 실행되는 스레드 중지 0.5초동안
//				//멈추면 다음 스레드 동작
//				//대기중인 서브스레드로 돌아간다.
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		
		
		
		
		
		
		
		
	}

}
