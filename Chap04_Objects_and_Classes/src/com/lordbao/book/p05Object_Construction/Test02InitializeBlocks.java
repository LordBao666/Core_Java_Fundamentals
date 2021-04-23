package com.lordbao.book.p05Object_Construction;

/**
 * @Author Lord_Bao
 * @Date 2021/4/23 19:20
 * @Version 1.0
 */
public class Test02InitializeBlocks {
    public static void main(String[] args) {
        var a = new Kid();
        var b = new Kid("Death13");
    }
}
class Kid{
    private String name;
    // 静态初始化块
    static {
        System.out.println("Kid Class  id loaded!!!");
    }

    //初始化块
    {
        System.out.println("Another Baby is born!");
    }


    public Kid(){
        this("unknown");
    }


    public  Kid(String name){
        this.name =name;
        System.out.println("name ："+name);
    }

}
