package com.lordbao.book.typeErase;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Lord_Bao
 * @Date 2024/5/12 12:19
 * @Version 1.0
 */
public class MyMain {

    public static void main(String[] args) {
        MyClass <Integer> ele = new MyClassSub();
        ele.setPro1(1);
    }
}
