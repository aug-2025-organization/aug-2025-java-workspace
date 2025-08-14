public class PrinterResource {
//	synchronized void print(String msg) {
	void print(String msg) {
		System.out.print("[");
		System.out.print(msg);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
}
