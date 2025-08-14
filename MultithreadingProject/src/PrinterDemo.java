
public class PrinterDemo {

	public static void main(String[] args) {
		PrinterResource resource = new PrinterResource();
		
		PrintRequestThread pt1 = new PrintRequestThread("request1", resource, "hello");
		PrintRequestThread pt2 = new PrintRequestThread("request2", resource, "welcome");
		PrintRequestThread pt3 = new PrintRequestThread("request3", resource, "java");
		
		try {
			pt1.t.join();
			pt2.t.join();
			pt3.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
