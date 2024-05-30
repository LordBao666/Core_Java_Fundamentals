package com.lordbao.streams;

import com.lordbao.streams.entity.Person;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestCollecting {

    @Test
    public void testCollectMap() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("jack", 2));
        people.add(new Person("tom", 1));
        people.add(new Person("mark", 1));
//
//
//        Map<Integer, Person> map = people.stream().collect(Collectors.toMap(Person::getId, Function.identity(), (existValue, currentValue) -> existValue));
//        map.forEach((k,v)->{
//            System.out.println("k:"+k+",v:"+v);
//        });


        //example from book
//        Stream<Locale> locales = Stream.of(Locale.getAvailableLocales());
//        Map<String, String> languageNames = locales.collect(
//                Collectors.toMap(
//                        Locale::getDisplayLanguage,
//                        loc -> loc.getDisplayLanguage(loc),
//                        (existingValue, newValue) -> existingValue));
//
//        languageNames.forEach((k,v)->{
//            System.out.println("k:"+k+",v:"+v);
//        });

        //example from book
        Stream<Locale> locales = Stream.of(Locale.getAvailableLocales());
        Map<String, Set<String>> countryLanguageSets = locales.collect(
                Collectors.toMap(
                        Locale::getDisplayCountry,
                        l -> Collections.singleton(l.getDisplayLanguage()),
                        (a, b) -> { // Union of a and b
                            var union = new HashSet<String>(a);
                            union.addAll(b);
                            return union; }));
        countryLanguageSets.forEach((k,v)->{
            System.out.println("k:"+k+",v:"+v);
        });

        //example from book
//        Map<Integer, Person> idToPerson = people.stream().collect(
//                Collectors.toMap(
//                        Person::getId,
//                        Function.identity(),
//                        (existingValue, newValue) -> { throw new IllegalStateException(); },
//                        TreeMap::new));
    }
}
