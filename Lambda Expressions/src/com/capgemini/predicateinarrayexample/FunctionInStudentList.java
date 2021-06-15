/**
 * 
 */
package com.capgemini.predicateinarrayexample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * @author Rajarshi
 *
 */
public class FunctionInStudentList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> stdList = new ArrayList<Student>();
		stdList.add(new Student(1234, "ABCD"));
		stdList.add(new Student(1235, "BCD"));
		stdList.add(new Student(1236, "ABC"));
		
		Function<Student, String> funcStdToString = (Student s) -> {
			return s.getsName();
		};
		Function<String, String> substr = (String s) -> s.substring(0, 1);
		List<String> studentMainInitails = convert(stdList,
				funcStdToString.andThen(substr));
		studentMainInitails.forEach(str -> {
			System.out.println(" "+str);
		});
		
	}
	
	public static List<String> convert(List<Student> stdList,
			Function<Student, String> funcStdToString){
		List<String> studentNameList = new ArrayList<String>();
		for(Student s : stdList) {
			studentNameList.add(funcStdToString.apply(s));
		}
		return studentNameList;
	}

}
