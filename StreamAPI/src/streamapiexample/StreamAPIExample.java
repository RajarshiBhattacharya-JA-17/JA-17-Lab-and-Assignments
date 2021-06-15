/**
 * 
 */
package streamapiexample;

import java.util.ArrayList;
import java.util.List;


/**
 * @author Rajarshi
 *
 */
public class StreamAPIExample {

	/**
	 * @param args
	 */
	public static List<String> getPlaces() {
		// TODO Auto-generated method stub

		List<String> countries = new ArrayList<String>();
		
		countries.add("India, Kolkata");
		countries.add("France, Paris");
		countries.add("USA, New York");
		countries.add("India, Maharashtra");
		countries.add("India, Orissa");
		countries.add("India, Delhi");
		countries.add("India, Assam");
		countries.add("India, Chennai");
		
		return countries;
		
	}
	
	public static void main(String[] args) {
		
		List<String> states = getPlaces();
		System.out.println("States from India:");
		states.stream()
		.filter(p -> p.startsWith("India"))
		.map(p -> p.toUpperCase())
		.sorted()
		.forEach(p -> System.out.println(p));
		
		//Stream<Integer> intStream = Stream.of(1,2,3,4,5,6);
		//intStream.forEachOrdered(val -> System.out.println(val));
		
		long count = states.stream().filter((s) -> s.endsWith("a")).count();
		System.out.println(count);
		
	}

}
