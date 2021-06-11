package com.lordbao.book.p01Interface.p03DiffAbstractAndInterface;

/**
 * @Author Lord_Bao
 * @Date 2021/6/11 10:20
 * @Version 1.0
 */
public abstract class Animal {

    private int age;
    private int name;

    public int getAge() {
        return age;
    }

    public int getName() {
        return name;
    }

    public abstract void eat();

    public abstract void bark();
}

class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("吃鱼");
    }

    @Override
    public void bark() {
        System.out.println("喵喵叫");
    }

    public void eyeChange(){
        System.out.println("我的眼睛是会变的");
    }
}

class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("吃肉包子");
    }

    @Override
    public void bark() {
        System.out.println("汪汪叫");
    }

    public void wagTail(){
        System.out.println("摇尾巴");
    }
}
interface HeroAble {
    void beatBadGuy();
}

class SuperCat extends Cat implements HeroAble {

    @Override
    public void beatBadGuy() {
        System.out.println("猫咪打怪兽");
    }
}

class SuperDog extends Dog implements HeroAble {

    @Override
    public void beatBadGuy() {
        System.out.println("狗狗打怪兽");
    }

}