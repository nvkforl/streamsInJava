package com.demo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListFilterNames {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("peter", "prateek", "Parker", "Rambo");
		// Filter takes the predicate for filtering
		List<String> collect = names.parallelStream().filter(s -> s.startsWith("p") || s.startsWith("P"))
				.collect(Collectors.toList());
		System.out.println(collect); //[peter, prateek, Parker]
	}
}
