package com.lordbao.algoritms.sortAndshuffle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author Lord_Bao
 * @Date 2024/5/21 17:19
 * @Version 1.0
 */
class Person implements Comparable<Person>{
    private int age;
    public Person(){

    }

    public Person(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return this.age-o.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }
}
public class TestSort {
    private static void testSort(){
        ArrayList<Person> people = new ArrayList<>(List.of(new Person(10), new Person(11), new Person(12)));
        // It requires Person has to implement Comparable interface
        Collections.sort(people);
        System.out.println(people);

        // It requires Person has to implement Comparable interface as well
        people.sort(Comparator.reverseOrder());
        System.out.println(people);

        // Provide a comparator
        people.sort(Comparator.comparingInt(Person::getAge));
        System.out.println(people);

        // Provide a comparator
        people.sort(Comparator.comparingInt(Person::getAge).reversed());
        System.out.println(people);
    }

    public static void main(String[] args) {
        testSort();
    }
}
