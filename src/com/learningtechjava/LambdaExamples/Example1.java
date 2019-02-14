package com.learningtechjava.LambdaExamples;

public class Example1 {

	public static void main(String[] args) {
				
		/* instead of this inner anonymous class now we use LAMBDA EXPRESSION 
		 * 
		 * NumericTest nn = new NumericTest(){

			@Override
			public boolean computeTest(int n) { 
				// TODO Auto-generated method stub
				return false;
			}
			
		};*/
		
		NumericTest test1 = n -> (n%2) == 0; // Lambda without type
		NumericTest test2 = n -> (n>0);
		NumericTest test3 = (int n) -> (n<0); // Lambda with type
		
		/* test1 and test2 are two reference of NumericTest Interface 
		 * and defining different definitions 
		 * 
		 * 
		 */
		
		// using functon as parameter 
		System.out.println("test1.computeTest(7) =="+test1.computeTest(7));
		System.out.println("test2.computeTest(1) =="+test2.computeTest(1));
		System.out.println("test3.computeTest(-1) =="+test3.computeTest(-1));
		testinterface(() -> System.out.println("Hello its evening"));
	}
	
	static void testinterface(Greet greet){
		greet.greeting();
	}
	
}

interface NumericTest{
	
	boolean computeTest(int n);
	
}

@FunctionalInterface // not required but good to use , so that at compile time it's easy to check error if anyone adds one more abstract method
interface Greet{
	
	void greeting();
	
}

/* In Java 7 we need to make an implementation of 
 * this interface which provides method definition or 
 * we need to use it as anonymous inner class but with Java 8 
 * we can use it as function 
 * 
 *  
 *  
 *  
 * 
*/
