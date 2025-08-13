
public class Demo2 {
	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 10;
		int num3 = 0;
		System.out.println("Going to divide...");
		try {
			num3 = num1 / num2;	
			System.out.println("Division over...");
		}catch(ArithmeticException ae) {
			// log the exception to a log file
			// may rethrow the exception as another type
			System.out.println(ae.getMessage());
			System.out.println("Division not possible...Fixing it...");
			num2 = 1;
			num3 = num1 / num2; 
		}finally {
			// any resources opened in try block will be closed here
			System.out.println("finally block executed....");
		}
		System.out.println("Answer is: " + num3);
		System.out.println("Program over...");
	}
}
