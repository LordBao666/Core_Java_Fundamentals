package com.lordbao.book.p03GenericArrayList;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @Author Lord_Bao
 * @Date 2021/6/3 11:16
 * @Version 1.0
 */
class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
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

}
