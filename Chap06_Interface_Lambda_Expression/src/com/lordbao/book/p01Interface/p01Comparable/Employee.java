package com.lordbao.book.p01Interface.p01Comparable;

import java.util.Date;

/**
 * @Author Lord_Bao
 * @Date 2021/6/10 19:10
 * @Version 1.0
 */
public class Employee implements Comparable<Employee> {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }


//    @Override
//    public int compareTo(Employee other) {
//        // 借用Double进行比较，避免精度问题，避免越界问题。
//        return Double.compare(salary,other.salary);
//    }

    @Override
    public int compareTo(Employee other) {
        // 默认字典升序
        return name.compareTo(other.name);

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }


}
