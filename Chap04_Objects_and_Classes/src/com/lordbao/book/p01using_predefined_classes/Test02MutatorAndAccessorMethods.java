package com.lordbao.book.p01using_predefined_classes;

import java.time.LocalDate;
import java.util.Date;

/**
 * @Author Lord_Bao
 * @Date 2021/4/14 20:15
 * @Version 1.0
 */
public class Test02MutatorAndAccessorMethods {
    public static void main(String[] args) {
        LocalDate now = LocalDate.of(2021,4,18);
        //  minusYears不是修改方法 ,它返回了一个新的对象，该对象的year属性为2020，但并未修改原对象的year属性
        LocalDate oneYearAgo = now.minusYears(1);
        System.out.println(now.getYear());
        System.out.println(oneYearAgo.getYear());


        String s = "Hello World";
        // 也是返回了一个新的对象，并未修改原对象的属性
        String sUpperCase = s.toUpperCase();
        System.out.println(s);
        System.out.println(sUpperCase);

        Date date = new Date();
        System.out.println(date.getTime());
//        更改方法 修改了time属性
        date.setTime(0);
        System.out.println(date.getTime());
    }

}
