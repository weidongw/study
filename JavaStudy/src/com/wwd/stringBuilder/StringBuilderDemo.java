package com.wwd.stringBuilder;

/**
 * @author WangWD.
 * @date 2019/4/4.
 * @time 17:16.
 *
 * StringBuilder:是一个可变字符串。字符串缓冲区类。
 *
 * String和StringBuilder的区别：
 *      String的内容是固定的；
 *      StringBuilder的内容是可变的。
 *
 * 构造方法：
 *      StringBuilder()
 *
 *      sb：上班，随便
 *
 * 成员方法：
 *      public int capacity():返回当前容量
 *
 *      public int length():返回长度(字符个数)
 *
 *      容量：理论值
 *      长度：实际值
 *
 * 常用方法：
 *      添加功能：
 *              public StringBuilder append(任意类型)：添加数据，并返回自身
 *
 *      反转功能：
 *              public StringBuilder reverse()
 *
 */
public class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();

        System.out.println("stringBuilder:" + stringBuilder);

        /*System.out.println("stringBuilder.capacity():" + stringBuilder.capacity());
        System.out.println("stringBuilder.length():" + stringBuilder.length());

        StringBuilder sb = stringBuilder.append("HelloWorld");
        System.out.println("sb:" + sb);
        System.out.println("stringBuilder:" + stringBuilder);
        System.out.println(sb == stringBuilder);    //引用类型用 == 直接比较，比的是地址值*/

        /*sb.append(100);
        sb.append(true);*/

        //链式编程
        stringBuilder.append("hello").append("world").append(true).append(100);
        System.out.println("stringBuilder:" + stringBuilder);

        //反转
        stringBuilder.reverse();
        System.out.println("stringBuilder:" + stringBuilder);
    }
}
