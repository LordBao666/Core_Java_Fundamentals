package com.lordbao.book.stackTrace;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @Author Lord_Bao
 * @Date 2024/5/11 19:31
 * @Version 1.0
 */
public class StackTraceTest0 {
    public static void function1(){
        function2();
    }
    public static void function2(){

        Throwable t=new Throwable();
        StringWriter out = new StringWriter();
        t.printStackTrace(new PrintWriter(out));
        System.out.println(out);
    }

    public static void main(String[] args) {
        function1();
    }
}
