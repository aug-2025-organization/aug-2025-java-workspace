import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		SortedSet<String> allColors = new TreeSet<>();
		allColors.add("Red");
		allColors.add("Blue");
		allColors.add("Green");
		allColors.add("Black");
		
		allColors.forEach((eachColor) -> System.out.println(eachColor));
		
		System.out.println("--------------");
		SortedSet<Box> allBoxes = new TreeSet<>();
		
		allBoxes.add(new Box(1, 20, 10, 5));
		allBoxes.add(new Box(2, 25, 12, 6));
		allBoxes.add(new Box(3, 22, 11, 8, "Red"));
		allBoxes.add(new Box(2, 25, 12, 6));
		allBoxes.add(new Box(4, 25, 12, 6, "Blue"));
		allBoxes.add(new Box(5, 25, 12, 5));
		
		allBoxes.forEach((eachBox) -> System.out.println(eachBox));
	
	}

}
