package com.learningtechjava.LambdaExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.learningtechjava.model.Employee;

public class SortCustomObject {

	public static void main(String[] args) {
		
		// Initial data
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(500, "Shifoo", 150000));
		list.add(new Employee(504, "Oogway", 120000));
		list.add(new Employee(503, "Tigress", 100000));
		list.add(new Employee(730, "Mantis", 45000));
		 
		
		// standard way of comparison 
		Comparator<Employee> sortByName = new Comparator<Employee>(){
			@Override
			public int compare(Employee e1, Employee e2) {
				// TODO Auto-generated method stub
				return e1.getName().compareTo(e2.getName());
			}			
		};
		
		System.out.println("Initail List=");
		for(Employee e:list){
			System.out.println(e);
		}
		
		Collections.sort(list, sortByName); 
		System.out.println("\nStandard Sorted by Name :");
		
		// for in loop
		for(Employee e:list){
			System.out.println(e);
		}
		
		// Using Lambda Expression 
		
		Comparator<Employee> sortByNameLambda = (Employee e1,Employee e2) -> e1.getName().compareTo(e2.getName());
		
		System.out.println("\n Lambda expression Sorted by Name :");
		list.sort(sortByNameLambda);
		
		list.forEach(System.out::println);
		
		Comparator<Employee> sortByIdLambda = (Employee e1,Employee e2) -> e1.getId()-e2.getId();
		
		System.out.println("\n Lambda expression Sorted by Id :");
		list.sort(sortByIdLambda);
		
		list.forEach(System.out::println);
		
	}
	
}
