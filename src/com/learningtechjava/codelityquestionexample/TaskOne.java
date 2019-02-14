package com.learningtechjava.codelityquestionexample;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TaskOne {
	
	public static void main(String[] args) {
		
		Solution ss = new Solution();
		
		//System.out.println(ss.solution(1, 8, 3, 2, 6, 4)); 
		
		System.out.println("anser="+solution("ABCBBCBA"));
	}
	
	public static String solution(String S) {
        // write your code in Java SE 8
       List<String> rules= new ArrayList<>();
        rules.add("AA");
        rules.add("BB");
        rules.add("CC");
        boolean flag=true;
       // while(flag){
         	int count=0;
            for(int i=0;i<rules.size();i++)   {
            	count++;            	
            	if(S.contains(rules.get(i))){
            		S=S.replace(rules.get(i),"");            		
            	}else{            		
            		if(S.length()>0 && count == rules.size()){
            			i=0;
            			count=0;
            		}
            	}
            	
            	if(count == rules.size()){
            		i=0;
            		count=0;
            	}
            	
            	System.out.println(S);
            	System.out.println(count); 
            	
            	/*System.out.println(S);
            	boolean tempflag = S.contains(rule.getKey()); 
            	System.out.println(flag);
            	if(tempflag){
                S=S.replace(rule.getKey(),rule.getValue());
            	}*/
                //System.out.println(S);
           // }
        }
        
       
        
        return S;
    }
}
