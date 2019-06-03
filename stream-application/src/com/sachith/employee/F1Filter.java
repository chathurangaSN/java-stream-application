package com.sachith.employee;

import java.util.List;
import java.util.stream.Collectors;

public class F1Filter {
	
public static void main(String[] args) {
	
	List<Employee> employeeList = Employee.getAllEmployees()
			.stream()
			.filter(e->e.getName().length()>5)
			.collect(Collectors.toList());
	
	for ( Employee employee : employeeList) {
		System.out.println(employee.toString());
	}
	
	
}

}
