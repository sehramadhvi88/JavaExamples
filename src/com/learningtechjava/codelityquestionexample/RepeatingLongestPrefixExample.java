package com.learningtechjava.codelityquestionexample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatingLongestPrefixExample {

	public static void main(String[] args) {
		
		List<String> repeatingPrefix = Arrays.asList("Road","Room","Raid","Rain","Rank"); 
		int len = repeatingPrefix.size();
		 
		Map<String,Integer> dictionary = new HashMap<String,Integer>();
		
			for(int i=0;i<repeatingPrefix.size();i++){
			
				String str = "";
				
				System.out.println(repeatingPrefix.get(i)); 
				
				for(int j=0;j<repeatingPrefix.get(i).length();j++){
					
					str = str+repeatingPrefix.get(i).charAt(j);
					
					System.out.println(str); 
					System.out.println(repeatingPrefix.get(len-1-i)); 
					if(repeatingPrefix.get(len-1-i).contains(str)){
						
						if(dictionary.containsKey(str)){
							dictionary.put(str,dictionary.get(str)+1);
						}else{							
							dictionary.put(str,1);
							//break;
						}
						System.out.println(dictionary);
						
					}else{
						if(dictionary.containsKey(str)){
							dictionary.put(str,dictionary.get(str)+1);
						}else{							
							dictionary.put(str,1);
							//break;
						}						
						System.out.println(dictionary);
						
					}
									
				}
			
			
			
			}
		
		System.out.println(dictionary);
		
		}
		
		
		
		
		
		
	}
	

