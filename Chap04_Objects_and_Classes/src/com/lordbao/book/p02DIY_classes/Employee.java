package com.lordbao.book.p02DIY_classes;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @Author Lord_Bao
 * @Date 2021/4/14 21:14
 * @Version 1.0
 *
 */


public class Employee {

    private String name;
    private double salary;
    private LocalDate  hireDay;


    public Employee(String name, double salary, int year, int month, int day){
        // 1.permissive approach 如果传入的name为null,则用unknown进行替代
//        this.name= Objects.requireNonNullElse(name, "unknown");
        // 2.tough approach name不能为null，否则抛空指针异常。
        this.name = Objects.requireNonNull(name);

        this.salary = salary;
        this.hireDay = LocalDate.of(year,month,day);
    }


    public LocalDate getHireDay(){

        //LocalDate 是不可变类型，所以直接返回 hireDay是没问题。
        //如果hireDay是 Date类型，那么应该返回 hireDay的克隆对象。
        // 因为Date是可变类型,hireDay的内部属性但却是要求不可更改的。
        return hireDay;
    }


    public void  raiseSalary(double byPercent){
        this.salary += this.salary * byPercent / 100;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }
}

