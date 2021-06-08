package com.lordbao.book.p05EnumerationClass;

/**
 * @Author Lord_Bao
 * @Date 2021/6/3 14:31
 * @Version 1.0
 */
public enum TrafficLight {

    //声明对象
    GREEN("G"),RED("R"),YELLOW("Y");

    private String abbreviation;
    //private可以省略
    TrafficLight(String abbreviation){
         this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }


}
