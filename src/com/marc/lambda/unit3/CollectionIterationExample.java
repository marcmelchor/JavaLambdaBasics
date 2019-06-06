package com.marc.lambda.unit3;

import java.util.Arrays;
import java.util.List;

import com.marc.lambda.PersonClass;

public class CollectionIterationExample {

	public static void main(String[] args) {
		List<PersonClass> people = Arrays.asList(
				new PersonClass("Charles", "Dickens", 60),
				new PersonClass("Lewis", "Carroll", 42),
				new PersonClass("Thomas", "Carlyle", 51),
				new PersonClass("Charlotte", "Bronte", 45),
				new PersonClass("Mathew", "Arnold", 39)
				);
		
		System.out.println("Using for loop");
		for (int i = 0; i < people.size(); i++)
			System.out.println(people.get(i));
		
		System.out.println("\nUsing for each loop");
		for (PersonClass p : people)
			System.out.println(p);
		
		System.out.println("\nUsing lambda for each loop");
		people.forEach(p -> System.out.println(p));
		
		System.out.println("\nUsing lambda for each loop 2");
		people.forEach(System.out::println);

	}

}
