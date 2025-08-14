public class ChildPriorityThread implements Runnable{
	Thread t;
	int counter;

	public ChildPriorityThread(String threadName, int threadPriority) {
		t = new Thread(this);
		t.setName(threadName);
		t.setPriority(threadPriority);
	}
	
	@Override
	public void run() {
		while(true) {
			counter++;
		}
	}
}
