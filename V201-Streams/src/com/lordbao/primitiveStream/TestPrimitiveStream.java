package com.lordbao.primitiveStream;

import org.junit.Test;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Author Lord_Bao
 * @Date 2024/5/30 9:26
 * @Version 1.0
 *
 * The primitive streams encompass IntStream,LongStream,DoubleStream, which are quite alike.
 * boolean,byte,char,short correspond to IntStream, long to LongStream, float,double to DoubleStream.
 *
 * Here we only introduce IntStream.
 */
public class TestPrimitiveStream {
    @Test
    public void testCreatePrimitiveStream(){
        //create an IntStream
        IntStream intStream = IntStream.of(1, 2, 3, 4);

        //create an IntStream from an array
        int [] arr ={1,2,3,4};
        IntStream intStream1 = Arrays.stream(arr);

        //range or ranged method will yield an IntStream
        IntStream intStream2 = IntStream.range(1, 5);//start inclusive,end exclusive
        IntStream intStream3 = IntStream.rangeClosed(1, 5);//start inclusive,end inclusive

        /* String's method codePoints or chars will return a stream of unicode
        *  e.g "abcd".codePoints will yield a stream of 97,98,99,100
        * */
        String str="abcd";
        IntStream intStream4 = str.codePoints();
        intStream4.forEach(System.out::println);
        String str1="abcd";
        System.out.println("-------");
        IntStream intStream5 = str.chars();
        intStream5.forEach(System.out::println);


        Stream<String> stream = Stream.of("how", "are", "you");
        IntStream intStream6 = stream.mapToInt(String::length);//mapToInt will yield an IntStream

        //the boxed method of primitive  stream will yield an object stream
        Stream<Integer> stream1 = IntStream.of(1, 2, 3, 4).boxed();

    }

    @Test
    public void testMethod(){
        //toArray of primitive stream will yield a primitive array
        int[] array = IntStream.of(1, 2, 3).toArray();

        //special methods like max,min,average,sum
        OptionalInt max = IntStream.of(1, 2, 3).max();
        System.out.println(max.getAsInt());

        //summaryStatistics() will return a IntSummaryStatistics object
        //which can find out the statistics of a primitive stream
        IntSummaryStatistics intSummaryStatistics = IntStream.of(1, 2, 3, 4).summaryStatistics();
        System.out.println(intSummaryStatistics.getAverage());
        System.out.println(intSummaryStatistics.getSum());

    }
}
