package com.wwd.string;


/**
 * @author WangWD.
 * @date 2019/4/2.
 * @time 15:39.
 *
 * String:字符串类
 *      由多个字符组成的一串数据
 *      字符串其本质是一个字符数组
 *
 * 构造方法：
 *      String(String original):把字符串数据封装成字符串对象
 *      String(char[] value):把字符数组的数据封装成字符串对象
 *      String(char[] value, int offset, int count):把字符数组中一部分数据封装成字符串对象
 *
 * 注意：字符串是一种特殊的引用类型，直接输出字符串对象输出的是该对象中的数据
 *
 * 通过方式1和方式4创建的对象有什么区别？
 *      方式1：构造方法，创建的对象是在堆内存中
 *      方式4：直接赋值，创建的对象是在方法区的常量池中
 *
 * ==:
 *      基本数据类型：比较的是基本数据类型的值是否相同
 *      引用数据类型：比较的是引用数据类型的地址值是否相同
 */
public class StringDemo {
    public static void main(String[] args) {
        //方式1
        String string1 = new String("hello");
        System.out.println(string1);
        System.out.println("-------------------------");

        //方式2
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        String string2 = new String(chars);
        System.out.println(string2);
        System.out.println("-------------------------");

        //方式3
        String string = new String(chars, 0, chars.length);
        System.out.println(string);
        System.out.println("-------------------------");

        //方式4
        String string4 = "hello";
        System.out.println(string4);
        System.out.println("-------------------------");

        String string5 = "hello";

        System.out.println("string1 == string4:" + (string1 == string4));
        System.out.println("string1 == string5:" + (string1 == string5));
        System.out.println("string4 == string4:" + (string4 == string4));
    }
}
