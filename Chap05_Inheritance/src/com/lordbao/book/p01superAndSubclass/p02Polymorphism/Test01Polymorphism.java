package com.lordbao.book.p01superAndSubclass.p02Polymorphism;

/**
 * @Author Lord_Bao
 * @Date 2021/4/26 16:26
 * @Version 1.0
 */
public class Test01Polymorphism {

    public static void main(String[] args) {
        Person[] people = {new Chinese(), new English(), new Japanese()};
        helloForCountries(people);
    }

    public  static  void helloForCountries(Person [] array){
        for(Person p : array){
            p.hello();
        }
    }
}

abstract class Person {
    public abstract void hello();
}


class Chinese extends Person {

    @Override
    public void hello() {
        System.out.println("你好!");
    }
}

class English extends Person {

    @Override
    public void hello() {
        System.out.println("hello!");
    }


}

class Japanese extends Person {

    @Override
    public void hello() {
        System.out.println("こんにちは");
    }
}
