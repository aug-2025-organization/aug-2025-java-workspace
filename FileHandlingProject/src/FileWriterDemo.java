import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type a Sentence : ");
		String str = scan.nextLine();
		
		try {
			FileWriter fw = new FileWriter("sample.txt");
			fw.write(str);
			fw.flush();
			System.out.println("File writtern succesfully!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
