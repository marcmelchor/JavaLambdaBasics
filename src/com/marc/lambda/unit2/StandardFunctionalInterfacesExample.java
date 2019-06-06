package com.marc.lambda.unit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.marc.lambda.PersonClass;

public class StandardFunctionalInterfacesExample {

	public static void main(String[] args) {
		List<PersonClass> people = Arrays.asList(
				new PersonClass("Charles", "Dickens", 60),
				new PersonClass("Lewis", "Carroll", 42),
				new PersonClass("Thomas", "Carlyle", 51),
				new PersonClass("Charlotte", "Bronte", 45),
				new PersonClass("Mathew", "Arnold", 39)
				);
		
		// Step 1: Sort list by last name
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		// Step 2: Create a method that prints all elements in the list
		System.out.println("Printing all persons");
		printConditionally(people, p -> true, p -> System.out.println(p));
		
		// Step 3: Create a method that prints all people that have last name beginning with C		
		System.out.println("Printing all persons with last name beginning with C 2");
		printConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p));
		
		System.out.println("Printing all persons with first name beginning with C");
		printConditionally(people, p -> p.getFirstName().startsWith("C"), p -> System.out.println(p.getFirstName()));
		
	}
	
	private static void printConditionally(List<PersonClass> people, Predicate<PersonClass> predicate, Consumer<PersonClass> consumer) {
		for (PersonClass p : people) {
			if (predicate.test(p)) 
				consumer.accept(p);
		}
	}

}
