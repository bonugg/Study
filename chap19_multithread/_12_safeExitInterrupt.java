package chap19_multithread;

import chap19_multithread.clazz.InterruptThread;

public class _12_safeExitInterrupt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterruptThread wt = new InterruptThread();
		
		wt.start();
		
		try {
			//main 스레드 1초동안 일시 정지
			//InterruptThread가 1초 반복 실행
			Thread.sleep(1000);
		} catch(InterruptedException ie) {
			System.out.println(ie);
		}
		
		//main 스레드가 일시 정지 상태에서 풀리기 전까지는
		//실행이 안됨
		wt.interrupt();
		//interrupt() 메소드가 실행된 이후에 
		//run() 메소드를 실행하는 데 일시 정지 코드를 만나면
		//InterruptedException을 발생시켜
		//catch구문으로 빠지면서 스레드가 종료된다.
		//catch 구문에서 리소스 정리 코드를 작성한다.
	}

}
