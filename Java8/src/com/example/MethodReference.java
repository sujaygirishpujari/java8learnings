package com.example;

import java.util.function.BiConsumer;

public class MethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Using Lambda
		BiConsumer<Integer, Integer> consumer = (a, b)->{
			System.out.println("Thanks for reusing testmethodReferencing");
		};
        consumer.accept(3, 5);
		
        // Method referencing
        BiConsumer<Integer, Integer> consumer2 = TestmethodReferencing :: accept;
        consumer2.accept(3, 5);
	}

}

class TestmethodReferencing{
	
	public static void accept(Integer a, Integer b){
		System.out.println("Thanks for reusing testmethodReferencing");
	}
}
