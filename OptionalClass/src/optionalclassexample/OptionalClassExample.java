/**
 * 
 */
package optionalclassexample;

import java.util.Optional;

/**
 * @author Rajarshi
 *
 */
public class OptionalClassExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str = new String[10];
		Optional<String> isNull = Optional.ofNullable(str[9]);
		if(isNull.isPresent()) {
			String subStr = str[9].substring(2, 5);
			System.out.println(subStr);
		}
		else {
			System.out.println("empty string");
		}
		
		str[9] = "Hello";
		Optional<String> isNull1 = Optional.ofNullable(str[9]);
		isNull1.ifPresent(s -> System.out.println(s.substring(2, 5)));
	}

}
