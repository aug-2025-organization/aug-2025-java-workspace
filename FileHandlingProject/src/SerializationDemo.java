import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		Account accObj = new Account(123123, "ABC", 9999);
		
		try {
			FileOutputStream fos = new FileOutputStream("output.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(accObj);
			System.out.println("Object writtern successfully!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
