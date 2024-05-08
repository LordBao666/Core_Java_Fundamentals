package com.lordbao.book;

/**
 * @Author Lord_Bao
 * @Date 2024/4/27 7:57
 * @Version 1.0
 */
public class Employee {
    private String name;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
