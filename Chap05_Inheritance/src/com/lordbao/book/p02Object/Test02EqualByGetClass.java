package com.lordbao.book.p02Object;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @Author Lord_Bao
 * @Date 2021/5/24 21:00
 * @Version 1.0
 */
public class Test02EqualByGetClass {

    public static void main(String[] args) {
        var tom1 = new Manager("tom", 2, 2, 2, 2, 2.0);
        var tom2 = new Manager("tom", 2, 2, 2, 2, 2.0);
        var jack = new Manager("jack,", 2, 2, 2, 2, 2.0);
        System.out.println(tom1.equals(jack));
        System.out.println(tom1.equals(tom2));

    }
}


class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }


//     IDEA 自动生成的equals代码，有参考意义。

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return Double.compare(employee.salary, salary) == 0 &&
//                Objects.equals(name, employee.name) &&
//                Objects.equals(hireDay, employee.hireDay);
//    }


    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        // getClass是一种处理方法,该方法会返回调用对象代表的类所对应的Class对象。
        // 上面这句话可能会让人迷惑，不过现在可以不用考虑那么多，这里只需要知道，可以通过下面的代码
        //来判断不同对象的类型是否相同即可
        if (getClass() != otherObject.getClass()) return false;

        // 到这里将比较otherObject和this的属性(如hireDate)。而且很明显此时this和otherObject的类型是一样的
        Employee other = (Employee) otherObject;
        // 1.如果是引用数据类型的数据域，为了避免为null的情况，所以直接调用Objects.equals进行处理
        // 该方法会对null的情况进行判断，原码如下： return (a == b) || (a != null && a.equals(b));
        // 2.对于非引用数据类型，比如int，long等可以用 == 进行判断，但是double,float等用==判断，可能会由于精度的问题
        // 而出错，所以Double.compare(other.salary,salary)==0来判定二者是否相同。
        return Objects.equals(other.name, name) && Objects.equals(other.hireDay, hireDay)
                && Double.compare(other.salary, salary) == 0;
    }

}

class Manager extends Employee {
    // 额外的属性  分红
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day, double bonus) {
        super(name, salary, year, month, day);
        this.bonus = bonus;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) return false;
        // 因为父类已经用getClass判断了类型。
        // 所以此时 otherObject和this必然属于同一个类，比较特有的属性即可
        Manager other = (Manager) otherObject;
        return Double.compare(bonus, other.bonus) == 0;
    }


}