package collectionsFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	
	public static void main(String[] args) {
		HashMap<String,Integer> td = new HashMap<>();
		
		td.put("Tim", 12345);
		td.put("Bob", 23456);
		td.put("Sam", 34567);
		td.put("Tim", 98765);
		
		for (Map.Entry m: td.entrySet()){
			System.out.println(m.getKey() + " - " + m.getValue());
		}
		
		
		
	}

}
