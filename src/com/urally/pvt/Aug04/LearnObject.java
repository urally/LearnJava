package com.urally.pvt.Aug04;

import java.util.Objects;

/*java.lang.Object类是java语言中的根类,所有类的父类.它所描述的所有方法子类都可以使用.
 *在对象实例化的时候,最终找到的父类就是Object.
 * 如果一个类没有特别指定父类,那么默认继承Object类
*/
public class LearnObject {
    private int id;
    public static void main(String[] args) {

    }
    //返回该对象的字符串表示
    @Override
    public String toString() {
        return "LearnObject{}";
    }
    //指示其他某个对象是否与此对象"相等"
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LearnObject)) return false;
        LearnObject that = (LearnObject) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
