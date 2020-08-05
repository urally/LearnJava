package com.urally.pvt.Aug05;
//查阅`java.lang.StringBuilder`的API，StringBuilder又称为可变字符序列，
// 它是一个类似于 String 的字符串缓冲区，通过某些方法调用可以改变该序列的长度和内容。
//
//原来StringBuilder是个字符串的缓冲区，即它是一个容器，容器中可以装很多字符串。并且能够对其中的字符串进行各种操作。
//
//它的内部拥有一个数组用来存放字符串内容，进行字符串拼接时，直接在数组中加入新内容。StringBuilder会自动维护数组的扩容
public class LearnStringBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("Hello").append("world");
        System.out.println(str);
    }
}
