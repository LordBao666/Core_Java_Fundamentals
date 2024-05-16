package com.lordbao.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author Lord_Bao
 * @Date 2024/5/15 10:07
 * @Version 1.0
 *
 * The order in which the elements are visited depends on the collection type
 */
public class TestCollection {
    public static void main(String[] args) {

        Collection<Integer> coll = new ArrayList<>();
//        Collection<Integer> coll = new HashSet<>();
        coll.add(2);
        coll.add(1);
        coll.add(4);
        coll.add(3);

        /*test iterator  by while loop*/
        Iterator<Integer> iterator = coll.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("---------------");

        /*A class which has implemented Iterable interface can be
        * visited by foreach loop.The Collection and its implements
        * can be iterated by foreach loop for Collection has implemented
        * Iterable*/
        for (Integer ele :coll){
            System.out.println(ele);
        }

        System.out.println("---------------");
        /*test forEachRemaining*/
        iterator=coll.iterator();
        iterator.forEachRemaining(System.out::println);

        /*remove method can be called only if there are elements before*/
//        iterator=coll.iterator();
//        iterator.remove();//error

        System.out.println("---------------");
        /*test removeIf*/
        coll.removeIf(ele -> ele%2==0);
        coll.forEach(System.out::println);
    }
}
