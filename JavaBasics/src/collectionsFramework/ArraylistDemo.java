package collectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();

		cities.add("Paris");
		cities.add("London");
		cities.add("Tokyo");
		cities.add("New York");
		cities.add("New Delhi");
		
		//Adding a comment at line 17

//		for (String t : cities) {
//			System.out.println(t);
//		}
		
		Iterator<String> itr = cities.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		

		System.out.println("Total number of elements = " + cities.size());

	}

}
