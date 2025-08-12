import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
		System.out.println("Count of distinct : " + allNumbers.stream().distinct().count());
		System.out.println("----------------");
		
		// print largest 5 numbers
		allNumbers
			.stream()
			.distinct()
			.sorted(Comparator.reverseOrder())
			.limit(5)
			.forEach((num) -> System.out.println(num));
		System.out.println("----------------");

		
		// print minimum number
		System.out.println("Minimum number : " + allNumbers
													.stream()
													.min(Comparator.naturalOrder())
													.get());
													
		System.out.println("----------------");
		
		// find the sum of the numbers
		int sum = allNumbers
					.stream()
					.reduce(0, (num1, num2) -> num1 + num2);
		System.out.println("SUM : " + sum);
		System.out.println("----------------");

		// find the smallest 3 numbers and store it in
				// another collection
		allNumbers
			.stream()
			.distinct()
			.sorted()
			.limit(3)
			.collect(Collectors.toList())
			.forEach((num) -> System.out.println(num));
		System.out.println("----------------");

		List<String> allFruits = Arrays.asList("Apple", "Orange", "Banana", "Pineapple", "Grapes");
		
		// convert to upper case and collect it in another collection
		List<String> upperFruits = allFruits
										.stream()
										.map((eachFruit) -> eachFruit.toUpperCase())
										.collect(Collectors.toList());
		upperFruits.forEach((fruit) -> System.out.println(fruit));
		System.out.println("----------------");

		// print the length of each element
		allFruits
			.stream()
			.forEach((fruit) -> System.out.println(fruit.length()));
		System.out.println("----------------");

		// print the max length
		String maxStr = allFruits
							.stream()
							.max((str1, str2) -> str1.length() - str2.length())
							.get();
		System.out.println("Max String : " + maxStr);
		
		int maxLength = allFruits
							.stream()
							.mapToInt((str) -> str.length())
							.max()
							.getAsInt();
		System.out.println("Max Length : " + maxLength);
		System.out.println("----------------");

		// collect fruits into another collection that do not start with 'A' or 'O'
		allFruits
			.stream()
			.filter((eachFruit) -> !eachFruit.startsWith("A") && !eachFruit.startsWith("O"))
			.collect(Collectors.toList())
			.forEach((fruit) -> System.out.println(fruit));
		System.out.println("----------------");

		// calculate the sum of the length of all fruits
		int lengthSum = allFruits
							.stream()
							.mapToInt((str) -> str.length())
							.sum();
				
		System.out.println("Sum of the lengths : " + lengthSum);
	} 

}
