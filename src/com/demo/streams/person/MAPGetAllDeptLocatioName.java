package com.demo.streams.person;

import java.util.List;
import java.util.stream.Collectors;

public class MAPGetAllDeptLocatioName {
	public static void main(String[] args) {
		List<String> collect = InputDate.personData.stream().map(s -> s.getDepartment().getLocation())
				.collect(Collectors.toList());
		
		System.out.println(collect);
	}
}
