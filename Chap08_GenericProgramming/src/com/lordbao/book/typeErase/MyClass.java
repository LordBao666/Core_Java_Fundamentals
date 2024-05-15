package com.lordbao.book.typeErase;

/**
 * @Author Lord_Bao
 * @Date 2024/5/12 12:16
 * @Version 1.0
 */
public class MyClass <T>{
    private T pro1;


    public MyClass() {
    }

    public MyClass(T pro1) {
        this.pro1 = pro1;

    }

    public T getPro1() {
        return pro1;
    }

    public void setPro1(T pro1) {
        this.pro1 = pro1;
    }

}
