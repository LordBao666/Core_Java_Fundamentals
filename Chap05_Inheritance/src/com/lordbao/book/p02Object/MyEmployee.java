package com.lordbao.book.p02Object;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @Author Lord_Bao
 * @Date 2024/4/28 11:23
 * @Version 1.0
 */
public class MyEmployee {
    private String name;
    private double salary;
    private LocalDate hireDay;
//    private int[] arr; // arr has no special meaning here,just for testing hashcode
    public MyEmployee() {
    }

    public MyEmployee(String name, double salary, LocalDate hireDay) {
        this.name = name;
        this.salary = salary;
        this.hireDay = hireDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyEmployee that = (MyEmployee) o;
        return Double.compare(that.salary, salary) == 0 && Objects.equals(name, that.name) && Objects.equals(hireDay, that.hireDay);
    }

//    Equals and hashCode must be compatible: If
//    x.equals(y) is true, then x.hashCode() must return the same value
//    as y.hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(name, salary, hireDay);
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        MyEmployee that = (MyEmployee) o;
//        return Double.compare(that.salary, salary) == 0 && Objects.equals(name, that.name) && Objects.equals(hireDay, that.hireDay) && Arrays.equals(arr, that.arr);
//    }
//
//    @Override
//    public int hashCode() {
//        int result = Objects.hash(name, salary, hireDay);
//        result = 31 * result + Arrays.hashCode(arr);//
//        return result;
//    }
}
