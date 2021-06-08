package com.lordbao.book.p06Reflection;

import java.lang.reflect.Field;

/**
 * @Author Lord_Bao
 * @Date 2021/6/7 20:25
 * @Version 1.0
 */
public class Test03AnalyzeObjects {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //1.分析对象的域
        var jack = new Employee("jack", 1000, 1990, 1, 1);
        Class class1 = jack.getClass();
        Field nameField = class1.getDeclaredField("name");
        //get 和 set  受到访问控制权限限制。这个和之前讲的访问控制权限是一致的。如果绕过访问控制权限，使用下面代码
//        nameField.setAccessible(true);
//        Object nameValue = nameField.get(jack);
//        System.out.println(nameValue);
//        nameField.set(jack,"JACK");
//        System.out.println(jack);
        //打印obj的所有属性的值
        printAllFields(jack);
    }

    private static  void printAllFields(Object obj) throws IllegalAccessException {
        Class  clazz = obj.getClass();
        Field[] declaredFields = clazz.getDeclaredFields();
        for(var field:declaredFields){
            field.setAccessible(true);
            String fieldName = field.getName();
            Object value = field.get(obj);
            System.out.println(fieldName+":"+value);
        }
    }

}
