package com.lordbao.book.p02Lambda;


import javax.swing.*;
import java.util.Arrays;
import java.util.List;

/**
 * @Author Lord_Bao
 * @Date 2024/5/8 11:29
 * @Version 1.0
 *
 * The documentation below is extracted from Core Fundamental:
 *
 * the :: operator separates the method name from the name of an object or class. There are three variants:
 *      1. object::instanceMethod
 *      2. Class::instanceMethod
 *      3. Class::staticMethod
 * In the first variant, the method reference is equivalent to a lambda expression whose parameters
 * are passed to the method. In the case of System.out::println, the object is System.out, and
 * the method expression is equivalent to x -> System.out.println(x).
 *
 * In the second variant, the first parameter becomes the implicit parameter of the method. For
 * example, String::compareToIgnoreCase is the same as (x, y) -> x.compareToIgnoreCase(y).
 *
 * In the third variant, all parameters are passed to the static method:
 * Math::pow is equivalent to (x, y) -> Math.pow(x, y).
 */
public class Test03MethodReference {
    // When the body of lambda expression calls only one method and does nothing else,
    // method references can replace lambda expression in a neater way.
    public static void main(String[] args) {


        Integer [] arr = {1, 3, 2};
        Integer[]  arrCopy1 = Arrays.copyOf(arr, arr.length);
        Integer []  arrCopy2 = Arrays.copyOf(arr, arr.length);

        List<Integer> list = List.of(arr);
        list.forEach(System.out::println);
//       equals to
//        list.forEach(x -> System.out.println(x));

        System.out.println();

        Arrays.sort(arrCopy1,Integer::compare);
        //equals to
//        Arrays.sort(arrCopy1,(x,y)->Integer.compare(x,y));
        for ( var elt : arrCopy1){
            System.out.println(elt);
        }

        System.out.println();
        Arrays.sort(arrCopy2,Integer::compareTo);
        //equals to
//        Arrays.sort(arrCopy2,(x,y) -> x.compareTo(y));
        for ( var elt : arrCopy2){
            System.out.println(elt);
        }

    }
}
