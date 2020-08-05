package com.urally.pvt.Aug05;
import java.util.Arrays;
//java.lang.System 类中提供了大量的静态方法,可以获取与系统相关的信息或系统级操作,在

public class LearnSystem {
    public static void main(String[] args) {

        //currentTimeMillis()
        System.out.println(System.currentTimeMillis());
        //for 循环打印数组1-9999所需要的时间(毫秒)
        long start = System.currentTimeMillis();
        for (int i = 0;i<10000;i++){
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时毫秒"+(end-start));
        //arraycopy 将数组中的指定数据拷贝到另一个数组中
        //数组拷贝动作是系统级的,性能很高
        //将src数组中前3个元素，复制到dest数组的前3个位置上复制元素前：
        // src数组元素[1,2,3,4,5]，dest数组元素[6,7,8,9,10]
        // 复制元素后：src数组元素[1,2,3,4,5]，dest数组元素[1,2,3,9,10]
        int[] src = new int[]{1,2,3,4,5};
        int[] dest = new int[]{6,7,8,9,10};
        System.arraycopy( src, 0, dest, 0, 3);
       // System.arraycopy(src,0,dest,0,3);
        for (int i:
             dest) {
            System.out.println(i);
        }
    }
}
