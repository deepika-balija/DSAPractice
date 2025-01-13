package com.StreamaPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SliceExample {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        for (int i = 11; i <= 20; i++)
            list.add(i);

        // Create stream from list
        Stream<Integer> intStream = list.stream();

        // Print the stream
        System.out.println("List: " + list);

        System.out.println("\nSlice elements are:");

        // Get Slice of Stream
        // containing of elements from the 4th index to 8th
       intStream.skip(4)
               .limit(5)
               .forEach(System.out::println);

    }
}
