package com.lordbao.book.p01superAndSubclass.p03InheritWhat;

/**
 * @Author Lord_Bao
 * @Date 2024/5/6 14:16
 * @Version 1.0
 */
public class Child extends Parent{
    //Note that method() here does NOT override the method() of Parent.
    //For grammar, functions of Child class can have the same signature as the ones of
    //Parent class, however it does NOT conform to the concept of override.
    //When you call a static function,it obeys the rule of static binding.
    public static void method(){
        System.out.println("Hello Earth");
    }


    //Child class can have properties with the same name as Parent Class.
    public int instanceProperty1=1;

}
