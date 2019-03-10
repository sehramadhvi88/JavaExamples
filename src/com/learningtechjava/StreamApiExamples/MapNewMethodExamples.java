package com.learningtechjava.StreamApiExamples;

import java.util.HashMap;
import java.util.Map;

public class MapNewMethodExamples {

	public static void main(String[] args) {
		
		example1();
	}
	
	public static void example1(){
		
		Map<String, Integer> prices = new HashMap<>();
		 
        prices.put("veggies", null);
        System.out.println("Prices map: " + prices);
 
        // No need to handle initial null value:
        prices.merge("veggies", 42, Integer::sum);
        System.out.println("Prices map: " + prices);
        
        prices.merge("veggies", 5, Integer::sum);
        System.out.println("Prices map: " + prices);
        
        Map<Integer,Double> sqrt = new HashMap<>();
        
        // check if present or not
        sqrt.computeIfAbsent(2, MapNewMethodExamples::compute);
        sqrt.computeIfAbsent(2, MapNewMethodExamples::compute);
        System.out.println(sqrt); 
        sqrt.computeIfPresent(2,(a,b)->(a+b));
        System.out.println(sqrt); 
	}
	
	public static double compute(Integer i){
		System.out.println("in compute");
		return Math.sqrt(i);
	}
	
}

/* 1) merge :
 * 2) computeIfAbsent : If the specified key is not already associated with a value (or is mapped to null), attempts to compute its value using the given mapping function and enters it into this map unless null. 
 * 
 */

