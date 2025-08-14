public class ChildRunnableThread implements Runnable{
	Thread t;
	
	public ChildRunnableThread(String threadName) {
		t = new Thread(this);
		t.setName(threadName);
		t.start();
	}

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(t.getName() + " : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
