package com.wwd.string;

/**
 * @author WangWD.
 * @date 2019/4/2.
 * @time 16:15.
 *
 * Object:是类层次结构中的根类，所有的类都直接或者间接的继承自该类。
 * 如果一个方法的形式参数是Object,那么这里我们就可以传递他的任意的子类对象
 *
 *
 * String类的判断功能：
 * boolean equals(Object obj):比较字符串的内容是否相同
 * boolean equalsIgnoreCase(String str):比较字符串的内容是否相同,忽略大小写
 * boolean startsWitch(String str):判断字符串对象是否以指定的str开头
 * boolean endsWith(String str):判断字符串对象是否以指定的str结尾
 *
 */
public class StringDemo2 {
    public static void main(String[] args) {
        //创建字符串对象
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "Hello";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println("---------");

        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.startsWith("he"));
        System.out.println(s1.endsWith("lo"));
    }
}
