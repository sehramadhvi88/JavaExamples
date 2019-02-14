package com.learningtechjava.StreamApiExamples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountCharFrequency {

	public static void main(String[] args) {
	
		String str = "Hello World"; 	
		
		// using map.merge() from util available since Java 8
		System.out.println("using map.merge() from util available since Java 8==");
		method1_Java8(str);
		
		// using Java 8 stream api and collectors 
		System.out.println("using Java 8 stream api and collectors==");
		method2_Java8(str);
		
		System.out.println("using java 7 way");
		method3_Java7(str);
	}
	
	
	public static void method1_Java8(String str){
		
		Map<Character,Integer> freqs = new HashMap<>();
		for(char c:str.toCharArray()){
			freqs.merge(c, // key  = char
					1, 		// value to be merge
					Integer::sum); // counting two argument function Integer.sum(oldvalue , newvalue)
			System.out.println("Frequencies = "+freqs);
		}
		System.out.println("Final Frequencies = "+freqs);
		
		//Map.merge(key , value , BitFunction ) 
	}
	
	public static void  method2_Java8(String str){
		
		Map<Object, Long> freqs = Arrays.stream(str.toLowerCase().split("")).
				collect(Collectors.groupingBy( c->c , Collectors.counting())) ;
		
		freqs.forEach((k, v) -> System.out.println(k + ":" + v)); 
	}
	
	


	public static void method3_Java7(String str){
		
		Map<String, Long> charCount = new HashMap<>();
		for(char c:str.toLowerCase().toCharArray()){
			
			String charStr = Character.toString(c);
			if(charCount.containsKey(charStr)){
				long val = charCount.get(charStr)+1;
				charCount.put(charStr, val);
			}else {
	            charCount.put(charStr, 1l);
	        }
		}
		
		System.out.println("Character Count="+charCount);
	}
	
	
}
