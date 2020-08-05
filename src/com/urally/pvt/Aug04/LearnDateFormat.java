package com.urally.pvt.Aug04;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//`java.text.DateFormat` 是日期/时间格式化子类的抽象类，
// 我们通过这个类可以帮我们完成日期和文本之间的转换,
// 也就是可以在Date对象与String对象之间进行来回转换。
// 1. 格式化: 按照制定的格式,从Date对象转换为String对象  public String format(Date date)
// 2. 解析: 按照指定的格式,从String对象转换为Date对象    public Date parse(String source);
// 3. DateFormat 为抽象类,不能直接使用,所以需要常用的子类java.text.SimpleDateFormat
// public SimpleDateFormat(String pattern);
public class LearnDateFormat {
    public static void main(String[] args) {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String dateString = format.format(date);
        System.out.println(dateString);
        try {
            Date date1 = format.parse(dateString);
            System.out.println(date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
