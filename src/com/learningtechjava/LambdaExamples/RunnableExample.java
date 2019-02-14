package com.learningtechjava.LambdaExamples;

public class RunnableExample {

	public static void main(String[] args) {
		
		
		Thread myThread = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Print from runnable");
			}
					
		});
		
		myThread.start();
		
		// instead of anonymous runnable class we can lambda expression for it 
		Thread myLambdaThread = new Thread(() -> System.out.println("PRint from lambda thread"));
		myLambdaThread.start();
		
		
		// example using method reference
		Thread myMethodRefThread = new Thread(RunnableExample::myPrint); // this is equivalent to RunnableExample::myPrint === ()-> myPrint()
		myMethodRefThread.start();
		
	}
	
	public static void myPrint(){
		System.out.println("Example test");
	}
	
}
