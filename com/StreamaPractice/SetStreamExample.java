package com.StreamaPractice;

import com.sun.security.jgss.GSSUtil;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class SetStreamExample {
    public static void main(String[] args){
        Set<String> names = new HashSet<>();
        names.add("Alice");
        names.add("Brucele");
        names.add("Leden");
        names.add("Akshay");
        names.add("Kavya");
        names.stream()
                .filter(n-> n.startsWith("A"))
                .filter(n->n.endsWith("y"))
                .forEach(n-> System.out.print(n+" "));
        System.out.println(" ");

        boolean checkingNames=names.stream().anyMatch(n->n.startsWith("A"));
        System.out.println("checkingNames:"+checkingNames);


    }

}
