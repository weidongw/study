package com.wwd.stringBuilder;

import java.util.Scanner;

/**
 * @author WangWD.
 * @date 2019/4/8.
 * @time 10:45.
 *
 * 字符串反转
 */
public class StringBuilderTest3 {
    public static void main(String[] args) {
        //键盘录入一个字符串
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String string = scanner.nextLine();

        String result = stringReverse(string);

        System.out.println(result);

    }

    //字符串反转
    public static String stringReverse(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.reverse();

        String result = stringBuilder.toString();

        return result;
    }
}
