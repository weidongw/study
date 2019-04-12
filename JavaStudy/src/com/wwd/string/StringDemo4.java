package com.wwd.string;

/**
 * @author WangWD.
 * @date 2019/4/2.
 * @time 17:10.
 *
 * String类的转换功能
 * char[] toCharArray():把字符串转换为字符数组
 * String toLowerCase():把字符串转换为小写字符串
 * String toUpperCase():把字符串转换为大写字符串
 *
 */
public class StringDemo4 {
    public static void main(String[] args) {
        //创建字符串对象
        String s = "abcde";

        //char[] toCharArray():把字符串转换为字符数组
        char[] cha = s.toCharArray();
        for (int i = 0; i < cha.length; i++) {
            System.out.println(cha[i]);
        }
        System.out.println("----------");

        System.out.println("HelloWorld".toUpperCase());
        System.out.println("HelloWorld".toLowerCase());
    }

}
