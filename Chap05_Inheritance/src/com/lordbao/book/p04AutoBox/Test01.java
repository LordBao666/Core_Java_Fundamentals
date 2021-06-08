package com.lordbao.book.p04AutoBox;

import java.util.ArrayList;

/**
 * @Author Lord_Bao
 * @Date 2021/6/3 12:29
 * @Version 1.0
 */
public class Test01 {
    public static void main(String[] args) {

        //自动装箱
//        var integerList = new ArrayList<Integer>();
//        integerList.add(3);
//        for (var elt: integerList) {
//            System.out.println(elt);
//        }


        //自动拆箱
//        int b=10000;
//        Integer a = 10;
//        Integer b =10;
//        System.out.println(a + b);
//        System.out.println(a==b);
//        System.out.println(a.equals(b));


        //基本数据类型和引用数据类型计算
        Integer a = 10000;
        int b =10000;
        System.out.println(a + b);
        System.out.println(a==b);

        //空指针异常
        Integer c =null;
        System.out.println(2 * c);
    }
}
