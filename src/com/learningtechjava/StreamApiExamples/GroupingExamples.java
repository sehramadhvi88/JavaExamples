package com.learningtechjava.StreamApiExamples;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.learningtechjava.model.Employee;

public class GroupingExamples {

	public static void main(String[] args) {
		
		// Initial data
				ArrayList<Employee> list = new ArrayList<Employee>();
				list.add(new Employee(500, "Shifoo", 150000));
				list.add(new Employee(504, "Oogway", 120000));
				list.add(new Employee(501, "Tom", 120000));
				list.add(new Employee(503, "Tigress", 100000));
				list.add(new Employee(730, "Mantis", 45000));
				list.add(new Employee(600, "Sara", 45000));
				
				// grouping by salary 
				System.out.println(list.stream().collect(groupingBy(Employee::getSalary)));
				
				
				//grouping by salary and get name mapping only
				System.out.println(list.stream().
				collect(groupingBy(Employee::getSalary,mapping(Employee::getName, toList()))));
				
				System.out.println("another Example ");
				
				Map<String,Integer> scores = new HashMap<>();
				scores.put("Jack", 12);
				scores.put("Jill", 15);
				scores.put("Tom", 11);
				scores.put("Darla", 15);
				scores.put("Nick", 15);
				scores.put("Nancy", 11);
				
				System.out.println(groupByScores(scores));
				scores.put("Jack", 12);
				 
				
		
	}

	private static Map<Integer,List<String>> groupByScores(Map<String, Integer> scores) {
		// TODO Auto-generated method stub
		
		return scores.keySet().stream().collect(groupingBy(k -> scores.get(k)));  // scores::get
		
	}
	
	/*
	 * with Java 8 new api , we need make a map of integer and List of strings like this 
	 * Map<Integer,List<String>> which contains score and corresponding names having same score
	 * 
	 */
	
}
