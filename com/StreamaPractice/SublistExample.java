package com.StreamaPractice;

import java.util.ArrayList;
import java.util.List;

public class SublistExample {
    public static void main(String[] args){
        List<Integer>  list = new ArrayList<>();
        for(int i=1; i<11; i++){
            list.add(i);
        }
        System.out.println("the list are: "+list);
        System.out.println("\nthe sublist are ");

        List<Integer> subList = list.subList(3,7);
        subList.stream().forEach(System.out::println);


    }
}
