package com.learningtechjava.StreamApiExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringJoinerExample {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Tom","Jerry","Jane","JAck");
		
		// suppose I want to print names in uppercase and comma separted
		
		for(String name:names){
			System.out.print(name.toUpperCase()+","); 
		}
		/*
		 * TOM,JERRY,JANE,JACK, // but it will add comma in last and now we need to remove and alot more code
		 */
		System.out.println("\n Using Streams");
		// use streams
		
		System.out.println(names.stream().map(s -> s.toUpperCase()).collect(Collectors.joining(","))); 
		
		
		
	}
	
	
	
}
