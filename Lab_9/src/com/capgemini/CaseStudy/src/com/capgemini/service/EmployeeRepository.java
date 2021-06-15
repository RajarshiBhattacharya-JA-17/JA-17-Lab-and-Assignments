/**
 * 
 */
package com.capgemini.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.capgemini.model.Department;
import com.capgemini.model.Employee;



/**
 * @author Rajarshi
 *
 */
public class EmployeeRepository {
	
	static List<Employee> list = new ArrayList<Employee>();
	
	Scanner sc = new Scanner(System.in);
	Department cash = new Department(1,"Accounts",3);
	Department hr = new Department(2, "HR", 2);
	Department tech = new Department(3,"Tech", 4);
	Department errands = new Department(4,"Errands", 5);
	
	Employee e1 = new Employee(1,"Rajarshi","Bhattacharya","raj@gmail.com","9876543210", LocalDate.of(2021, 10, 24), "Team Lead", 30000.0, 6, hr );
	Employee e2 = new Employee(2,"Dibyendu","Ganguly","dibyendu@gmail.com","9874113493",  LocalDate.of(2021, 10, 19) , "Manager", 30000.0, tech );
	Employee e3 = new Employee(3,"Utkarsh","Parashar","utkarsh@gmail.com","9939393907", LocalDate.of(2020, 4, 10), "Manager", 30000.0, 1, cash );
	Employee e4 = new Employee(4,"Pulak","Das","pulak@gmail.com","9874112293", LocalDate.of(2020, 6, 20), "Cleark", 30000.0, 6 );
	
	
	
	public void addEmployee() {
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
	}
	
	public Double salSum() {
		return EmployeeRepository.list.stream().mapToDouble(o->o.getSalary()).sum();
	}
	
	public Map<Department, Long> deptAndEmpCount() {
		
		Map<Department, Long> result = EmployeeRepository.list.stream()
				.filter(Employee -> Employee.getDepartment() != null)
		        .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		
		result.entrySet().stream().forEach(e -> System.out.println(e.getKey().getDepartmentName() + ":" + e.getValue()));
		return result;
	}
 
	public List<Employee> getSeniorEmployee() {
		LocalDate date = EmployeeRepository.list.stream().map(u -> u.getHireDate()).min(LocalDate::compareTo).get();
		EmployeeRepository.list.stream()
        .filter(e -> e.getHireDate() == date)
        .map(Employee::getFullName)
        .forEach(System.out::println);
		
		return EmployeeRepository.list.stream()
        .filter(e -> e.getHireDate() == date)
        .collect(Collectors.toList());
	}
	
	public void getEmpAndDuration() {
		LocalDate now = LocalDate.now();
		System.out.format("%25s|%8s|%6s\n"
						+ "-----------------------------------------\n","Name","Months","Days");
		EmployeeRepository.list.stream().forEach(e -> System.out.format("%25s|%8s|%6s\n",e.getFullName(), ChronoUnit.MONTHS.between(e.getHireDate(),now) ,ChronoUnit.DAYS.between(e.getHireDate(),now) )) ;
	}
	
	public void getEmpWithoutDepartment() {
		EmployeeRepository.list.stream()
		.filter(Employee -> Employee.getDepartment() == null)
		.forEach(e -> System.out.print(e.getFullName()+"\n"));
	}
	
	public  void getDeptWithoutEmp() {
		
	}
	
	public void getDepartmentWithHighestEmployee() {
		
		Long maxCount = EmployeeRepository.list.stream()
				.filter(Employee -> Employee.getDepartment() != null)
		        .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
		        .entrySet().stream().max(Map.Entry.comparingByValue()).get().getValue();
		
		EmployeeRepository.list.stream()
		.filter(Employee -> Employee.getDepartment() != null)
        .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
        .entrySet().stream()
        .filter(e -> e.getValue() == maxCount)
        .map(Map.Entry::getKey)
        .collect(Collectors.toList())
        .forEach(e -> System.out.print(e.getDepartmentName()+"\n"));
		
	}
	
	public void getEmpNameHireDateAndDayOfWeekOfStarting() {
		System.out.format("%25s|%10s|%6s\n"
				+ "------------------------------------------------------------\n","Name","HireDate","Day of week of starting");
		EmployeeRepository.list.stream().forEach(e -> System.out.format("%25s|%10s|%6s\n",e.getFullName(), e.getHireDate(),e.getHireDate().getDayOfWeek())) ;

	}
	
	public void getEmpNameHireDateAndDayOfWeekOfStartingIsFriday() {
		System.out.format("%25s|%10s\n"
				+ "------------------------------------------------------------\n","Name","HireDate");
		EmployeeRepository.list.stream()
		.filter(e -> e.getHireDate().getDayOfWeek().toString()=="FRIDAY")
		.forEach(e -> System.out.format("%25s|%10s\n",e.getFullName(), e.getHireDate())) ;

	}
	
	public String getEmployeeNameById(int id) {
		return EmployeeRepository.list.stream()
				.filter(e -> e.getEmployeeId()==id)
				.findAny().get().getFullName();
	}
	
	public void getEmployeeManagerDetails() {
		EmployeeRepository.list.stream()
				.filter(Employee -> Employee.getManagerId() != null)
				.collect(Collectors.toList())
				.forEach(e->System.out.println(e.getFullName()+" reports to "+ getEmployeeNameById(e.getManagerId())));
		        
	}
	
	public void getEmployeeWithoutManager() {
		System.out.format("%25s\n"
				+ "-------------------------\n","Name");
		EmployeeRepository.list.stream()
		.filter(e -> e.getManagerId() == null)
		.forEach(e -> System.out.format("%25s\n",e.getFullName())) ;
	}
	  
	public void getEmployeeByManagerName() {
		System.out.print("Enter first name: ");
		String fn = sc.next();
		System.out.print("Enter last name: ");
		String ln = sc.next();
		System.out.println("Subordinates of "+fn+" "+ln+":");
		
		int mangId = EmployeeRepository.list
				.stream()
				.filter(e -> e.getFullName().equals(fn+" "+ln))
				.findAny().get().getEmployeeId();
		EmployeeRepository.list
		.stream()
		.filter(e->e.getManagerId()!=null && e.getManagerId()==mangId)
		.forEach(e->System.out.println(e.getFullName()));
	}
	
	public void sortEmployeeById() {
		EmployeeRepository.list
		.stream() 
        .sorted((p1, p2) -> p1.getEmployeeId() - p2.getEmployeeId())
        .collect(Collectors.toList())
        .forEach(e->System.out.println(e));
	}
	
	public void sortEmployeeByDepartmentId() {
		EmployeeRepository.list
		.stream() 
		.filter(e -> e.getDepartment()!= null)
        .sorted((p1, p2) -> p1.getDepartment().getDepartmentId() - p2.getDepartment().getDepartmentId())
        .collect(Collectors.toList())
        .forEach(e->System.out.println(e));
	}
	
	public void sortEmployeeByName() {
		EmployeeRepository.list
		.stream() 
        .sorted((p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName())) 
        .collect(Collectors.toList())
        .forEach(e->System.out.println(e.getFullName()));
	}
	
}
