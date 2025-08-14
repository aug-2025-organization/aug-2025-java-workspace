public class ThreadPriorityDemo {

	public static void main(String[] args) {
		ChildPriorityThread cpt1 = new ChildPriorityThread("Child1", Thread.MAX_PRIORITY);
		ChildPriorityThread cpt2 = new ChildPriorityThread("Child2", Thread.MIN_PRIORITY);
		
		cpt1.t.start();
		cpt2.t.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		cpt1.t.stop();
		cpt2.t.stop();
		
		System.out.println(cpt1.t.getName() + " with priority " + cpt1.t.getPriority() + " counter value: " + cpt1.counter);
		System.out.println(cpt2.t.getName() + " with priority " + cpt2.t.getPriority() + " counter value: " + cpt2.counter);
	}
}
