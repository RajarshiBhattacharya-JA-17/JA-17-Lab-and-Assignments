/**
 * 
 */
package com.capgemini.lambdaexample;

import java.util.function.Predicate;

/**
 * @author Rajarshi
 *
 */
public class LambdaExpressionExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Addition ad = (a,b) -> (a+b);
		Multiplication m = (a,b) -> {
			System.out.println(a*b);
		};
		
		System.out.println(ad.add(55, 45));
		m.mul(10, 20);
		
		Predicate<Integer> greater = age -> (age > 18);
		Predicate<Integer> lesser = age -> (age < 18);
		
		//System.out.println(checkAge.test(20));
		
		boolean checkAge = greater.or(lesser).test(25);
		System.out.println(checkAge);
	}

}
