package com.sachith.employee;

import java.util.List;
import java.util.stream.Collectors;

public class F3FilterProcess {
	
	public static void main(String[] args) {
		
		//filter names who have i and multiply by 2
		List<Employee> employeesList2 =Employee.getAllEmployees()
				.stream()
				.filter(e->e.getName().contains("i"))
				.map(e->new Employee(e.getName(),e.getMarks()*2))
				.collect(Collectors.toList());
		
		for ( Employee employee : employeesList2) {
			System.out.println(employee);
		}
		System.out.println("--------------------------------");	

		
	}
	
}
