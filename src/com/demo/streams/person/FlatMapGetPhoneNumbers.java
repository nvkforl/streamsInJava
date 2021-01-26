package com.demo.streams.person;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapGetPhoneNumbers {

	public static void main(String[] args) {
		List<List<String>> collect = InputData.personData.stream()
				.map(s -> s.getPhone())
				.collect(Collectors.toList());
		System.out.println(collect); //[[7987546531, 64532132165], [65165132, 65465132], [6511321, 51613254], 
									 //[165161, 165132156], [56465416, 5165165], [19516516, 131321], 
									 //[3616161, 65465132132], [546513213, 51631321], [5461321, 13135322], 
									 //[51654879312, 51651316546], [545465613, 51651213]]
		
		List<String> collect2 = InputData.personData.stream()
				.flatMap(s -> s.getPhone().stream())
				.collect(Collectors.toList());
		System.out.println(collect2); //[7987546531, 64532132165, 65165132, 65465132, 6511321, 51613254, 
									  //165161, 165132156, 56465416, 5165165, 19516516, 131321, 3616161, 
									  //65465132132, 546513213, 51631321, 5461321, 13135322, 51654879312, 
									  //51651316546, 545465613, 51651213]
	}

}
