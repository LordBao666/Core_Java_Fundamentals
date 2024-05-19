package com.lordbao.map;

import java.util.LinkedHashMap;

/**
 * @Author Lord_Bao
 * @Date 2024/5/19 22:08
 * @Version 1.0
 */
public class TestLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map1 = new LinkedHashMap<>();
        map1.put("a",1);
        map1.put("b",2);
        map1.put("c",3);
        map1.forEach((k,v)->{
            System.out.println(k+":"+v);
        });
        System.out.println("------");
        LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>(16,.75f,true);
        map2.put("a",1);
        map2.put("b",2);
        map2.put("c",3);
        map2.get("b");
        map2.get("a");
        map2.forEach((k,v)->{
            System.out.println(k+":"+v);
        });
    }
}
