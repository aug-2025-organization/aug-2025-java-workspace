import java.io.FileNotFoundException;

public class Demo4 {

	public static void main(String[] args) {
//		ArithmeticException ae = new ArithmeticException();
//		throw ae;
		
//		FileNotFoundException fe = new FileNotFoundException();
//		throw fe;
		
		int menuOption = 4;
		try {
			if(menuOption <= 0 || menuOption > 5) {
				InvalidOptionException ioe = new InvalidOptionException(menuOption);
				throw ioe;
			}
		}catch(InvalidOptionException i) {
			System.out.println(i.getMessage());
		}
		System.out.println("Over..");
	}

}
