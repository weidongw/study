package com.wwd.stringBuilder;

import java.util.Scanner;

/**
 * @author WangWD.
 * @date 2019/4/8.
 * @time 13:32.
 *
 * 判断一个字符串是否是对称字符串
 * 例如："aba","aaaa","mnanm"
 *
 * 分析:
 *      A:键盘录入一个字符串
 *      B:写方法判断一个字符串是否是对称的
 *          先把字符串反转，和反转前的字符串进行比较，如果内容相同，就说明是对称字符串
 *      C:调用方法
 *      D:输出结果
 *
 */
public class StringBuilderTest4 {
    public static void main(String[] args) {
        //键盘录入一个字符串
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String string = scanner.nextLine();

        boolean bl = isSymmetry(string);
        System.out.println("bl: " + bl);

    }

    /*
     * 返回值类型：boolean
     * 参数列表：String
     */
    public static boolean isSymmetry(String string) {
        //字符串反转，和反转钱的字符串进行比较，如果内容相同，就是对称的
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.reverse();
        String result = stringBuilder.toString();

        return result.equals(string);
    }
}
