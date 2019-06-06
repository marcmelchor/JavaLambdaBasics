package com.marc.lambda.unit3;

import java.util.Arrays;
import java.util.List;

import com.marc.lambda.PersonClass;

public class StreamsExample1 {

	public static void main(String[] args) {
		List<PersonClass> people = Arrays.asList(
				new PersonClass("Charles", "Dickens", 60),
				new PersonClass("Lewis", "Carroll", 42),
				new PersonClass("Thomas", "Carlyle", 51),
				new PersonClass("Charlotte", "Bronte", 45),
				new PersonClass("Mathew", "Arnold", 39)
				);
		
		people.stream()
		.filter(p -> p.getLastName().startsWith("C"))
		.forEach(p -> System.out.println(p.getFirstName()));
		
		long count = people.stream()
		.filter(p -> p.getLastName().startsWith("D"))
		.count();
		
		System.out.println(count);
	}

}
