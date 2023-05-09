package chap19_multithread.clazz;

public class InterruptThread extends Thread{
	@Override
	public void run() {
		//File f = new File();
		//try {
		while(true) {
			System.out.println("스레드 실행됨");
			//1. Thread.sleep(1);
			//2. Thread.interrupted() : 
			//    interrupt가 발생했는지를 확인해주는 메소드를
			//    사용해서도 스레드를 종료시킬 수 있다.
			//    interrupt가 발생하면 true 리
			if(Thread.interrupted()) {
				break;
			}
		}
		//} catch(InterruptedException ie) {
			//리소스 정리
			
			//System.out.println(ie.getMessage());
		System.out.println("리소스 정리");
		System.out.println("스레드 종료");
		//} finally {
			//try~catch에 대한 후처리
		//}
		
	}
}
