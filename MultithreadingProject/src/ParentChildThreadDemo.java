public class ParentChildThreadDemo {
	public static void main(String[] args) {
		// here a child thread is created only by java,
		// the OS is still not aware of this child thread
		ChildThread ch1 = new ChildThread("ChildOne"); 
		ChildThread ch2 = new ChildThread("ChildTwo");
		
		ChildRunnableThread ch3 = new ChildRunnableThread("ChildThree");
		
		// here the actual child thread at OS level is created
		ch1.start();
		ch2.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			ch1.join();
			ch2.join();
			ch3.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " over...");
	}
}
