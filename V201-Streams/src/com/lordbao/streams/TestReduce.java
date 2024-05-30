package com.lordbao.streams;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author Lord_Bao
 * @Date 2024/5/29 23:19
 * @Version 1.0
 */
public class TestReduce {

    public static void main(String[] args) {
        List<String> list = List.of("hi", "hello", "you", "forget");

        Integer res = list.stream().reduce(0, (total, cur) -> (total + cur.length()), (total1, total2) -> (total1 + total2));
        System.out.println(res);

        int sum = list.stream().mapToInt(String::length).sum();
        System.out.println(sum);

        IntSummaryStatistics collect = list.stream().collect(Collectors.summarizingInt(String::length));
        System.out.println(collect.getSum());
    }
}
