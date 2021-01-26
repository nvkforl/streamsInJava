package com.demo.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapNumberToFlatMap {

	public static void main(String[] args) {
		List<Integer> intList = List.of(2,10,15,1,9);
		
		List<Integer> collect = intList.stream()
				.flatMap(i -> Stream.of(i+10,i+20))
				.collect(Collectors.toList());
		System.out.println(collect); //[12, 22, 20, 30, 25, 35, 11, 21, 19, 29]

	}

}
