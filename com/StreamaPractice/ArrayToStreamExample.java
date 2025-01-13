package com.StreamaPractice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStreamExample {
    public static void main(String[] args){
        int[] num= {2, 3, 5, 4, 7, 6, 2};
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println(" ");


        int sum = Arrays.stream(num).sum();
       Stream<Integer> strm= Stream.of(2, 3, 5, 4, 7, 6, 2);
        System.out.println(sum);


       strm.forEach(nums-> System.out.print(nums+" "));
    }

}
