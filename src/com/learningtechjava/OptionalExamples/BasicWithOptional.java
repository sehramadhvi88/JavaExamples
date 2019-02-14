package com.learningtechjava.OptionalExamples;

import java.util.Optional;

import com.learningtechjava.model.Employee;

public class BasicWithOptional {

	public static void main(String[] args) {
		 
		Optional<Employee> empOptional = Optional.empty();
		
		Employee emp = new Employee(500, "Shifoo", 150000);
		
		Optional<Employee> empOp = Optional.of(emp); // if emp is null then it would throw NullPointerException
		//Optional<Employee> empOp1 = Optional.of(null);
		
		Optional<Employee> empOp1 = Optional.ofNullable(null); // if object is non-null then return values else return empty optional
		
		System.out.println("checking empOp1");
		
		if(empOp1.isPresent()){
			System.out.println("value found");
		}else{
			System.out.println("not found");
		}
		
		System.out.println("checking empOp");
		
		if(empOp.isPresent()){
			System.out.println("value found="+empOp.get());
		}else{
			System.out.println("not found");
		}
		
		// ifPresent  - takes consumer and does action if value is present
		
		empOp1.ifPresent(e->System.out.println("value ="+e));
		empOp.ifPresent(e->System.out.println("value ="+e));
		
		
		// Example - orElse 
		
		
		Employee finalEMp = (emp != null) ?emp : new Employee(0,"Test",10);
		
		// we can re-write this logic like below also 
		
		Employee finalEmp = empOp.orElse(new Employee(0,"Test",10)); // Return the value if present, otherwise return other.

		
		
		
	}
	
}
