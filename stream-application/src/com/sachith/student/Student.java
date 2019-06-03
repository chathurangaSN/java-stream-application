package com.sachith.student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private LocalDate dob;
	
	public Student(String name, LocalDate dob) {
		super();
		this.name = name;
		this.dob = dob;
	}
	static List<Student> getAllStudents(){
		List<Student> students = new ArrayList<>();
		students.add(new Student("Sachith",LocalDate.of(1992, 03, 11)));
		students.add(new Student("Malith",LocalDate.of(1998, 04, 21)));
		students.add(new Student("Udara",LocalDate.of(1999, 05, 12)));
		students.add(new Student("Jagath",LocalDate.of(2003, 06, 03)));
		students.add(new Student("Sudath",LocalDate.of(2008, 07, 02)));
		students.add(new Student("Maura",LocalDate.of(2001, 11, 13)));
		students.add(new Student("Chathu",LocalDate.of(2011, 01, 01)));
		
		return students;
	}
	public String toString(){
		//return "name: "+getName()+" age: "+getMarks()+"\n";
		return getName()+"-"+getDob();
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	
	
	

}
