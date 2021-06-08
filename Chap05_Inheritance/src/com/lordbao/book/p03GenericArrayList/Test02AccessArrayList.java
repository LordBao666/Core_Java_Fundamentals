package com.lordbao.book.p03GenericArrayList;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author Lord_Bao
 * @Date 2021/6/3 11:21
 * @Version 1.0
 */
public class Test02AccessArrayList {

    public static void main(String[] args) {

        var staff = new ArrayList<Employee>();
        var a1 = new Employee("a1",1000,1990,3,3);
        var a2 = new Employee("a2",1000,1990,3,3);
        var a3 = new Employee("a3",1000,1990,3,3);

        //1.测试add
        staff.add(a1);
        staff.add(a3);
        //此处 index 不能大于size,当index=size时，add(index,obj)=add(size,obj)=add(obj)
        staff.add(1,a2);
        for (var elt:
             staff) {
            System.out.println(elt);
        }
        System.out.println();

        //2.测试set和get 注意index只能小于size。
        staff.set(2,a3);
        Employee employee = staff.get(2);
        System.out.println(employee);
        System.out.println();

        //3.remove
        staff.remove(a1);
        staff.remove(0);
        for (var elt:
                staff) {
            System.out.println(elt);
        }
        System.out.println();

        //4.size()
        int size =staff.size();
        System.out.println(size);
        System.out.println();

        //5.转换为数组
        var staffArray = new Employee[staff.size()];
        staffArray = staff.toArray(staffArray);
        System.out.println(Arrays.toString(staffArray));
    }
}
