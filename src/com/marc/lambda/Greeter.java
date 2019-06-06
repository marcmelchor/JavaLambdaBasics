package com.marc.lambda;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}
	
	/*
	lambdaOne = () -> {
		System.out.println("Hello Lambda");
	};
	
	lambdaTwo = () -> System.out.println("Hello Lambda two");
	
	greetingFunction = () -> System.out.println("Hello World!");
	
	doubleNumberFunction = (int a) -> a * 2;
	
	addFunction = (int a1, int b1) -> a + b;
	
	safeDivideFunction = (int a2, int b2) -> {
		if (b2 == 0) 
			return 0;
	
		return a2 / b2;
	};
	
	stringLengthCountFunction = (String s) -> s.length;
	*/
	
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		// Greeting helloWorldGreeting = new HelloWorldGreeting();
		// greeter.greet(helloWorldGreeting);
		
		// helloWorldGreeting.perform();
		
		Greeting lambdaGreeting = () -> System.out.println("Hello World!");
		// MyAdd addFunction = (int a, int b) -> a + b;
		
		Greeting innerClassGreeting = new Greeting() {
			public void perform() {
				System.out.println("Hello World!");
			}
		};

		greeter.greet(lambdaGreeting);
		greeter.greet(innerClassGreeting);
	}

}

interface MyAdd {
	int add(int x, int y);
}