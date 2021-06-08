package com.lordbao.book.p06Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @Author Lord_Bao
 * @Date 2021/6/7 19:21
 * @Version 1.0
 */

public class Test02AnalyzeCapabilityOfClass {

    public static void main(String[] args) throws ClassNotFoundException {
        String className = "com.lordbao.book.p06Reflection.Employee";

        Class class1 = Class.forName(className);
        //拿到父类
        Class superclass = class1.getSuperclass();
        // 这是拿到接口,此处不讲
//        Class[] interfaces = class1.getInterfaces();
//        printClass(class1);
//        printConstructor(class1);
//        printField(class1);
        printMethod(class1);

    }

    //1.分析Class的修饰符
    private static void printClass(Class clazz){
        //将这个传给Modifier.toString(int modifiers)方法进行分析，并返回修饰符(类型String)
        int modifiers = clazz.getModifiers();
        String modifierString = Modifier.toString(modifiers);
        System.out.println(modifierString);
        //除此以外，还可以调用Modifier.isPublic(int mod)  返回布尔值
        System.out.println(Modifier.isPublic(modifiers));
        System.out.println(Modifier.isFinal(modifiers));
    }

    //2.分析Constructor
    private static void printConstructor(Class clazz){
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
//        Constructor[] constructors = clazz.getConstructors();
        for(var constructor : declaredConstructors){
            // getName() 返回String。当然,Field 和 Method都有该方法。 e.g com.lordbao.book.p06Reflection.Employee
            String name = constructor.getName();
            System.out.println(name);
            // 分析修饰符
            System.out.println(Modifier.toString(constructor.getModifiers()));
            //拿到函数的参数类型,并打印
            Class[] parameterTypes = constructor.getParameterTypes();
            for( var parameter:parameterTypes){
                System.out.println(parameter.getName());
            }
        }

    }

    //3.分析Field
    private static void printField(Class clazz){
        Field[] declaredFields = clazz.getDeclaredFields();
//        Field[] fields = clazz.getFields();
        for(var field:declaredFields){
            System.out.println(field.getName());
            System.out.println(Modifier.toString(field.getModifiers()));
            System.out.println(field.getType().getName());
        }
    }

    //4.分析Method
    private static void printMethod(Class clazz){
        Method[] declaredMethods = clazz.getDeclaredMethods();
//        Field[] fields = clazz.getFields();
        for(var method : declaredMethods){
            System.out.println(method.getName());
            System.out.println(Modifier.toString(method.getModifiers()));
            System.out.println(method.getReturnType().getName());
            System.out.println("parameter:");
            Class [] parameterTypes = method.getParameterTypes();
            for(var parameter:parameterTypes){
                System.out.println(parameter.getName());
            }
            System.out.println();
        }
    }


}
