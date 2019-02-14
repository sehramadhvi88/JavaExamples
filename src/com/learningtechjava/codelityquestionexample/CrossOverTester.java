package com.learningtechjava.codelityquestionexample;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class CrossOverTester {
	
    /**
     * Complete the function below.
     * DONOT MODIFY anything outside this function!
     */
static int[] rearrange(int[] elements) {
        
        Map<Integer,Integer> sortArr= new HashMap<Integer,Integer>();
        
        for(int i=0;i<elements.length;i++){
            
        	int x = elements[i];
        	if(sortArr.get(x) == null){
        	    
        	    int a, countOne = 0, n1;
                n1=x;
                while(n1>0){
                        
                     a = n1%2;
                     if(a == 1){
                         countOne++;
                     }
                     n1 = n1/2;
                    
                }
        	    
        		sortArr.put(x, countOne);
        	}
             
        }
        
        Set<Entry<Integer,Integer>> set = sortArr.entrySet();
        List<Entry<Integer,Integer>> list = new ArrayList<Entry<Integer,Integer>>(set);
        
        list.sort((Map.Entry<Integer,Integer> o1,Map.Entry<Integer,Integer> o2) -> o1.getValue().compareTo(o2.getValue()));
        int[] newArray = new int[sortArr.size()];
        int count=0;
        for(Map.Entry<Integer, Integer> entry:list){
        	newArray[count] = entry.getKey();
        	count++;
        }
        return newArray;
    }
    /**
     * DO NOT MODIFY THIS METHOD!
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        
        int n = 0;
        n = Integer.parseInt(in.nextLine().trim());
        int[] elements = new int[n];
        int element;
        for (int i = 0; i < n; i++) {
            element = Integer.parseInt(in.nextLine().trim());
            elements[i] = element;
        }
        
        // call rearrange function
        int[] results = rearrange(elements);
        
        for (int i = 0; i < results.length; i++) {
            System.out.println(String.valueOf(results[i]));
        }
    }
}