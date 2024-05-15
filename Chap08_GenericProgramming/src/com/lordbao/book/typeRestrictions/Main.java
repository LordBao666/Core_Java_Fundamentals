package com.lordbao.book.typeRestrictions;

import com.lordbao.book.pair2.Pair;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author Lord_Bao
 * @Date 2024/5/12 15:13
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {
        Pair<String> stringPair = new Pair<>("hi", "hello");
        Pair<String> stringPair2 = new Pair<>("bye", "see you");
        ArrayList<Pair<String>> list = new ArrayList<>();
        addAll(list,stringPair,stringPair2);
        list.forEach(System.out::println);
    }

//  We can NOT create array of  generic type ourselves,but here we only get a warning
    @SafeVarargs
    public static   <T> void addAll(Collection<T> coll, T ...args){
        for (T ele : args){
            coll.add(ele);
        }
    }
}


