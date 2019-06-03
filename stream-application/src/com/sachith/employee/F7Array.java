package com.sachith.employee;

public class F7Array {
	
	public static void main(String[] args) {
		
		Employee[] employees = Employee.getAllEmployees()
				.stream()
				.toArray(Employee[]::new);
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
	

}
