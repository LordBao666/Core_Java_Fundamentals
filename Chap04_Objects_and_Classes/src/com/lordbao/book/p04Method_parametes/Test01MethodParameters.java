package com.lordbao.book.p04Method_parametes;

import java.time.LocalDate;

/**
 * @Author Lord_Bao
 * @Date 2021/4/23 17:05
 * @Version 1.0
 */
public class Test01MethodParameters {
    public  static void  method1(LocalDate a , LocalDate b){
        // nothing
    }

    public  static void  method2(int a , int b){
        // nothing
    }


    public static void main(String[] args) {
        LocalDate a  = LocalDate.now();
        LocalDate b  = a.plusYears(1);
        method1(a,b);


        int c =1;
        int d = 2;
        method2(c,d);
    }
}
