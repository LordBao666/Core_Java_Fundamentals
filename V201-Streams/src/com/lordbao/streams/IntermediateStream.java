package com.lordbao.streams;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author Lord_Bao
 * @Date 2024/5/24 19:48
 * @Version 1.0
 */
public class IntermediateStream {

    public static Stream<String> codePoints(String s){
        List<String > list = new ArrayList<>();
        int i=0;
        int j=s.length()-1;
        while (i<=j){
            list.add(s.substring(i,i+1));
            i++;
        }
        return list.stream();
    }

    @Test
    public void testFilterMapFlatMap(){
        List<String> list = List.of("folk", "guy", "tada", "brother", "no", "what");
        Stream<String> stream = list.stream();
        //map
        stream.map(String::length).forEach(ele-> System.out.print(ele+" "));
        System.out.println();

        //filter
        stream=list.stream();
        stream.filter(s -> s.length()%2==0).forEach(ele-> System.out.print(ele+" "));
        System.out.println();

        //flapMap
        stream=list.stream();
        stream.flatMap(IntermediateStream::codePoints).forEach(ele-> System.out.print(ele+" "));
    }


    public char getLetterByOffset(int offset) {
        return (char) ('A' + offset);
    }
    @Test
    public void testSubStreamAndCombineStream(){
        //a random stream of uppercase letters
        Stream<Character> stream = Stream.generate(() -> getLetterByOffset((int) (Math.random() * 27)));
        //test limit
        stream.limit(10).forEach(e->System.out.print(e+" "));
        System.out.println();

        //test skip
        List<Integer> list = new ArrayList<>(List.of(9, 10, 2, 3, 14, 78, 9, 1, 2));
        Collections.sort(list);
        //skip the first three smallest integers
        list.stream().skip(3).forEach(e->System.out.print(e+" "));
        System.out.println();

        //test takeWhile and dropWhile
        List<Integer> list1 = List.of(1, 3, 5, 4, 2, 1);
        list1.stream().takeWhile(ele -> ele % 2==1).forEach(e->System.out.print(e+" "));//1,3,5
        System.out.println();
        list1.stream().dropWhile(ele -> ele % 2==1).forEach(e->System.out.print(e+" "));//4,2,1
        System.out.println();

        //test concat
        Stream.concat(codePoints("hi"),codePoints("you")).forEach(e->System.out.print(e+" "));

        Object[] powers = Stream.iterate(1.0, p -> p * 2)
                .peek(e -> System.out.println("Fetching " + e))
                .limit(3).toArray();
    }
}
