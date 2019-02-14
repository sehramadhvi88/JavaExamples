package com.learningtechjava.StreamApiExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class BasicWithStreams {

	public static void main(String[] args) {
		
		// We can create Streams from list and arrays 
		
		// 1.
		String[] arr = new String[]{"foo","bar","baz"};
		
		Stream<String> strStream = Arrays.stream(arr);
		
		// Iterating
		strStream.forEach(System.out::println); 
		
		// 2.
		
		Stream<String> strStream2 = Stream.of("A","B","C");
		
		strStream2.forEach(System.out::println);
		
		System.out.println("===Stream from List===");
		
		// 3. 
		
		List<String> list = Arrays.asList("Cat","Bat","Rat");
		
		Stream<String> listStream = list.stream();
		
		list.parallelStream().forEach(System.out::println);
		
		System.out.println("===Stream on pattern===");
		
		// Example 4
		
		String sentence = "Program creek is a Java site.";
		Stream<String> wordStream = Pattern.compile("\\W").splitAsStream(sentence);
		String[] wordArr = wordStream.toArray(String[]::new);
		System.out.println(Arrays.toString(wordArr));
		
		/*
		 *  Pattern p = Pattern.compile("a*b");
 Matcher m = p.matcher("aaaaab");
 boolean b = m.matches();

		 * 
		 * 
		 */
		
		System.out.println("===Stream of primitives===");
		
		// Example 5 , Stream of primitives 
		
		IntStream intStream = IntStream.range(1, 3);
		LongStream longStream = LongStream.rangeClosed(1, 3);
		
		intStream.forEach(i-> System.out.println(i));
		longStream.forEach(l-> System.out.println(l));
		
		System.out.println("===Example 6 Stream of Strings===");
		
		// Example 6 Stream of Strings 
		
		IntStream streamOfChars = "abc".chars();
					 
		Stream<String> splitStream = Pattern.compile("").splitAsStream("Hello World");
		splitStream.forEach(s->System.out.println(s));
		
		// Count chars 
		
		 Map<String,Long> charCount = Pattern.compile("").splitAsStream("Hello World").
				 			collect(Collectors.groupingBy(c-> c , Collectors.counting()));
		
		charCount.forEach((k,v) -> System.out.println(k+":"+v)); 
		
	}	
}
