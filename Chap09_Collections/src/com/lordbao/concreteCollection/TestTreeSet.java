package com.lordbao.concreteCollection;

import com.lordbao.concreteCollection.entity.Item;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Author Lord_Bao
 * @Date 2024/5/16 20:39
 * @Version 1.0
 */
public class TestTreeSet {

    public static void main(String[] args) {
        Item a = new Item(1,"C");
        Item b = new Item(2,"B");
        Item c = new Item(3,"A");
        /* Either one of the requirements must  be met:
        1. The elements in TreeSet must implement Comparable,or
        2. Supply an object of subclass of Comparator for elements  */
        TreeSet<Item> treeSet1 = new TreeSet<>();
        TreeSet<Item> treeSet2 = new TreeSet<>(Comparator.comparing(Item::getDescription));

        treeSet1.add(a);
        treeSet1.add(b);
        treeSet1.add(c);

        treeSet2.addAll(treeSet1);

        treeSet1.forEach(System.out::println);
        System.out.println("-------");
        treeSet2.forEach(System.out::println);
    }
}
