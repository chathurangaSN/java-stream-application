package com.sachith.employee;

import java.util.List;
import java.util.stream.Collectors;

public class F2Process {
	
	public static void main(String[] args) {
		
		System.out.println("--------------------------------");
		
		//Add Eng to name
		List<Employee> employees = Employee.getAllEmployees().stream()
				.map(e->new Employee("Eng: "+e.getName(),e.getMarks()))
				.collect(Collectors.toList());
		for ( Employee employee : employees) {
			System.out.println(employee);
		}
		System.out.println("--------------------------------");
		
		//mark multiply by 2
		List<Employee> employeesList1 = Employee.getAllEmployees().stream()
				.map(e->new Employee(e.getName(),e.getMarks()*2))
				.collect(Collectors.toList());
		for ( Employee employee : employeesList1) {
			System.out.println(employee);
		}
		System.out.println("--------------------------------");
		
		//count employee who have i in name
		Long count= Employee.getAllEmployees().stream()
				.filter(e->e.getName().contains("i"))
				.count();
		System.out.println(count);
		System.out.println("--------------------------------");
		
		
	}
}
