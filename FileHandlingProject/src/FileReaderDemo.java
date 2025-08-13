import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		File file = new File("sample.txt");
		int ch = 0;
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			System.out.println("Sentence read from file : ");
			System.out.println(br.readLine());
			//StringBuffer sb = new StringBuffer();
			
//			while((ch = fr.read()) != -1) {
//				sb.append((char)ch);
//			}
//			System.out.println("Sentence read from file : ");
//			System.out.println(sb);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
