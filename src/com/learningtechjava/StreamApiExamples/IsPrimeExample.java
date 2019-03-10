package com.learningtechjava.StreamApiExamples;

import java.util.stream.IntStream;

public class IsPrimeExample {

	public static void main(String[] args) {
		
		for(int i=1;i<8;i++){
			System.out.println("number "+i+ " is prime :"+isPrime(i));			
		}		
		
		System.out.println("=============");
		
		for(int i=1;i<8;i++){
			System.out.println("number "+i+ " is prime :"+isPrimeCheckUsingStream(i));			
		}	
		
	}

	private static boolean isPrime(int i) {
		// TODO Auto-generated method stub
		boolean divisible = false;
		for(int j=2;j<i;j++){
			if(i%j == 0){
				divisible = true;
				break;
			}
		}
		return i>1 && !divisible;
	}
	
	private static boolean isPrimeCheckUsingStream(int number){
		
		return number >1 && IntStream.range(2,number).noneMatch(i -> number%i == 0);
				
	}
	
	
	
}
