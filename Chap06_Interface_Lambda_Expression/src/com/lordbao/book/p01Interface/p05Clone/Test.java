package com.lordbao.book.p01Interface.p05Clone;

/**
 * @Author Lord_Bao
 * @Date 2024/5/6 16:33
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employee1 = new Employee();
        Employee employee2 = employee1.clone();
    }
}
