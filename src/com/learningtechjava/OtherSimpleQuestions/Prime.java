package com.learningtechjava.OtherSimpleQuestions;

public class Prime {

    public static void main(String[] args) {
    	
    	/*
    	 * A prime number is a number which is divisible by only two numbers: 1 and itself.
    	 *  So, if any number is divisible by any other number, it is not a prime number.
    	 */
    	checkPrime(Integer.valueOf(args[0])); 
        
    }
    
    public static void checkPrime(int num){
    	
    	boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}