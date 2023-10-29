package org.example.HomeWork._2023_10_20;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Cat> catList = Arrays.asList(
                new Cat("Tom", false),
                new Cat("Murka", true),
                new Cat("Barsik", false),
                new Cat("Jerry", true),
                new Cat("Bob", false)
        );
        feed1(catList);
        feed2(catList);

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(getSum1(integers));
        System.out.println(getSum2(integers));
        System.out.println(getMap1());
        System.out.println(getMap2());
        dictionary();
    }

    /**
     * 1)
     * <p>
     * public static void feed(List catList) {
     * for (int i = 0; i < catList.size(); i++) {
     * if (catList.get(i).isHungry()) {
     * catList.get(i).setHungry(false);
     * }
     * }
     * }
     */


    public static void feed1(List<Cat> catList) {
        for (int i = 0; i < catList.size(); i++) {
            if (catList.get(i).isHangry()) {
                catList.get(i).setHangry(false);
            }
        }
        System.out.println(catList);
    }

    public static void feed2(List<Cat> catList) {
        catList.stream()
                .filter(Cat::isHangry)
                .forEach(cat -> cat.setHangry(false));
        System.out.println(catList);
    }

    /**
     * 2)
     * public static int getSum(List integers) {
     * int oddSum = 0;
     * for(Integer i: integers) {
     * if(i % 2 != 0) {
     * oddSum += i;
     * }
     * }
     * return oddSum;
     * }
     */


    public static int getSum1(List<Integer> integers) {
        int oddSum = 0;
        for (Integer i : integers) {
            if (i % 2 != 0) {
                oddSum += i;
            }
        }
        return oddSum;
    }

    public static int getSum2(List<Integer> integers) {
        int oddSum = integers.stream()
                .filter(el -> el % 2 != 0)
                .reduce(0, (sum, el) -> sum + el);
        return oddSum;
    }

    /**
     * 3)
     * <p>
     * public static Map> getMap() {
     * Map> map = new TreeMap<>();
     * for (int i = 0; i < 100; i++) {
     * if (i % 3 == 0) {
     * if (map.containsKey(true)) {
     * map.get(true).add(i);
     * } else {
     * map.put(true, new ArrayList<>());
     * map.get(true).add(i);
     * }
     * } else {
     * if (map.containsKey(false)) {
     * map.get(false).add(i);
     * } else {
     * map.put(false, new ArrayList<>());
     * map.get(false).add(i);
     * }
     * }
     * }
     * return map;
     * }
     */


    public static Map<Boolean, List<Integer>> getMap1() {
        Map<Boolean, List<Integer>> map = new TreeMap<>();
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                if (map.containsKey(true)) {
                    map.get(true).add(i);
                } else {
                    map.put(true, new ArrayList<>());
                    map.get(true).add(i);
                }
            } else {
                if (map.containsKey(false)) {
                    map.get(false).add(i);
                } else {
                    map.put(false, new ArrayList<>());
                    map.get(false).add(i);
                }
            }
        }
        return map;
    }

    public static Map<Boolean, List<Integer>> getMap2() {
        Map<Boolean, List<Integer>> map = IntStream.range(0, 100)
                .boxed()
                .collect(Collectors.partitioningBy(el -> el % 3 == 0));
        return map;
    }

    /**
     * 4) Код в классе de.telran.lesson20230929.Dictionary (см. репозиторий)
     */


    private static void dictionary() {
        String text = "Mr. and Mrs. Dursley, of number four, Privet Drive, were proud to say\n" + "that they were " +
                "perfectly normal, thank you very much. They were the last\n" + "people you'd expect to be involved in anything strange or mysterious,\n" + "because they just didn't hold with such nonsense.\n" + "Mr. Dursley was the director of a firm called Grunnings, which made\n" + "drills. He was a big, beefy man with hardly any neck, although he did\n" + "have a very large mustache. Mrs. Dursley was thin and blonde and had\n" + "nearly twice the usual amount of neck, which came in very useful as she\n" + "spent so much of her time craning over garden fences, spying on the\n" + "neighbors. The Dursleys had a small son called Dudley and in their\n" + "opinion there was no finer boy anywhere.\n" + "The Dursleys had everything they wanted, but they also had a secret, and\n" + "their greatest fear was that somebody would discover it. They didn't\n" + "think they could bear it if anyone found out about the Potters. Mrs.\n" + "Potter was Mrs. Dursley's sister, but they hadn't met for several years;\n" + "in fact, Mrs. Dursley pretended she didn't have a sister, because her\n" + "sister and her good-for-nothing husband were as unDursleyish as it was\n" + "possible to be. The Dursleys shuddered to think what the neighbors would\n" + "say if the Potters arrived in the street. The Dursleys knew that the\n" + "Potters had a small son, too, but they had never even seen him. This boy\n" + "was another good reason for keeping the Potters away; they didn't want\n" + "Dudley mixing with a child like that.\n" + "When Mr. and Mrs. Dursley woke up on the dull, gray Tuesday our story\n" + "starts, there was nothing about the cloudy sky outside to suggest that\n" + "strange and mysterious things would soon be happening all over the\n" + "country. Mr. Dursley hummed as he picked out his most boring tie for\n" + "work, and Mrs. Dursley gossiped away happily as she wrestled a screaming\n" + "Dudley into his high chair.\n" + "None of them noticed a large, tawny owl flutter past the window.\n" + "At half past eight, Mr. Dursley picked up his briefcase, pecked Mrs.\n" + "Dursley on the cheek, and tried to kiss Dudley good-bye but missed,\n" + "2\n" + "because Dudley was now having a tantrum and throwing his cereal at the\n" + "walls. \"Little tyke,\" chortled Mr. Dursley as he left the house. He got\n" + "into his car and backed out of number four's drive.\n" + "It was on the corner of the street that he noticed the first sign of\n" + "something peculiar -- a cat reading a map. For a second, Mr. Dursley\n" + "didn't realize what he had seen -- then he jerked his head around to\n" + "look again. There was a tabby cat standing on the corner of Privet\n" + "Drive, but there wasn't a map in sight. What could he have been thinking\n" + "of? It must have been a trick of the light. Mr. Dursley blinked and\n" + "stared at the cat. It stared back. As Mr. Dursley drove around the\n" + "corner and up the road, he watched the cat in his mirror. It was now\n" + "reading the sign that said Privet Drive -- no, looking at the sign; cats\n" + "couldn't read maps or signs. Mr. Dursley gave himself a little shake and\n" + "put the cat out of his mind. As he drove toward town he thought of\n" + "nothing except a large order of drills he was hoping to get that day.";
        Set<String> set = Arrays.stream(text.split("[\\s,\\.\\;]"))
                .collect(Collectors.groupingBy(key -> key, Collectors.counting()))
                .entrySet().stream()
                .sorted((key, value) -> Long.compare(value.getValue(), key.getValue()))
                .filter(el -> el.getKey() != "")
                .map(el -> "'" + el.getKey() + "' " + el.getValue())
                .collect(Collectors.toCollection(LinkedHashSet::new));
        for (String str : set) {
            System.out.println(str);
        }
    }

}