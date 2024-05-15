package com.lordbao.book.pair2;

/**
 * @Author Lord_Bao
 * @Date 2024/5/12 9:50
 * @Version 1.0
 */
public class ArrayAlg {


    public static <T> T getMiddle(T... args) {
        return args[args.length / 2];
    }

    //T must implement Comparable interface
    public static  < T  extends Comparable<? super T >> Pair<T> minMax( T [] arr){
        if(arr==null || arr.length==0) return null;
        T min = arr[0];
        T max = arr[0];
        for(T ele : arr){
            if(ele.compareTo(min)<0) min = ele;
            if(ele.compareTo(max)>0) max = ele;
        }
        return new Pair<>(min,max);
    }
}
