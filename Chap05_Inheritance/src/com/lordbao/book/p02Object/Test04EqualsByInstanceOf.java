package com.lordbao.book.p02Object;

import java.util.Objects;

/**
 * @Author Lord_Bao
 * @Date 2021/5/30 20:00
 * @Version 1.0
 */
public class Test04EqualsByInstanceOf {

    public static void main(String[] args) {
        var a  = new ConcreteAlgorithmA(1);
        var b = new ConcreteAlgorithmB(1);
        System.out.println(a.equals(b));
    }
}


abstract  class AbstractAlgorithm{

    private int id ;

    protected AbstractAlgorithm(int id){
        this.id = id;
    }

    //根据实际需要 这里可以设置final,即子类无法重写equals方法。
    @Override
    public boolean equals(Object other) {

        if (this == other) return true;
        if (other == null ) return false;
        if (!(other instanceof  AbstractAlgorithm)) return false;
        AbstractAlgorithm otherObject = (AbstractAlgorithm) other;
        return id == otherObject.id;
    }

    public abstract  void  algorithm();

}

class ConcreteAlgorithmA extends AbstractAlgorithm{

    public ConcreteAlgorithmA(int id) {
        super(id);
    }

    @Override
    public void algorithm() {
        System.out.println("Algorithm A  is called");
    }
}

class ConcreteAlgorithmB extends AbstractAlgorithm{

    public ConcreteAlgorithmB(int id) {
        super(id);
    }

    @Override
    public void algorithm() {
        System.out.println("Algorithm B  is called");
    }
}