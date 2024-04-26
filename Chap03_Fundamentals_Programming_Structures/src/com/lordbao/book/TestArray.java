package com.lordbao.book;

import java.util.Arrays;

/**
 * @Author Lord_Bao
 * @Date 2024/4/26 16:20
 * @Version 1.0
 */
public class TestArray {
    public static void main(String[] args) {
        /* Declare Array.
        * You should know the initial value is 0 for number,and other
        * types' initial values are 0's counterpart, like false for boolean and null for object.
        **/
        //way 1   new keyword
        int len=10;
        int [] a = new int[len];//len does not have to be constant

        //way 2
        int [] b ={1,2,3,4}; // an easier way if you know the initial values
        int [] c={1,2,3,4,};// It's ok that a comma is after the last value

        // way 3 an anonymous array
        int [] arr;
        arr = new int[]{1, 2, 3, 4};
        // it equals to the code below
        //int [] anonymous = {1,2,3,4};
        //int [] arr = anonymous;



        /*You can use for or for-each loop to print values for an array,
        in this case Arrays.toString(array) works the same but more neatly.
        */
        System.out.println(Arrays.toString(new int[]{1,2,3,4}));

        /*Try Arrays.copyOf method to copy array*/
        int [] arr1= {1,2,3,4};
        int [] arrCp1= Arrays.copyOf(arr1,arr1.length);
        System.out.println(Arrays.equals(arr1, arrCp1));//true
    }
}
