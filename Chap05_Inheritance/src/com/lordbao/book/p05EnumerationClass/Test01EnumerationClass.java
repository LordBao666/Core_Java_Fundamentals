package com.lordbao.book.p05EnumerationClass;

/**
 * @Author Lord_Bao
 * @Date 2021/6/3 14:58
 * @Version 1.0
 */
public class Test01EnumerationClass {

    public static void main(String[] args) {
        var g = TrafficLight.GREEN;
        var r = TrafficLight.RED;
        var g1 = TrafficLight.GREEN;
        System.out.println(g==r);
        System.out.println(g==g1);
        System.out.println();

        TrafficLight yellow = Enum.valueOf(TrafficLight.class,"YELLOW");
        System.out.println(yellow);
        System.out.println();

        for (var light :TrafficLight.values()){
            System.out.println(light);
        }

    }
}
