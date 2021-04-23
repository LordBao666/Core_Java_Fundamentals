package com.lordbao.book.p06Comment;

/**
 * @Author Lord_Bao
 * @Date 2021/4/23 19:49
 * @Version 1.0
 *
 * 这里是通用测试，比如写作者，时期，版本等等
 */

/**
 *
 * 这里是类注释，比如说这个类是干嘛的
 *   a {@code TestComment} object is used for Comment Testing
 */
public class TestComment {

    /**
     *  域注释
     *
     */
    private String comment;

    /**
     * 方法注释
     * @see TestComment#TestComment(String)
     *
     */
    public TestComment(){
        this("GOOD!");
    }

    public TestComment(String comment){
        this.comment =comment;
        System.out.println(comment);
    }

}
