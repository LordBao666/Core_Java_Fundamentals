package com.lordbao.book.p06Reflection;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.Objects;

/**
 * @Author Lord_Bao
 * @Date 2021/6/7 15:29
 * @Version 1.0
 */
public class  Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;
        Employee other = (Employee) otherObject;
        return Objects.equals(other.name, name) && Objects.equals(other.hireDay, hireDay)
                && Double.compare(other.salary, salary) == 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }
//    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        //1.分析对象的域
//        var jack = new Employee("jack", 1000, 1990, 1, 1);
//        Class class1 = jack.getClass();
//        //
//        Field nameField = class1.getDeclaredField("name");
//        Object nameValue = nameField.get(jack);
//        System.out.println(nameValue);
//    }
}
