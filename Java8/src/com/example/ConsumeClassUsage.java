package com.example;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

@FunctionalInterface
interface testConsumer {

	void print(String s);
}

public class ConsumeClassUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Consumer<String> printConsumer = str -> System.out.println(str);
		printConsumer.accept("Name");

		Stream<String> strStream = Stream.of("Apple", "cherry", "mango");
		strStream.forEach(printConsumer);

		// strStream.forEach(System.out::println); // Steam can be used only once.

	}

	@Test
	public void whenNamesPresentUseBothConsumer() {
		List<String> cities = Arrays.asList("Sydney", "Dhaka", "New York", "London");

		Consumer
		<List<String>> upperCaseConsumer = list -> {
			for (int i = 0; i < list.size(); i++)
				list.set(i, list.get(i).toUpperCase());
		};
		
		Consumer <List<String>> lowerCaseConsumer = list -> {
			for (int i = 0; i < list.size(); i++)
				list.set(i, list.get(i).toLowerCase());
		};

		Consumer<List<String>> printConsumer = list -> list.stream().forEach(System.out::println);

		upperCaseConsumer.andThen(printConsumer).accept(cities);
		
		upperCaseConsumer.andThen(lowerCaseConsumer).andThen(printConsumer).accept(cities);
		
		
		for(String str : cities) {
			System.out.println(str);
		}
	}

}
