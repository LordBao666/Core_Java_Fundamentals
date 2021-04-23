package com.lordbao.book.p05Object_Construction;

/**
 * @Author Lord_Bao
 * @Date 2021/4/23 17:32
 * @Version 1.0
 */
public class Test01Override {
    public static void main(String[] args) {
           var a = new OldSchool();
           var b = new NewSchool();
           method(a);
           method(b);
    }

    //重载方法1
    public  static void   method(OldSchool oldSchool){
        System.out.println("Old Fashion");
    }

    //重载方法2
    public static void method(NewSchool newSchool){
        System.out.println("New Fashion");
    }
}

class OldSchool{ }

class  NewSchool extends OldSchool{ }