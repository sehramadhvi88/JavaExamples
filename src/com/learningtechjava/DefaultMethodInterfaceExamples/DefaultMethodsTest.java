package com.learningtechjava.DefaultMethodInterfaceExamples;

public class DefaultMethodsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer printer = new PrinterAndScanner();
		 printer.print();
	}

}

interface Printer{
	default void print(){
		System.out.println("I can print");
	}
}

interface Scanner{
	default void scan(){
		System.out.println("I can scan");
	}
}

class PrinterAndScanner implements Printer,Scanner{
	
	public void print(){
		Scanner.super.scan();
		Printer.super.print();
	}
	
}


interface Fly{
	default void takeOff()
	{ System.out.println("fly::takeOff"); };
	default void turn()
	{ System.out.println("fly::turn");  };
	default void cruise()
	{ System.out.println("fly::cruise");  };
	default void land()
	{ System.out.println("fly::land");  };
	int getState();
	
}