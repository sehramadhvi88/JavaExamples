package com.learningtechjava.LambdaExamples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class Example4UtilFunctions {

	public static void main(String[] args) {
		
		Map<Integer, String> players = new HashMap<Integer, String>();
		players.put(2, "Dani Carvajal");
		players.put(19, "Achraf Hakimi");
		players.put(4, "Sergio Ramos");
		players.put(12, "Marcelo");
		players.put(8, "Toni Kroos");
		players.put(7, "Christano Ronaldo");
		
		// Example of BiConsumer - which takes two parameter and return nothing 
		
		BiConsumer<Integer,String> consumer = (k,v) -> System.out.println(k+":"+v);
		
		players.forEach(consumer); // or players.forEach((k,v)->System.out.println(k+":"+v)); as one line 
		
		
		// example of removeIf(Predicate) function added in collections 
		
		List<String> playersList = new ArrayList<String>();
		playersList.add("Dani Carvajal");
		playersList.add("Achraf Hakimi");
		playersList.add("Sergio Ramos");
		playersList.add("Marcelo");
		playersList.add("Toni Kroos");
		playersList.add("Christano Ronaldo");
		playersList.add("Messi");
		 
		Predicate<String> predicate = player -> player.equals("Messi");
		playersList.removeIf(predicate);
		
		playersList.forEach((p) -> System.out.println(p)) ; 
		
		
		
		
		
		
		
	}
	
	
}
