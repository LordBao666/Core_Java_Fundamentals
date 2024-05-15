package com.lordbao.book.typeErase;

/**
 * @Author Lord_Bao
 * @Date 2024/5/12 12:18
 * @Version 1.0
 */
public class MyClassSub extends MyClass<Integer>{
    @Override
    public Integer getPro1() {
        return super.getPro1();
    }

    @Override
    public void setPro1(Integer pro1) {
        super.setPro1(pro1);
    }
}
