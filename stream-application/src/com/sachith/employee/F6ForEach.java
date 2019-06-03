package com.sachith.employee;



public class F6ForEach {
	
	public static void main(String[] args) {
		
		Employee.getAllEmployees().stream()
				.filter(e->-e.getName().length()>=5)
				.map(e->new Employee(e.getName().substring(0,1).toUpperCase().concat(e.getName().substring(1,e.getName().length())),e.getMarks()))
				.sorted((e1,e2)->e1.getName().compareTo(e2.getName()))
				.forEach(System.out::println);
				
			
		
		//System.out.println(sortedEmployees4);
		
		//Employee.getAllEmployees().forEach(System.out::println);
				
		
	}

}
