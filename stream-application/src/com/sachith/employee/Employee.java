package com.sachith.employee;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private String name;
	private Integer marks;
	
	public Employee(String name, Integer marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	
	static List<Employee> getAllEmployees(){
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Kri",90));
		employees.add(new Employee("Hashani",92));
		employees.add(new Employee("Lakshan",80));
		employees.add(new Employee("Kusal",88));
		employees.add(new Employee("Dananjaya",70));
		employees.add(new Employee("thirimanne",50));
		employees.add(new Employee("Sachith",40));
		return employees;
	}
	public String toString(){
		//return "name: "+getName()+" age: "+getMarks()+"\n";
		return getName()+"-"+getMarks();
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}



}
