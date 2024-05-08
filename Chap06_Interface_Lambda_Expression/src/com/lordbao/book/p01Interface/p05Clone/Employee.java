package com.lordbao.book.p01Interface.p05Clone;

/**
 * @Author Lord_Bao
 * @Date 2024/5/6 16:33
 * @Version 1.0
 */
public class Employee implements Cloneable{
    @Override
    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }
}
