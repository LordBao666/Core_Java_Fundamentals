package com.lordbao.book.pair2;

import java.time.LocalDate;

/**
 * @Author Lord_Bao
 * @Date 2021/6/13 19:59
 * @Version 1.0
 */
public class Test02GenericMethods {
    public static void main(String[] args) {
        String [] strArr = {"a","b","c"};
        String middle = ArrayAlg.<String>getMiddle(strArr);
        System.out.println(middle);

//       Due to type inference , We can omit <String>
        String middle1 = ArrayAlg.getMiddle(strArr);
        System.out.println(middle1);

        System.out.println(ArrayAlg.minMax(strArr));

        LocalDate [] localDates = {
                LocalDate.of(2000,1,1),
                LocalDate.of(2001,1,1),
                LocalDate.of(2000,1,2)
        };
        Pair<LocalDate> chronoLocalDatePair = ArrayAlg.minMax(localDates);
        System.out.println(chronoLocalDatePair);

    }
}

