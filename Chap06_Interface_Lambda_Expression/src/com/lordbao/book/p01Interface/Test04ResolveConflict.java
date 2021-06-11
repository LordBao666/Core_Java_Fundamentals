package com.lordbao.book.p01Interface;

/**
 * @Author Lord_Bao
 * @Date 2021/6/11 15:12
 * @Version 1.0
 */
public class Test04ResolveConflict {
    public static void main(String[] args) {
        System.out.println(new SpecificPerson().getName());
    }
}

class Person{

    public String getName(){
        return "Person :Name";
    }
}

interface Named{
    default String getName(){
        return "Named:Name";
    }
}

interface Named2{
    default String getName(){
        return "Named2:Name";
    }
}

class MyName implements Named, Named2{

    @Override
    public String getName() {
        return Named.super.getName();
    }
}

class SpecificPerson extends Person implements Named{
    @Override
    public String getName() {
        // 如果想调用Named 的默认方法，采用如下操作。
        return Named.super.getName();
    }
}


