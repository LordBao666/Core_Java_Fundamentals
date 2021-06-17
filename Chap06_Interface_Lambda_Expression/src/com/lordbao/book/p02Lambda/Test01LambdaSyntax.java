package com.lordbao.book.p02Lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author Lord_Bao
 * @Date 2021/6/12 10:14
 * @Version 1.0
 */
public class Test01LambdaSyntax {

    public static void main(String[] args) {
        var strArr = new String[]{"a", "ccc", "bb"};
        // 这里是使用了类型推断，所以(first,second)不用写参数，因为strArr表明
        // 泛型T是String类型，那么后面的Comparator限定是String类型。所以可以不用写参数。
        String[] strArrCopy1 = Arrays.copyOf(strArr, strArr.length);
        Arrays.sort(strArrCopy1, (first, second) -> first.length() - second.length());
        for (var str : strArrCopy1){
            System.out.println(str);
        }

        System.out.println();

        // 如果需要重用Comparator的话，应该这样写。这里我们改成降序
        Comparator<String> stringComparator = (first, second) -> second.length() - first.length();
        String[] strArrCopy2 = Arrays.copyOf(strArr, strArr.length);
        Arrays.sort(strArrCopy2,stringComparator);
        for (var str : strArrCopy2){
            System.out.println(str);
        }

    }
}
