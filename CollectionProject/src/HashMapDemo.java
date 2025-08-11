import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, Long> phoneBook = new HashMap<>();
		
		// C
		phoneBook.put("abc", 1111111111L);
		phoneBook.put("xyz", 44444444444L);
		phoneBook.put("lmn", 6666666666L);
		phoneBook.put("qwe", 2222222222L);
		phoneBook.put(null, 8888888888L);
		
		// R
		Set<String> allKeys = phoneBook.keySet();
		for(String eachKey: allKeys) {
			System.out.println(eachKey + " :: " + phoneBook.get(eachKey));
		}
		System.out.println("------------");
		
	
		// U
		phoneBook.replace("xyz", 2323232323L);
		phoneBook.forEach((key, value) -> System.out.println(key + " :: " + value));
		System.out.println("------------");
		
		// D
		phoneBook.remove("qwe");
		Set<Entry<String, Long>> entrySet = phoneBook.entrySet();
		for(Entry eachEntry: entrySet) {
			System.out.println(eachEntry.getKey() + " :: " + eachEntry.getValue());
		}
		
		System.out.println("------------");
	}
}
