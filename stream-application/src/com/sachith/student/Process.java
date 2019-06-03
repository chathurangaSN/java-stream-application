package com.sachith.student;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Process {
	
	public static void main(String[] args) {
		
		System.out.println("--------------------------------");
		
				List<Student> studentList =Student.getAllStudents().stream()
						.map(e->new Student(e.getName(),e.getDob()))
						.collect(Collectors.toList());
				
				for ( Student student : studentList) {
					System.out.println(student);
				}
		System.out.println("--------------------------------");
		
				//
				List<Student> studentList2 =Student.getAllStudents().stream()
						.filter(e->(e.getDob().getYear()-LocalDate.now().getYear())*-1>18)
						.collect(Collectors.toList());
				
				for ( Student student : studentList2) {
					System.out.println(student);
				}
				System.out.println("--------------------------------");
		
		
		
		
		
		
	}
}
