package chap19_multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import chap19_multithread.clazz.SumThread1;
import chap19_multithread.clazz.SumThread2;

public class _15_threadPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//스레드 풀 생성
		ExecutorService es = 
				Executors.newFixedThreadPool(5);
		
		
		es.execute(new SumThread1());
		es.execute(new SumThread2());
		
		for(int i = 1; i <= 10; i++) {
			//System.out.println(i);
			if(i == 3) {
				break;
			}
		}
		
		//shutdownNow는 interrupt() 메소드를 호출하는 로직을
		//포함하고 있어서 진행중인 스레드들이 일시 정지 상태가 되면
		//InterruptedException을 발생시켜서 스레드 풀 종료
		//es.shutdownNow();
		
		//메인 스레드가 종료되도 큐에 남아있는 작업들을 모두 처리하고 
		//스레드 풀 종료
		es.shutdown();
	}

}
