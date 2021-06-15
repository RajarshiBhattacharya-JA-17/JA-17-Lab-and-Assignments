/**
 * 
 */
package com.capgemini.predicateinarrayexample;

import java.util.List;
import java.util.function.Predicate;
import java.util.ArrayList;

/**
 * @author Rajarshi
 *
 */
public class StudentMain {

	/**
	 * @param args
	 */
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> stdList = new ArrayList<Student>();
		stdList.add(new Student(1234, "ABCD"));
		stdList.add(new Student(1235, "BCD"));
		stdList.add(new Student(1236, "ABC"));
		
		List namewithA = filterByName(stdList,(Student s) -> s.getsName().startsWith("A"));
		System.out.println(namewithA);
	}

	@SuppressWarnings("rawtypes")
	private static List filterByName(List<Student> stdList, Predicate<Student>  pred) {
		// TODO Auto-generated method stub
		List<Student> resultList = new ArrayList<Student>();
		for(Student s : stdList) {
			if(pred.test(s)) {
				resultList.add(s);
			}
		}
		return resultList;
	}

}
