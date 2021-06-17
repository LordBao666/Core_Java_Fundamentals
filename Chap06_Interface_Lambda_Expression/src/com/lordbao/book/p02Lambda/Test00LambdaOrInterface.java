package com.lordbao.book.p02Lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

/**
 * @Author Lord_Bao
 * @Date 2021/6/17 14:08
 * @Version 1.0
 */
public class Test00LambdaOrInterface {

    public static void main(String[] args) {
        var strArr = new String[]{"aaa", "bb", "c"};

        //常规方式
//        var lengthComparator = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        };
        //Lambda式
        Comparator<String> lengthComparator = (o1, o2) -> o1.length() - o2.length();

        Arrays.sort(strArr, lengthComparator);
        // 更加简洁
        Arrays.sort(strArr,(o1, o2) -> o1.length() - o2.length());
    }

}
