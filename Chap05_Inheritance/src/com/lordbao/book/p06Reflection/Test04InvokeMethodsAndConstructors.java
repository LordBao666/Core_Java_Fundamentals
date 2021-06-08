package com.lordbao.book.p06Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author Lord_Bao
 * @Date 2021/6/8 16:19
 * @Version 1.0
 */
public class Test04InvokeMethodsAndConstructors {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException, InstantiationException {
        var jack = new Employee("jack", 1000, 1990, 1, 1);
        Class clazz =Employee.class;
        // 1.如果有参数，那么还需要传入参数类型（因为重载,所以要求必须传入参数类型进行区分)
        Method getSalary = clazz.getDeclaredMethod("getSalary");
        double result = (Double)getSalary.invoke(jack);
        System.out.println("salary:"+result);

        //2.测试Math.max()
        Class  mathClass = Math.class;
        Method max = mathClass.getDeclaredMethod("max", double.class, double.class);
        // 静态方法，第一个方法调用者设置为null
        double result2 = (Double)max.invoke(null, 3.3, 2.2);
        System.out.println("max ："+result2);

        //3.测试构造方法
        //1.这些信息都是从外部传入的String类型
        String className = "com.lordbao.book.p06Reflection.Employee";
        String name ="harry";
        String salaryStr = "1000";
        String yearStr = "1990";
        String monthStr = "1";
        String dayStr = "1";
        //转换类型
        double salary = Double.parseDouble(salaryStr);
        int year = Integer.parseInt(yearStr);
        int month =Integer.parseInt(monthStr);
        int day = Integer.parseInt(dayStr);
        //拿到Constructor 然后创建对象(当然,这个还是受到访问控制权限的限制)
        Class  EmployeeClass = Class.forName(className);
        //传入构造函数的参数类型(因为存在重载，所以需要区分）
        Constructor constructor = EmployeeClass.getConstructor(String.class, double.class, int.class, int.class, int.class);
        var employee = (Employee)constructor.newInstance(name, salary, year, month, day);
        System.out.println(employee);
    }


}
