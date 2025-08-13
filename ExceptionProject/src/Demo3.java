import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo3 {
	public static void main(String[] args) {
		System.out.println("Main started...");
		try {
			method1();
		}catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println(aie.getMessage());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Main completed...");
	}

	public static void method1() throws ArrayIndexOutOfBoundsException, FileNotFoundException {
		System.out.println("Method1 started...");
		method2();
		System.out.println("Method2 completed");
	}

	public static void method2() throws ArrayIndexOutOfBoundsException, FileNotFoundException {
		FileReader fr = new FileReader("sample.txt");
		int[] marks = new int[5];
		System.out.println(marks[8]);
	}
}
