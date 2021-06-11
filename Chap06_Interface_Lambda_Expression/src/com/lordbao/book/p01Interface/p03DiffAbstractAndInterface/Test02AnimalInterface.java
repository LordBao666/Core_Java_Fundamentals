package com.lordbao.book.p01Interface.p03DiffAbstractAndInterface;

/**
 * @Author Lord_Bao
 * @Date 2021/6/11 11:34
 * @Version 1.0
 */
public class Test02AnimalInterface {

    public static void main(String[] args) {
        var dog = new SuperDog();
        var cat = new SuperCat();
        beatBadGuy(dog);
        beatBadGuy(cat);
    }

    private static void beatBadGuy(HeroAble hero){
        hero.beatBadGuy();
    }
}


