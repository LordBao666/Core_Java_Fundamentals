package com.lordbao.book.p02DIY_classes;

/**
 * @Author Lord_Bao
 * @Date 2021/4/19 19:57
 * @Version 1.0
 */
public class Test01VarAndNull {

    public static void main(String[] args) {
        var james = new Employee("james", 1000, 1980, 1, 1);
        // 打印变量 和 变量类型
        System.out.println(james);
        System.out.println(james.getClass().getName());
    }

}
