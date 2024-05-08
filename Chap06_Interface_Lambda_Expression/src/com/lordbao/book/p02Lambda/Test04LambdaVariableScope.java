package com.lordbao.book.p02Lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @Author Lord_Bao
 * @Date 2024/5/8 15:57
 * @Version 1.0
 */
public class Test04LambdaVariableScope{
    public static void main(String[] args) {
        method("world");
    }

    public static void method(String arg){

        Consumer <String> consumer = ele ->{
            System.out.println(ele+arg);//Here arg will be an instance field of the object of consumer.
        };
        consumer.accept("hello ");


    }

}
