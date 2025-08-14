public class ChildThread extends Thread{
	
	public ChildThread(String threadName) {
		setName(threadName);
	}

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(getName() + " : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(getName() + " over...");
	}
}
