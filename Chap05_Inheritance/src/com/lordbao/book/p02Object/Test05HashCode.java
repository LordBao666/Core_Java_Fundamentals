package com.lordbao.book.p02Object;

import java.time.LocalDate;

/**
 * @Author Lord_Bao
 * @Date 2024/4/28 11:16
 * @Version 1.0
 */
public class Test05HashCode {
    /* This method is to test object's built-in hashcode function */
    private static void testBuiltInHashCode(){
        String s = "ok";
        StringBuilder sb = new StringBuilder(s);
        String t = new String("ok");
        StringBuilder tb = new StringBuilder(t);
        System.out.println("s-->hashcode: "+s.hashCode());
        System.out.println("t-->hashcode: "+t.hashCode());
        System.out.println("sb-->hashcode: "+sb.hashCode());
        System.out.println("tb-->hashcode: "+tb.hashCode());
    }
    private static void testDIYClassHashCode(){
        MyEmployee ep1 = new MyEmployee("jack",200, LocalDate.of(2000,1,1));
        MyEmployee ep2 = new MyEmployee("jack",200, LocalDate.of(2000,1,1));
        System.out.println("ep1--->hashcode: "+ep1.hashCode());
        System.out.println("ep2--->hashcode: "+ep2.hashCode());
    }
    public static void main(String[] args) {
//        testBuiltInHashCode();
        testDIYClassHashCode();
    }
}
