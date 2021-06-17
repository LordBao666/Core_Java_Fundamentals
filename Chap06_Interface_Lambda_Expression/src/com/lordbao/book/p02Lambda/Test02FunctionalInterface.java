package com.lordbao.book.p02Lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @Author Lord_Bao
 * @Date 2021/6/12 10:42
 * @Version 1.0
 */
public class Test02FunctionalInterface {
    public static void main(String[] args) {
//        testBiFunction();
//        testFunction();
//        testPredicate();
//        testSupplier();
//        testConsumer();
    }

    private static void testBiFunction() {
        // 函数式接口可以当做是Function,但是也可以理解为是接口的实现类对象。
        // 测试BiFunction R apply(T t, U u);
        BiFunction<String, String, Integer> lengthBiFunction = (x, y) -> x.length() - y.length();
        int lengthDifference = lengthBiFunction.apply("aaa", "b");
        System.out.println(lengthDifference);
    }

    private static void testFunction() {
//        Function<T, R>  R apply(T t);
        Function<String, Integer> length = (str) -> str.length();
        System.out.println(length.apply("444"));
    }

    private static void testPredicate() {
        //测试 Predicate<T> boolean test(T t);
        var list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add(null);
        // 同样这里的x也是有类型推断的
        list.removeIf(x -> x == null);
        System.out.println(list.size());
    }

    private static void testSupplier() {
        // 测试 public interface Supplier<T> T get();
        LocalDate day = null;
        LocalDate day2 = Objects.requireNonNullElse(day, LocalDate.of(1970, 1, 1));
        System.out.println(day2);
//        等价于
        LocalDate day3 = Objects.requireNonNullElseGet(day, () -> LocalDate.of(1970, 1, 1));
        System.out.println(day3);
    }

    private static void testConsumer() {
//        Consumer<T> void accept(T t);
        Consumer<String> consumer = (str) -> System.out.println(str);
        consumer.accept("abc");
    }

}


