package com.marc.lambda.unit3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.marc.lambda.PersonClass;

public class MethodReferenceExample2 {

	public static void main(String[] args) {
		List<PersonClass> people = Arrays.asList(
				new PersonClass("Charles", "Dickens", 60),
				new PersonClass("Lewis", "Carroll", 42),
				new PersonClass("Thomas", "Carlyle", 51),
				new PersonClass("Charlotte", "Bronte", 45),
				new PersonClass("Mathew", "Arnold", 39)
				);
		
		
		System.out.println("Printing all persons");
		printConditionally(people, p -> true, System.out::println);
		
	}
	
	private static void printConditionally(List<PersonClass> people, Predicate<PersonClass> predicate, Consumer<PersonClass> consumer) {
		for (PersonClass p : people) {
			if (predicate.test(p)) 
				consumer.accept(p);
		}
	}

}
