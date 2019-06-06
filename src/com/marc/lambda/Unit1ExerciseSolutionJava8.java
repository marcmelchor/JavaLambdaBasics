package com.marc.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Unit1ExerciseSolutionJava8 {

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
		printConditionally(people, p -> true);
		
		// Step 3: Create a method that prints all people that have last name beginning with C
		System.out.println("Printing all persons with last name beginning with C 1");
		printLastNameBeginningWithC(people);
		
		System.out.println("Printing all persons with last name beginning with C 2");
		printConditionally(people, p -> p.getLastName().startsWith("C"));
		
		System.out.println("Printing all persons with first name beginning with C");
		printConditionally(people, p -> p.getFirstName().startsWith("C"));
		
	}
	
	private static void printLastNameBeginningWithC(List<PersonClass> people) {
		for (PersonClass p : people) {
			if (p.getLastName().startsWith("C"))
				System.out.println(p);
		}
	}
	
	private static void printConditionally(List<PersonClass> people, Condition condition) {
		for (PersonClass p : people) {
			if (condition.test(p)) 
				System.out.println(p);
		}
	}

}
