package com.demo.streams.person;

import java.util.Arrays;
import java.util.List;

public class InputData {

	static List<Person> personData = Arrays.asList(
			new Person(1, "ramesh", 21, new Department(1, "ISE", "Mysore"), Arrays.asList("7987546531","64532132165")),
			new Person(2, "Suresh", 22, new Department(2, "Mech", "Mysore"), Arrays.asList("65165132","65465132")),
			new Person(3, "Rambo", 22, new Department(3, "CSE", "Mysore"), Arrays.asList("6511321","51613254")),
			new Person(4, "gunda", 22, new Department(3, "CSE", "Mysore"), Arrays.asList("165161","165132156")),
			new Person(5, "Prarmesh", 22, new Department(2, "Mech", "Bangalore"), Arrays.asList("56465416","5165165")),
			new Person(6, "Loral", 22, new Department(3, "ISE", "Bangalore"), Arrays.asList("19516516","131321")),
			new Person(7, "Peter", 22, new Department(1, "CSE", "Bangalore"), Arrays.asList("3616161","65465132132")),
			new Person(8, "NoorPasha", 22, new Department(4, "ECE", "Bagalkot"), Arrays.asList("546513213","51631321")),
			new Person(9, "Nandini", 22, new Department(4, "ECE", "Bagalkot"), Arrays.asList("5461321","13135322")),
			new Person(10, "pinky", 22, new Department(4, "ECE", "Bagalkot"), Arrays.asList("51654879312","51651316546")),
			new Person(11, "yallappa", 22, new Department(1, "CSE", "chitradurga"), Arrays.asList("545465613","51651213")));

}
