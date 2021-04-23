package com.lordbao.book.p01using_predefined_classes;

import java.time.LocalDate;
import java.util.Date;

/**
 * @Author Lord_Bao
 * @Date 2021/4/10 20:47
 * @Version 1.0
 */

/**
 *  Date  专门用于度量时间  LocalDate专门用来表示时间
 *
 *  LocalDate  用静态工厂 来创建对象， 这个后面再深入了解
 *
 * 测试对象和对象变量
 *   对象变量必须初始化后，才能进行访问。
 *   同一个对象可以有多个对象变量
 *   new 干的是两件事，调用类的构造方法创建对象，并返回对该对象的应用
 */
public class Test01ObjectAndObjectVariable {
    public static void main(String[] args) {

        LocalDate now1 = LocalDate.now();
        LocalDate now2 =now1;
        LocalDate now3 = now1;

        System.out.println(now1.toString());
        System.out.println(now2.toString());
        System.out.println(now3.toString());

        Date now = new Date();
        System.out.println(now);
    }
}
