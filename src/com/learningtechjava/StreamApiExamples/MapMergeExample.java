package com.learningtechjava.StreamApiExamples;

import java.util.HashMap;
import java.util.Map;

public class MapMergeExample {

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
	}
	
}
