package com.demo.streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapTwoArrays {
	public static void main(String[] args) {
		int[] arr1 = new int[] {2,12,90};
		int[] arr2 = new int[] {13,7,1};
		
		Stream.of(arr1,arr2).flatMapToInt(i -> IntStream.of(i)).forEach(System.out::println);
		Stream.of(arr1,arr2).flatMapToInt(IntStream :: of).forEach(System.out::println);
	}
}
