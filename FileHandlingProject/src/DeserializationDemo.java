import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("output.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Account acc = (Account) ois.readObject();
			System.out.println(acc);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
