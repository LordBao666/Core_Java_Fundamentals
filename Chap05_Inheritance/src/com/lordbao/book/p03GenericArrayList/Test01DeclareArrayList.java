package com.lordbao.book.p03GenericArrayList;

import java.util.ArrayList;

/**
 * @Author Lord_Bao
 * @Date 2021/6/3 10:02
 * @Version 1.0
 */
public class Test01DeclareArrayList {

    public static void main(String[] args) {
        //ArrayList的声明方式
        //1.下面两行代码是等价的。对于第二行代码，根据类型推断，后面的钻石符中的Employee可以省略
//        ArrayList<Employee> staff = new ArrayList<Employee>();
        ArrayList<Employee> staff = new ArrayList<>();

        //2.使用Java10 var特性 显然这个更加简洁。如果不写Employee 等价于<Object>
        // 即new ArrayList<>()等价于new ArrayList<Object>()
        var staff2 = new ArrayList<Employee>();


    }
}


