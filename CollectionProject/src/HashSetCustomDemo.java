import java.util.HashSet;
import java.util.Set;

public class HashSetCustomDemo {

	public static void main(String[] args) {
		Set<Box> allBoxes = new HashSet<>();
		
		allBoxes.add(new Box(1, 20, 10, 5));
		allBoxes.add(new Box(2, 25, 12, 6));
		allBoxes.add(new Box(3, 22, 11, 8, "Red"));
		allBoxes.add(new Box(2, 25, 12, 6));
		allBoxes.add(new Box(4, 25, 12, 6, "Blue"));
		
		allBoxes.forEach((eachBox) -> System.out.println(eachBox));
	}

}
