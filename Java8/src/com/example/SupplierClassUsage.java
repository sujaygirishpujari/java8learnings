package com.example;

import java.util.Random;
import java.util.function.DoubleSupplier;
import java.util.function.Supplier;
import java.util.stream.Stream;

import org.junit.Test;


public class SupplierClassUsage {

	@Test
	public void supplier(){
		/*
		 * Supplier<Double> doubleSupplier1 = () -> Math.random(); DoubleSupplier
		 * doubleSupplier2 = Math::random;
		 * 
		 * System.out.println(doubleSupplier1.get());
		 * System.out.println(doubleSupplier2.getAsDouble());
		 */	
		Supplier<Integer> supplier = () ->5;
		System.out.println(supplier.get());
		
		Supplier<Integer> randomNumbersSupp = () -> new Random().nextInt(10);
        
		Stream.generate(randomNumbersSupp)
        .limit(5)
        .forEach(System.out::println);
		//System.out.println(supplier.get());
	
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
