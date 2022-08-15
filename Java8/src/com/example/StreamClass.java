package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class StreamClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(2);
		list.add(2);

		for (Integer integer : list) {
			System.out.print(integer); System.out.print(" , ");
		}
		
		System.out.println("Printing the collection : "
                + list);
		
		   // Stream operations
        // 1. Getting the stream from this collection
        // 2. Filtering out only even elements
        // 3. Collecting the required elements to List
        List<Integer> ls
            = list.stream()
                  .filter(i -> i % 2 == 0)
                  .collect(Collectors.toList());
        
        System.out.println(
                "Printing the List after stream operation : "
                + ls);
        
        
        /// BiConsumer example
        
        BiConsumer<Integer, Integer> consumer = (a, b) -> {System.out.println("First is :"+ a +" second is : "+ b );};
        consumer.accept(3, 5);
        
     
        
	}

}
