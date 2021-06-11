package com.lordbao.book.p01Interface.p01Comparable;

/**
 * @Author Lord_Bao
 * @Date 2021/6/10 19:37
 * @Version 1.0
 */
public class Manager extends Employee {

    private double bonus;


    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                ", bonus=" + bonus +
                '}';
    }

    public double getBonus() {
        return bonus;
    }


}
