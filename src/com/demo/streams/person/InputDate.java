package com.demo.streams.person;

import java.util.Arrays;
import java.util.List;

public class InputDate {

	static List<Person> personData = Arrays.asList(
			new Person(1, "ramesh", 21, new Department(1, "ISE", "Mysore")),
			new Person(2, "Suresh", 22, new Department(2, "Mech", "Mysore")),
			new Person(3, "Rambo", 22, new Department(3, "CSE", "Mysore")),
			new Person(4, "gunda", 22, new Department(3, "CSE", "Mysore")),
			new Person(5, "Prarmesh", 22, new Department(2, "Mech", "Bangalore")),
			new Person(6, "Loral", 22, new Department(3, "ISE", "Bangalore")),
			new Person(7, "Peter", 22, new Department(1, "CSE", "Bangalore")),
			new Person(8, "NoorPasha", 22, new Department(4, "ECE", "Bagalkot")),
			new Person(9, "Nandini", 22, new Department(4, "ECE", "Bagalkot")),
			new Person(10, "pinky", 22, new Department(4, "ECE", "Bagalkot")),
			new Person(11, "yallappa", 22, new Department(1, "CSE", "chitradurga")));

}
