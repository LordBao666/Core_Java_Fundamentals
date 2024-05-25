package com.lordbao.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author Lord_Bao
 * @Date 2024/5/25 17:30
 * @Version 1.0
 */
public class CollectingResults {
    public static void main(String[] args) {
        String [] arr = {"hi", "hello"};
        Stream<String> greetings= Arrays.stream(arr);
        //Stream to Array
        String[] array = greetings.toArray(String[]::new);

        //Stream to Collection
        greetings= Arrays.stream(arr);
        List<String> list = greetings.collect(Collectors.toList());

        greetings= Arrays.stream(arr);
        Set<String> set = greetings.collect(Collectors.toSet());

        greetings= Arrays.stream(arr);
        TreeSet<String> set1 = greetings.collect(Collectors.toCollection(TreeSet::new));

        greetings= Arrays.stream(arr);
        ArrayList<String> list1 = greetings.collect(Collectors.toCollection(ArrayList::new));

        //joining
        String s = Arrays.stream(arr).collect(Collectors.joining(","));
        System.out.println(s);

        //statistics
        Stream<String> stream = Stream.of("i", "am", "no", "of", "sam");
        IntSummaryStatistics statistics = stream.collect(Collectors.summarizingInt(String::length));
        System.out.println(statistics.getCount());
        System.out.println(statistics.getMin());
        System.out.println(statistics.getMax());
        System.out.println(statistics.getAverage());

    }
}
