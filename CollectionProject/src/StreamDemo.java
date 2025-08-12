import java.util.Arrays;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> allNumbers = Arrays.asList(45, 23, 6, 23, 86, 12, 93, 84);
		
		allNumbers.forEach((eachNum) -> System.out.println(eachNum));
		System.out.println("----------------");
		// using streams print the numbers on the console
		allNumbers.stream().forEach((eachNumber) -> System.out.println(eachNumber));
		System.out.println("----------------");
		
		// using streams find the square of each number and print on the console
		allNumbers
			.stream()
			.map((num) -> num * num)
			.forEach((eachNum) -> System.out.println(eachNum));
		System.out.println("----------------");

		// using stream find the count of the elements
		long numOfElements = allNumbers.stream().count();
		System.out.println("Number : " + numOfElements);
		System.out.println("----------------");
		
		// using streams find the count of numbers less than 50
		long countLarge = allNumbers
							.stream()
							.filter((eachNum) -> eachNum < 50)
							.count();
		System.out.println("Numbers less than 50 : " + countLarge);
		System.out.println("----------------");
		
		// print distinct numbers
		allNumbers
			.stream()
			.distinct()
			.forEach((num) -> System.out.println(num));
		System.out.println("----------------");
		
		// count of distinct numbers
		
		// print largest 5 numbers
		
		// print minimum number
		
		// find the sum of the numbers
		
		// find the smallest 3 numbers and store it in
				// another collection
		
		
		List<String> allFruits = Arrays.asList("Apple", "Orange", "Banana", "Pineapple", "Grapes");
		
		// convert to upper case and collect it in another collect
		
		// print the length of each element
		
		// print the max length
		
		// collect fruits into another collection that do not start with 'A' or 'O'
		
		// calculate the sum of the length of all fruits
	} 

}
