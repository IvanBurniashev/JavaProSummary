package org.example.ClassWork._2023_10_06;

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
// void -> data --- Supplier --- get()
        Supplier<Integer> randomGenerator = () -> {
            Random random = new Random();
            return random.nextInt();
        };

        System.out.println(randomGenerator.get());
    }
}