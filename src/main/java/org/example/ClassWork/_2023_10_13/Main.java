package org.example.ClassWork._2023_10_13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("A", "B", "SS", "VV");

        stringList.forEach(System.out::println);
        stringList.stream().forEach(System.out::println);

        Stream<String> stream1 = stringList.stream();
        Stream<String> stream2 = stream1.filter(s -> s.length() == 2);
        Stream<String> stream3=stream2.map(s -> "Word: " + s);
        List<String> finalList = stream3.toList(); //это терминальная операция, до нее ничего с колекцией делаться не будет


        finalList.forEach(System.out::println);

        System.out.println("Some other operations");


    }
}
