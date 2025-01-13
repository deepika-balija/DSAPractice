package com.StreamaPractice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamExample {
    public static void main(String[] args){
         IntStream.range(1,10)
                                    .filter(n->n%2 == 0)
                .map(n->n*n)
                .boxed()
                .forEach(n->System.out.print(n+" "));
        System.out.println(" ");

            List<Integer> num= IntStream.range(5,10)
                    .filter(n->n%2 == 0)
                    .map(n->n*n)
                    .boxed() //converts
                    .collect(Collectors.toList());
        System.out.println("using List:" + num);
    }
}
