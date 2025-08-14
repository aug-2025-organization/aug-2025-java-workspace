public class PrintRequestThread implements Runnable{
	PrinterResource printer;
	String message;
	Thread t;
	
	public PrintRequestThread(String threadName, PrinterResource printer, String message) {
		t = new Thread(this);
		t.setName(threadName);
		this.printer = printer;
		this.message = message;
		t.start();
	}

	@Override
	public void run() {
		synchronized(printer) {
			printer.print(message);	
		}
	}
}
