package com.lordbao.book.p02Object;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @Author Lord_Bao
 * @Date 2021/5/27 14:41
 * @Version 1.0
 */
public class Test03EqualsByFalseInstanceOf {
    public static void main(String[] args) {
        var a1= new Employee("a", 2, 2, 2, 2);
        var a2 = new Manager("a", 2, 2, 2, 2, 2.0);
        System.out.println(a1.equals(a2));
        System.out.println(a2.equals(a1));

    }
}

class Employee1 {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee1(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }


    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;

        if (otherObject instanceof Employee1) return false;

        // 到这里将比较otherObject和this的属性(如hireDate)。而且很明显此时this和otherObject的类型是一样的
        Employee1 other = (Employee1) otherObject;

        return Objects.equals(other.name, name) && Objects.equals(other.hireDay, hireDay)
                && Double.compare(other.salary, salary) == 0;
    }

}

class Manager1 extends Employee1 {
    // 额外的属性  分红
    private double bonus;

    public Manager1(String name, double salary, int year, int month, int day, double bonus) {
        super(name, salary, year, month, day);
        this.bonus = bonus;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) return false;
//        if (!(otherObject instanceof Manager1)) return false;
        Manager1 other = (Manager1) otherObject;
        return Double.compare(bonus, other.bonus) == 0;
    }

}