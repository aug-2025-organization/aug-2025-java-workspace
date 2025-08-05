
public class DataTypes {

	public static void main(String[] args) {
		long l1 = 250000000L;
		short s1 = (short) l1; // explicit casting
		System.out.println(s1);

		byte b1 = 10;
		int i1 = b1; // implicit casting
		System.out.println(i1);

		// float and double

		float f1 = 3.14F;

		boolean flag = true;

		char ch = 's';
		System.out.println(ch);

		// connection between int and char
		char ch1 = 'r';
		System.out.println(ch1);
		System.out.println((int) ch1);

		int i2 = 98;
		System.out.println(i2);
		System.out.println((char) i2);

		int i3 = 25;
		int i4 = i3++;

		int a1 = 30;
		int a2 = 5;

		int a3 = a1 > a2 ? a1 : a2;
		System.out.println(a3);

		char ch4 = 'd';
		int i8 = ch4;

		char ch5 = (char) i8;
	}
}
