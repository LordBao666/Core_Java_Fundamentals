package com.lordbao.book.p02DIY_classes;

/**
 * @Author Lord_Bao
 * @Date 2021/4/23 19:07
 * @Version 1.0
 */
public class Test02This {

    public static void main(String[] args) {
        System.out.println(new Kid());
        System.out.println(new Kid("Death13",1));
    }
}

class Kid{

    private String name;
    private int age;

    public Kid(){
         //放在第一行， 调用其他构造方法
         this("天山童姥",999);
    }

    public Kid(String name,int age){
        // 通过this显式调用name属性 和 age属性,因为同名局部变量的作用域默认比数据域的大
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Kid{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
