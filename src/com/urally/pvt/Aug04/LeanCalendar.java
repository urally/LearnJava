package com.urally.pvt.Aug04;
import java.util.Calendar;
//`java.util.Calendar`是日历类，在Date后出现，替换掉了许多Date的方法。
// 该类将所有可能用到的时间信息封装为静态成员变量，方便获取。
// 日历类就是方便获取各个时间属性的。
//Calendar为抽象类，由于语言敏感性，Calendar类在创建对象时并非直接创建，而是通过静态方法创建，返回子类对象，如下：
//
//Calendar静态方法
//
//* `public static Calendar getInstance()`：使用默认时区和语言环境获得一个日历
public class LeanCalendar {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1; //MONTH 一月是0
        int dayofMonth = cal.get(Calendar.DAY_OF_MONTH);
        cal.set(Calendar.DAY_OF_MONTH,32);
        cal.set(Calendar.HOUR,0);
        cal.set(Calendar.MINUTE,0);
        cal.set(Calendar.SECOND,0);
        System.out.println(cal.getTime());
        System.out.println(year+"年"+month+"月"+dayofMonth+"日");
    }
}
