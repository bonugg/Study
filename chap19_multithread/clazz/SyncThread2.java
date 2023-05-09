package chap19_multithread.clazz;

public class SyncThread2 extends Thread{
	private PrintNumWithWaitNotify pns;

	public void setPns(PrintNumWithWaitNotify pns) {
		this.pns = pns;
	}
	
	public PrintNumWithWaitNotify getPns() {
		return pns;
	}
	
	@Override
	public void run() {
		pns.printNum2(10);
	}
}
