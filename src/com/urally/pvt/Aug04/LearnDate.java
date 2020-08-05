package com.urally.pvt.Aug04;
import java.util.Date;

// java.util.Data 类表示特定的瞬间, 精确到毫秒
public class LearnDate {
    public static void main(String[] args) {
        // 创建日期对象, 当前时间
        System.out.println(new Date());
        // 创建时间对象, offset 0L since 1970
        System.out.println(new Date(0L));
        // 在使用println方法时,会自动调用Date类中的toString方法.Date类对Object类中的toString方法进行了覆盖重写,所以结果为指定格式的字符串
        // public long getTime() 把日期对象转换成对应的时间毫秒值
        Date current = new Date();
        long timeinterval = current.getTime();
    }
}
