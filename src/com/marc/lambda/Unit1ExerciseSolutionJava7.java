package com.marc.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava7 {

	public static void main(String[] args) {
		List<PersonClass> people = Arrays.asList(
				new PersonClass("Charles", "Dickens", 60),
				new PersonClass("Lewis", "Carroll", 42),
				new PersonClass("Thomas", "Carlyle", 51),
				new PersonClass("Charlotte", "Bronte", 45),
				new PersonClass("Mathew", "Arnold", 39)
				);
		
		// Step 1: Sort list by last name
		Collections.sort(people, new Comparator<PersonClass>() {

			@Override
			public int compare(PersonClass o1, PersonClass o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
			
		});
		
		// Step 2: Create a method that prints all elements in the list
		System.out.println("Printing all persons");
		printAll(people);
		
		// Step 3: Create a method that prints all people that have last name beginning with C
		System.out.println("Printing all persons with last name beginning with C 1");
		printLastNameBeginningWithC(people);
		
		System.out.println("Printing all persons with last name beginning with C 2");
		printConditionally(people, new Condition() {

			@Override
			public boolean test(PersonClass p) {
				return p.getLastName().startsWith("C");
			}
			
		});
		
	}
	
	private static void printAll(List<PersonClass> people) {
		for (PersonClass p : people) {
			System.out.println(p);
		}
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

interface Condition {
	boolean test(PersonClass p);
}