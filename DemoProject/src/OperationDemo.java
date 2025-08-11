import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class OperationDemo {

	public static void main(String[] args) {
		Operation opp = new Addition();
		System.out.println("first way : add : " + opp.operate(5, 3));
		
		opp = new Multiplication();
		System.out.println("first way : product : " + opp.operate(4, 3));
		
		Operation add1 = new Operation() {
			@Override
			public int operate(int n1, int n2) {
				return n1 + n2;
			}
		};
		System.out.println("second way : add : " + add1.operate(5, 3));
		
		Operation mul1 = new Operation() {
			@Override
			public int operate(int n1, int n2) {
				return n1 * n2;
			}
		};
		System.out.println("second way : product : " + mul1.operate(4, 3));
		
		Operation add2 =(n1, n2) -> n1 + n2;
		System.out.println("third way : add : " + add2.operate(5, 3));
		
		Operation mul2 = (num1, num2) -> num1 * num2;
		System.out.println("third way : product : " + mul2.operate(4, 3));
		
		BiFunction<Integer, Integer, Integer> add3 = (a, b) -> a + b;
		System.out.println("fourth way : add : " + add3.apply(5, 3));
		
		BiFunction<Double, Double, Double> mul3 = (q, w) -> q * w;
		System.out.println("fourth way : product : " + mul3.apply(4.5, 3.2));
		
		Predicate<String> check = (str) -> str.isEmpty();
		System.out.println("check is string is empty?" + check.test("dfgd"));
		
		Predicate<Integer> checkPrime = (num) -> {
			for(int i=2;i<=Math.sqrt(num);i++) {
				if(num % i == 0) {
					return false;
				}
			}
			return true;
		};
		
		System.out.println("isPrime : " + checkPrime.test(15));
		
		BiFunction<String, String, String> concat = (str1, str2) -> str1 + str2;
		System.out.println("COncat : " + concat.apply("hello,", "welcome"));
		
		Function func = s -> ((String) s).length(); 
		System.out.println(func.apply("Java"));
		
		Integer i10 = 10;
		int i20 = i10;
		
	}

}
