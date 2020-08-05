package com.urally.pvt.Aug05;
//java.lang.System 类中提供了大量的静态方法,可以获取与系统相关的信息或系统级操作,在

public class LearnSystem {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        //for 循环打印数组1-9999所需要的时间(毫秒)
        long start = System.currentTimeMillis();
        for (int i = 0;i<10000;i++){
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时毫秒"+(end-start));
    }
}
