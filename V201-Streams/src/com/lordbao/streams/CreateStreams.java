package com.lordbao.streams;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * @Author Lord_Bao
 * @Date 2024/5/24 19:08
 * @Version 1.0
 */
public class CreateStreams {
    public static void main(String[] args) {
        /*intro of creating stream*/
        List<String> list = List.of("Hi", "I", "am", "lordbao");
        String[] array = list.toArray(new String[0]);

        //collection to stream
        Stream<String> stream = list.stream();
        //array to stream
        Stream<String> stream1 = Stream.of(array);
        Stream<String> stream2 = Arrays.stream(array);
        Stream<String> stream3 = Arrays.stream(array, 0, 2);

        Stream<String> stream4 = Stream.of("hello", "I'm", "mark");
        Stream<String> stream5 = Stream.ofNullable(null);

        //empty Stream
        Stream<String> stream6 = Stream.empty();

        /*infinite stream*/
        Stream<String> stream7 = Stream.generate(() -> "ECHO");
        Stream<Double> stream8 = Stream.generate(Math::random);
        Stream<BigInteger> stream9 = Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE));
        //supply a predicate to produce a finite stream
        Stream<BigInteger> stream10 = Stream.iterate(BigInteger.ZERO, n -> n.compareTo(new BigInteger("100")) == 0, n -> n.add(BigInteger.ONE));


    }
}
