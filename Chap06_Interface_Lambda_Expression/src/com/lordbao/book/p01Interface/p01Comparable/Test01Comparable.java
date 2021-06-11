package com.lordbao.book.p01Interface.p01Comparable;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author Lord_Bao
 * @Date 2021/6/10 19:24
 * @Version 1.0
 */
public class Test01Comparable {

    public static void main(String[] args) {

        // 创建Comparator实例对象
        var salaryComparator = new Comparator<Employee>() {

            @Override
            public int compare(Employee o1, Employee o2) {
                double o1AllFund = o1.getSalary() + addBonus(o1);
                double o2AllFund = o2.getSalary() + addBonus(o2);
                // 借用Double进行比较，避免精度问题，避免越界问题。
                return Double.compare(o1AllFund, o2AllFund);
            }
            /**
             *
             * @param employee 员工对象
             * @return 如果Employee 是 Manager ,那么返回bonus。如果不是Manager,那么返回0.
             */
            private double addBonus(Employee employee) {
                double bonus = 0;
                if (employee.getClass() == Manager.class) {
                    bonus = ((Manager) employee).getBonus();
                }
                return bonus;
            }
        };

        var a = new Manager("a",1000,200);
        var b = new Employee("b",1100);
        var c = new Employee("c",1300);
        var employeeArr = new Employee[]{a,b,c} ;
        //复制两份拷贝，因为Arrays.sort()会影响传入的数组，所以仅在拷贝上做测试
        Employee[] employeeArrCopy1 = Arrays.copyOf(employeeArr,employeeArr.length);
        Employee[] employeeArrCopy2 = Arrays.copyOf(employeeArr, employeeArr.length);

        //按name进行字典升序
        System.out.println("按name进行字典升序");
        Arrays.sort(employeeArrCopy1);
        for (var elt : employeeArrCopy1) {
            System.out.println(elt);
        }
        System.out.println();

        //按工资总和升序
        System.out.println("按salary+bonus总和升序");
        Arrays.sort(employeeArrCopy2,salaryComparator);
        for (var elt : employeeArrCopy2) {
            System.out.println(elt);
        }
    }
}
