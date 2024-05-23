package com.lordbao.book.p01superAndSubclass.p04ArrayCast;

/**
 * @Author Lord_Bao
 * @Date 2024/5/23 9:49
 * @Version 1.0
 */

class A {

}

class B extends A {

}

class C {

}

public class TestArrayCast {
    public static void main(String[] args) {
        //compile error:inconvertible type,A[] cannot be cast as C[]
        //  C [] arr1 = (C[])new A[10];

        //runtime error:class cast exception.This will happen when an array of supertype
        // is cast as an array of its  child type.
        // error
        //A [] arr0 = new A[3];
        //B [] arr1 = (B[])arr0;
        //The cast is fine since arr0 essentially directs to an array of B.
        A[] arr0 = new B[3];
        B[] arr1 = (B[]) arr0;


        //runtime error:array store  exception. After casting a child array to a supertype array,
        //storing an element of non-child type in the array will cause this exception.
        B[] newArr0 = new B[3];
        A [] newArr1 = (A[])newArr0;
//        newArr1[0]=new A();//array store exception
    }
}
