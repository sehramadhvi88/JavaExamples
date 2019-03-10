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
		
		Predicate<Integer> isGT4 = num -> (num >4);
		
		Integer i = 20;
		
		boolean resultCheck = isEven.test(i);
		
		System.out.println("resultCheck for input 20 = "+resultCheck);

		boolean resultCheck2 = isEven.test(31);
		
		System.out.println("resultCheck for input 31 = "+resultCheck2);
		
		//what if we want to check a number is even and greater than 4 both 
		
		System.out.println("Using two predicates together");
		
		boolean check = isGT4.and(isEven).test(5);
		boolean check1 = isGT4.or(isEven).test(5);
		System.out.println("is >4 and is even ?"+ check);
		System.out.println("is >4 or is even ?"+ check1); 
		
	}
	
}
