package com.lordbao.book.p06Reflection;

import java.lang.reflect.InvocationTargetException;

/**
 * @Author Lord_Bao
 * @Date 2021/6/7 15:30
 * @Version 1.0
 */
public class Test01Class {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //  三种方式拿到Class .
        //1.  对象.getClass
        var jack = new Employee("jack", 1000, 1990, 1, 1);
        // Class 也涉及泛型,不过一般忽略它们。
        Class class1 = jack.getClass();
        // getName  是含包名的
        System.out.println(class1.getName());
        System.out.println(class1.getSimpleName());

        // 数组也是对象，它也可以调用getClass方法。
        int[] a = {1, 2};
        Class class2 = a.getClass();
        System.out.println(class2.getName());

        //2.Class 的静态方法 forName("包名+类名") 当然接口也是可以的
        Class class3 = Class.forName("com.lordbao.book.p06Reflection.Employee");
        System.out.println(class3.getName());
        Class class4 = Class.forName("com.lordbao.book.p06Reflection.TestInterface");
        System.out.println(class4.getName());

        //3.任意Java类型(含基本类型，数组)，甚至是void.调用Class属性
        Class class5 = Employee.class;
        System.out.println(class5.getName());
        Class class6 = int.class;
        System.out.println(class6.getName());
        Class class7 = int[].class;
        System.out.println(class7.getName());
        Class  class8 = void.class;
        System.out.println(class8.getName());

        //4.Java为每一个Class维护着一个对象，所以可以用==来比较Class。
        System.out.println(Employee.class == jack.getClass());

        //5.根据Class来创建对象，下面这种方式是最常见的。
        Class randomClass =Class.forName("java.util.Random");
//        randomClass.newInstance()  这种方式已经在Java9遭到了废弃，取而代之的是下面这种方式。都是调用的无参构造方法。
        Object obj =randomClass.getDeclaredConstructor().newInstance();
        System.out.println(obj);
    }
}
