package chap19_multithread.clazz;

public class NonSyncThread2 extends Thread{
	private PrintNumWithoutSync pns;

	public void setPns(PrintNumWithoutSync pns) {
		this.pns = pns;
	}
	
	public PrintNumWithoutSync getPns() {
		return pns;
	}
	
	@Override
	public void run() {
		pns.printNum2(20);
	}
}
