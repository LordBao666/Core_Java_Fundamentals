package com.lordbao.algoritms.binSearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author Lord_Bao
 * @Date 2024/5/21 18:16
 * @Version 1.0
 */
public class TestBinarySearch {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,3,4,6));
        int key=2;
        int index = Collections.binarySearch(list,key);
        if(index<0){
            list.add(-index-1,key);
        }
        System.out.println(list);

    }
}
