package com.lordbao.book.p01superAndSubclass.p03InheritWhat;

/**
 * @Author Lord_Bao
 * @Date 2024/5/6 14:16
 * @Version 1.0
 *
 * Child Class inherits almost everything except for the constructor from Parent Class.
 * Here, everything includes instance fields,static fields, instance methods and static methods.
 */
public class Test {
    public static void main(String[] args) {
        Parent p = new Child();
//      When you call a static function,it obeys the rule of static binding.
        p.method();
        Child.method();
        System.out.println(Child.property1);
    }
}
