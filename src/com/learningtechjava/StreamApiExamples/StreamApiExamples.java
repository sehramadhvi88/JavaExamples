package com.learningtechjava.StreamApiExamples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

import com.learningtechjava.model.Employee;

public class StreamApiExamples {

	public static void main(String[] args) {
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(500, "Shifoo", 150000));
		list.add(new Employee(504, "Oogway", 120000));
		list.add(new Employee(503, "Tigress", 100000));
		list.add(new Employee(730, "Mantis", 45000));
		
		// example 1 forEach(Consumer action)
		
		list.stream().forEach((p)-> System.out.println(p)); 
		//or
		list.stream().forEach(System.out::println);
		
		System.out.println("================================");
		// example 2 - filter(Predicate)
		
		list.stream().filter(p -> p.getName().length()>6).forEach(System.out::println);
		System.out.println("================================");
		// example 3 
		long count = list.stream().filter(p -> p.getName().length()>6).count();
		System.out.println("count ="+count); 
		
		System.out.println("================================");
		// example 4 , collect(Collectors.toList) convert streams into collection
		List<Employee> finalList = list.stream().filter(p -> p.getSalary() > 50000).collect(toList());
		
		finalList.forEach(e->System.out.println(e)); 
		
		System.out.println("================================");
		// example 5 , sorted() method added new 
		Comparator<Employee> byEmployeeNumber = (e1, e2) -> Integer.compare(
	            e1.getId(), e2.getId());
		
		list.stream().sorted(byEmployeeNumber).forEach(e->System.out.println(e));
		
		System.out.println("================================");
		
		
		// example 6 ,filter map 
		
		Map<Integer, String> MONTHS = new HashMap<Integer, String>();
		MONTHS.put(new Integer(1), "January");
	    MONTHS.put(new Integer(2), "February");
	    MONTHS.put(new Integer(3), "March");
	    MONTHS.put(new Integer(4), "April");
	    MONTHS.put(new Integer(5), "May");
	    MONTHS.put(new Integer(6), "June");
	    MONTHS.put(new Integer(7), "July");
	    MONTHS.put(new Integer(8), "August");
	    MONTHS.put(new Integer(9), "September");
	    MONTHS.put(new Integer(10), "October");
	    MONTHS.put(new Integer(11), "November");
	    MONTHS.put(new Integer(12), "December");
		
	    /*
	     * before Java 8 
	     * 
	     * 
	     *  Map<Integer, String> monthsWithLengthFour = new HashMap<Integer, String>();

    	for (Entry<Integer, String> entry : MONTHS.entrySet()) {
        	if (entry.getValue().length() == 4) {
            	monthsWithLengthFour.put(entry.getKey(), entry.getValue());
        	}
    	}
	     * 
	     */
		
	    Map<Integer, String> monthsWithLengthFour  = MONTHS.entrySet().stream().filter(p -> p.getValue().length() ==4 )
	    											.collect(toMap(p -> p.getKey(), p -> p.getValue()));
	    
	    System.out.println(monthsWithLengthFour); 
	    
	    List<String> listOfString = new ArrayList<>();
	    listOfString.add("Java");
	    listOfString.add("JavaScript");
	    listOfString.add("Python");
	    listOfString.add("C++");
	    listOfString.add("Ruby");

	    HashMap<String,Integer> map = (HashMap<String, Integer>) listOfString.stream().collect(toMap(Function.identity(), s ->s.length()));
	   System.out.println(map);
	}
	
}
