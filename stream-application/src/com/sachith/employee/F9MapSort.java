package com.sachith.employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class F9MapSort {
	public static void main(String[] args) {
		Map<String, Integer> students = new HashMap<>();
		students.put("Krish",100);
		students.put("Nuwan",90);
		students.put("Bhagya",60);
		students.put("Hasini",95);
		students.put("Suranga",65);
		students.put("Erandaka",65);
		students.put("Sachith",35);
		students.put("Chathu",40);
		
		
		
//		students.entrySet().stream()
//		         .filter(map -> map.getValue().intValue()>=40) //filter by value
//		         .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()))
//		         .forEach(System.out::println);

		
		
		//students.forEach(System.out::println);
		
		students.entrySet().stream()
		         .filter(map ->map.getValue().intValue()>=40)
		         .sorted((s1,s2)->s1.getValue().compareTo(s2.getValue()))
		         //.collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));
		         .collect(Collectors.toList());
		         //.forEach(s->System.out.println(s.getKey()));

		//System.out.println("Result: " + result1);
		
		List<String> strings=new ArrayList<>();
		students.entrySet().stream().filter(e->e.getValue()>=60)
		.sorted((s1,s2)->s1.getValue().compareTo(s2.getValue()))
		.peek(s->strings.add(s.getKey()))
		.collect(Collectors.toList());
		//System.out.println(strings);
		
		
		
		
		
		Map<Integer,String> vehicles = new HashMap<>();
		vehicles.put(10,"Car");
		vehicles.put(50,"SUV");
		vehicles.put(20,"JEEP");
		vehicles.put(12,"Bus");
		vehicles.put(15,"Ship");
		vehicles.put(16,"Lorry");
		vehicles.put(04,"Cycle");
		
		List<String> strings1 =new ArrayList<>();
		List<Integer> integers =new ArrayList<>();
		
		vehicles.entrySet().stream()
		.sorted((e1,e2)->-new Integer(e1.getKey().intValue()).compareTo(e2.getKey()))
		.peek(s->integers.add(s.getKey()))
		.collect(Collectors.toList())
		.stream()
		.filter(e->!e.getValue().equals("Ship"))
		.sorted((e1,e2)->(e1.getValue().compareTo(e2.getValue())))
		.peek(s->strings1.add(s.getValue()))
		.collect(Collectors.toList());



//        for (Integer integer : integers) {
//        	System.out.println(integer);
//		}
//        System.out.println("----------------------");
//        for (String string : strings1) {
//			System.out.println(string);
//		}
        
//		.forEach(
//		s->System.out.println(s.getValue())
//		//s2->System.out.println(s2.getValue())
//		);
//.peek(s->strings1.add(s.getValue()))
//.collect(Collectors.toList());
//.forEach(s->System.out.println(s.getValue());
//.collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));   
		
		
		
	}

}
