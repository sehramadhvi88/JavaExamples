package com.learningtechjava.StreamApiExamples;

public class StaticInterfaceMethodExample {

	public static void main(String[] args) {
		
		System.out.println(Util.numberOfCores()); 
		
	}
	
}


// interface with static methods ( in java interface can have static method , default method)
interface Util{
	
	public static int numberOfCores(){
		return Runtime.getRuntime().availableProcessors();
	}
}
