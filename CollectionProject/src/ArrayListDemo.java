import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> countries = new ArrayList<>();
		
		// CRUD
		
		// C - Create
		countries.add("Pakistan");
		countries.add("India");
		countries.add("Nepal");
		countries.add("Bhutan");
		countries.add("Sri Lanka");
		countries.add("Myanmar");
		countries.add("Afghanistan");
		countries.add("China");
		countries.add("Bangladesh");
		countries.add("Pakistan");
		
		// R - Read
		System.out.println(countries.get(4));
		System.out.println("--------------");
		for(int i=0;i<countries.size();i++) {
			System.out.println(countries.get(i));
		}
		System.out.println("--------------");
		
		// U - Update
		countries.set(4, "SriLanka");
		for(String eachCountry: countries) {
			System.out.println(eachCountry);
		}
		System.out.println("--------------");
		
		// D - Delete
		countries.remove(4);
		countries.remove("Pakistan");
		countries.forEach((eachCountry) -> System.out.println(eachCountry));
		System.out.println("--------------");
		
		countries.removeIf((str) -> str.startsWith("B"));
		Iterator<String> itr = countries.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("--------------");
		countries.clear();
		System.out.println("isEmpty ? " + countries.isEmpty());
	}

}
