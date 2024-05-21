package com.lordbao.algoritms.convertArrayCollection;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Lord_Bao
 * @Date 2024/5/21 18:32
 * @Version 1.0
 */
public class TestConvert {
    public static void main(String[] args) {
        //Convert an array to collection
        Integer [] arr ={1,3,5};
        List<Integer> list = new ArrayList<>(List.of(arr));
        System.out.println(list);

        //Convert a collection to an array. If the type of elements in list is A ,
        //then we can pass a new A[0] to toArray.
        Integer[] array = list.toArray(new Integer[0]);
        for (int ele :array){
            System.out.print(ele+ " ");
        }
    }
}
