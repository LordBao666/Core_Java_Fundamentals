package com.lordbao.book.p01Interface;

/**
 * @Author Lord_Bao
 * @Date 2021/6/10 20:39
 * @Version 1.0
 */
public class Test02InterfacePros {
}

interface TestInterface {
    //  默认public  static final,所以可以不用写
//   public static final int FLAG =1;
    int FLAG = 1;

    static void method1() {
        // 其他代码
        helperFunction1();
        // 当然 helperFunction2是不可以调的
    }

    static void method2() {
        helperFunction1();
        // 当然 helperFunction2是不可以调的
    }

    private static void helperFunction1() {
    }

    default void method3(){
        // 当然 helperFunction1是可以调的
//        helperFunction1();
        helperFunction2();
    }

    default void method4(){
        // 当然 helperFunction1是可以调的
        //        helperFunction1();
        helperFunction2();
    }

    private void helperFunction2(){
    }

    void  method5();
}