package collectionsFramework;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> cities = new LinkedList<>();
		
		cities.add("Paris");
		cities.add("London");
		cities.add("Tokyo");
		cities.add("New York");
		cities.add("New Delhi");
		cities.add("Paris");
		
		//Adding another comment in LinkedList

		for (String t : cities) {
			System.out.println(t);
		}

		System.out.println("Total number of elements = " + cities.size());

		
	}

}
