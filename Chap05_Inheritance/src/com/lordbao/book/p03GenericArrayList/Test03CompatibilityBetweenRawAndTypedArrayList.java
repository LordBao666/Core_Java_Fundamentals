package com.lordbao.book.p03GenericArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Lord_Bao
 * @Date 2021/6/3 12:09
 * @Version 1.0
 */
public class Test03CompatibilityBetweenRawAndTypedArrayList {
    public static void main(String[] args) {
//         ArrayList<Employee> staff = new ArrayList<>();
//         var a1 = new Employee("a1",1000,1990,3,3);
//         var a2 = new Employee("a2",1000,1990,3,3);
//         var a3 = new Employee("a3",1000,1990,3,3);
//         staff.add(a1);
//         staff.add(a2);
//         staff.add(a3);
//
//         ArrayList<Object> b =staff; //error,since Employee is not Object
//         ArrayList c = staff;//For grammar,it is ok here,but not recommended since you cannot use Employee's method directly
//

        ArrayList staff = new ArrayList<>();
        var a1 = new Employee("a1",1000,1990,3,3);
        var a2 = new Employee("a2",1000,1990,3,3);
        var a3 = new Employee("a3",1000,1990,3,3);
        var a4 = new Object();
        staff.add(a1);
        staff.add(a2);
        staff.add(a3);
        staff.add(a4);

        ArrayList<Employee> staff1 = staff;//For grammar,it is ok here,However if one instance in staff1 is not Employee,it may yield an error
//        Employee ep = staff1.get(staff.size() - 1); //ClassCastException:Object cannot be cast to Employee


    }


}
