package com.sachith.employee;

import java.util.stream.Stream;

public class F8Of {
	
	public static void main(String[] args) {
		
		Stream.of(1,3,5,4,6,34,7,2,4).sorted().forEach(System.out::println);
		System.out.println("-----------------");
		
		Integer[] integers ={1,3,4,6,8,34,36,21,2,7};
		Stream<Integer> stream = Stream.of(integers);
		stream.sorted().forEach(System.out::println);
		
	}

}
