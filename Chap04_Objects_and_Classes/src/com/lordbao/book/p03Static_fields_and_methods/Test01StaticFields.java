package com.lordbao.book.p03Static_fields_and_methods;

/**
 * @Author Lord_Bao
 * @Date 2021/4/19 20:55
 * @Version 1.0
 */
public class Test01StaticFields {

    public static void main(String[] args) {


        //  比如 Math.PI  和  Math.E  甚至是 System.out
        System.out.println(Math.PI);
        System.out.println(Math.E);

        System.out.println(TrafficLight.RED);
    }
}

class TrafficLight {

    public static final int GREEN = 0;
    public static final int YELLOW = 1;
    public static final int RED = 2;
}