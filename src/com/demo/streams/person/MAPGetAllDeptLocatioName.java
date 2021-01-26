package com.demo.streams.person;

import java.util.List;
import java.util.stream.Collectors;

public class MAPGetAllDeptLocatioName {
	public static void main(String[] args) {
		List<String> collect = InputData.personData.stream().map(s -> s.getDepartment().getLocation())
				.collect(Collectors.toList());
		
		System.out.println(collect); //[Mysore, Mysore, Mysore, Mysore, Bangalore, Bangalore, 
									 //Bangalore, Bagalkot, Bagalkot, Bagalkot, chitradurga]
	}
}
