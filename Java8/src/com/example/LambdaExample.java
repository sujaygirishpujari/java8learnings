package com.example;

@FunctionalInterface
interface testInterface{
	
public void test();	

default void printName() {};

static void newStaticMethod() {};
//public void test2(); .. this will cause error as 	
}

public class LambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scenario 1: 
		testInterface t2= new testInterface() {
			@Override
			public void test() {
				// TODO Auto-generated method stub
				System.out.println("Hello from Anonymous Class");
			}
		};
		t2.test();
		
		
		
		// Scenario 2
		testInterface ti;
		ti = () -> System.out.println("Hello from Lambda");
		ti.test();
		
		
		
		// Another example
		
		Runnable R1 = ()-> {
			try {
				System.out.println("Done 1");
				Thread.sleep(5000);
				System.out.println("Done 2");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
		new Thread(R1).start();
	}

}
