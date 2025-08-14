public class MainThreadDemo {
	public static void main(String[] args) {
		Thread th = Thread.currentThread();
		System.out.println("Thread Name : " + th.getName());
		System.out.println("Thread Priority : " + th.getPriority());
		System.out.println("Thread Group : " + th.getThreadGroup());
		System.out.println("Thread State : " + th.getState());
	}
}
