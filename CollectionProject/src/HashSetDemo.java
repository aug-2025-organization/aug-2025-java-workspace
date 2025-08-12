import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<>();
		
		// CRUD
		
		// C - Create
		numbers.add(4);
		numbers.add(2);
		numbers.add(8);
		numbers.add(6);
		numbers.add(10);
		numbers.add(12);
		numbers.add(584);
		numbers.add(356);
		numbers.add(144);
		numbers.add(12);
		numbers.add(null);
		
		// R - Read
		for(Integer num: numbers) {
			System.out.println(num);
		}
		System.out.println("------------");
		
		// U - Update
		numbers.remove(12);
		numbers.add(122);
		Iterator<Integer> itr = numbers.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("------------");
		
		// D - Delete
		numbers.removeIf((eachNum) -> {
			if(eachNum != null && eachNum < 100) {
				return true;
			}
			return false;
		});
		numbers.forEach((eachNum) -> System.out.println(eachNum));
		System.out.println("------------");
		
		
	}
}
