package com.wwd.string;

/**
 * @author WangWD.
 * @date 2019/4/2.
 * @time 17:19.
 *
 * 去除字符串两端空格
 *      String trim()
 *
 * 按照指定符号分割字符串
 *      String[] split(String str)
 *
 */
public class StringDemo5 {
    public static void main(String[] args) {

        //创建字符串对象
        String s1 = "helloworld";
        String s2 = " HelloWorld ";
        String s3 = " hello world ";

        System.out.println("---" + s2.trim() + "---");
        System.out.println("---" + s3.trim() + "---");

        String[] strArray = s1.split("o");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }

    }
}
