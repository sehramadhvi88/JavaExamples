package com.learningtechjava.LambdaExamples;

import java.util.function.Predicate;

public class Example3Predicates {

	public static void main(String[] args) {
		
		// with anonymous class
		
		Predicate<String> isALongWord = new Predicate<String>(){

			@Override
			public boolean test(String arg0) {
				// TODO Auto-generated method stub
				return arg0.length() > 10;
			}
		};
		
		String str = "Successfull";
		
		boolean result = isALongWord.test(str);
		
		
		System.out.println("result = "+result);
		
		// with lambda 
		
		Predicate<Integer> isEven = num -> ( num %2 == 0);
		
		Integer i = 20;
		
		boolean resultCheck = isEven.test(i);
		
		System.out.println("resultCheck for input 20 = "+resultCheck);

		boolean resultCheck2 = isEven.test(31);
		
		System.out.println("resultCheck for input 31 = "+resultCheck2);
		
		
		
	}
	
}
