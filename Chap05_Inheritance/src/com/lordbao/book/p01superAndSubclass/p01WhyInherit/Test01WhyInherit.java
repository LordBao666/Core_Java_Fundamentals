package com.lordbao.book.p01superAndSubclass.p01WhyInherit;

import java.time.LocalDate;

/**
 * @Author Lord_Bao
 * @Date 2021/4/26 14:33
 * @Version 1.0
 */
public class Test01WhyInherit {

    public static void main(String[] args) {
          var a = new Manager("jack",2,2,2,2,2);
    }
}


class Employee{
    private  String name ;
    private  double salary;
    private  LocalDate hireDay;
    public Employee(String name, double salary, int year,int month,int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year,month,day);
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends  Employee{
    // 额外的属性  分红
    private double bonus;
    public Manager(String name, double salary, int year,int month,int day,double bonus){
        super(name, salary, year, month, day);
        this.bonus = bonus;
    }

    // 更加细分的方法
    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }
}