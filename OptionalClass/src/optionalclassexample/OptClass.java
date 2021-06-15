/**
 * 
 */
package optionalclassexample;

import java.util.Optional;

/**
 * @author Rajarshi
 *
 */
public class OptClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str = new String[10];
		str[9] = "Hello";
		str[7] = "Hola";
		str[8] = "Gracious";
		Optional<String> emptyOp = Optional.empty();
		System.out.println(emptyOp);
		Optional<String> value = Optional.of(str[9]);
		System.out.println(value);
		System.out.println("Filtered Values: "
				+ value.filter(s -> s.equals("la")));
		System.out.println("Filtered Values: "
				+ value.filter(s -> s.equals("Hello")));
		System.out.println(value.hashCode());
		System.out.println(value.isPresent());
		System.out.println(Optional.ofNullable(emptyOp));
		System.out.println(Optional.ofNullable(value));
		
	}

}
