package com.demo.streams.person;

import java.util.List;
import java.util.stream.Collectors;

public class MAPDistinctAllDeptLocatioName {
	public static void main(String[] args) {
		List<String> collect = InputDate.personData.parallelStream().map(s -> s.getDepartment().getLocation())
				.distinct().collect(Collectors.toList());

		System.out.println(collect);
	}
}
