package com.lordbao.concreteCollection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @Author Lord_Bao
 * @Date 2024/5/15 11:50
 * @Version 1.0
 */
public class TestList {
    public static void main(String[] args) {
        LinkedList<String> staff = new LinkedList<>();
        staff.add("Amy");
        staff.add("Bob");
        staff.add("Carl");
        Iterator<String> iter = staff.iterator();
        String first = iter.next(); // visit first element
        String second = iter.next(); // visit second element
        iter.remove(); // remove last visited element
        staff.forEach(System.out::println);
        System.out.println("----");

        /*Note listIterator is a very important method of List.
        * ListIterator has more useful methods than Iterator*/
        ListIterator<String> listIterator = staff.listIterator();
        listIterator.add("Bob");
        staff.forEach(System.out::println);
    }
}
