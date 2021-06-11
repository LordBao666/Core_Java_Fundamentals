package com.lordbao.book.p01Interface.p03DiffAbstractAndInterface;

/**
 * @Author Lord_Bao
 * @Date 2021/6/11 11:06
 * @Version 1.0
 */
public class Test01AnimalInheritance {

    public static void main(String[] args) {
        var cat = new Cat();
        var dog = new Dog();
        animalBark(cat);
        animalBark(dog);
    }

    //这样一个方法就搞定了，而不用写下面那两个方法。
    private static void animalBark(Animal animal) {
        animal.bark();
    }

//    private static void animalBark(Cat cat){
//        cat.bark();
//    }

//    private static  void  animalBark(Dog dog){
//        dog.bark();
//    }
}



