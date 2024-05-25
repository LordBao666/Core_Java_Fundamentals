package com.lordbao.streams;

import org.junit.Test;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @Author Lord_Bao
 * @Date 2024/5/25 16:32
 * @Version 1.0
 */
public class TestOptionalType {
    @Test
    public void testOrElse(){
        //create an empty stream
        Stream<String> stream = Stream.empty();
        Optional<String> obj = stream.findAny();
        System.out.println(obj.orElse("huh?"));
        System.out.println(obj.orElseGet(()->"nono"));
//        obj.orElseThrow(IllegalStateException::new);
    }

    @Test
    public void testIfPresent(){
        Stream<Integer> stream = Stream.of(1, 3, 5, 7);
        Optional<Integer> obj = stream.findAny();

        obj.ifPresent(System.out::println);
        obj.ifPresentOrElse(System.out::println,()-> System.out.println("Found nothing"));

    }

    @Test
    public void testPipeOptional(){
        Stream<String> stream = Stream.of("haha");
        Optional<String> obj = stream.findAny();
        //map
        Optional<Integer> len = obj.map(String::length);
        System.out.println(len);

        //filter
        Optional<String> obj2 = obj.filter(e -> e.length() > 3);

        //or
        Optional<String> obj3 = obj.or(() -> Optional.of(""));
    }
}
