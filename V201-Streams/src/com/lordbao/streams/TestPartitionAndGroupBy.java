package com.lordbao.streams;

import com.lordbao.streams.entity.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @Author Lord_Bao
 * @Date 2024/5/29 22:13
 * @Version 1.0
 */
public class TestPartitionAndGroupBy {

    @Test
    public void testPartitionAndGroupBy(){
        List<Person> people = new ArrayList<>();
        people.add(new Person("jack", 2));
        people.add(new Person("tom", 1));
        people.add(new Person("mark", 1));

        Map<Integer, List<Person>> map = people.stream().collect(Collectors.groupingBy(person -> person.getName().length()));
        System.out.println(map.get(4));

        //if you group by a predicate, you had better use partitionBy instead of groupingBy
        Map<Boolean, List<Person>> map1 = people.stream().collect(Collectors.partitioningBy( person -> person.getName().length()%2==0));
        System.out.println(map1.get(true));

    }

    @Test
    public void testDownStreamCollector(){
        List<Person> people = new ArrayList<>();
        people.add(new Person("jack", 2));
        people.add(new Person("tom", 1));
        people.add(new Person("mark", 1));
        Map<Integer, Set<Person>> map = people.stream().collect(Collectors.groupingBy(person -> person.getName().length(), Collectors.toSet()));
        Map<Integer, Long> map1 = people.stream().collect(Collectors.groupingBy(person -> person.getName().length(), Collectors.counting()));

    }
}
