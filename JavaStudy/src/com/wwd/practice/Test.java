package com.wwd.practice;

import java.util.Scanner;

/**
 * @author WangWD.
 * @date 2019/3/28.
 * @time 15:15.
 *
 * 需求：键盘录入一个月份，输出该月份对应的季节。
 *      一年四季
 *          3, 4, 5     春季
 *          6, 7, 8     夏季
 *          9,10,11     秋季
 *          12,1, 2     冬季
 *
 * 分析：
 *      A:键盘录入一个月份，用Scanner实现
 *      B:判断该月份是几月，根据月份输出对应的季节
 *              if
 *              switch
 *
 * case穿透
 *
 */
public class Test {

    public static void main(String[] args) {

        //键盘录入一个月份，用Scanner实现
        Scanner scanner = new Scanner(System.in);
        //接收数据
        System.out.println("请输入月份(1-12)");
        int month = scanner.nextInt();

        /*if (month < 1 || month > 12) {
            System.out.println("您输入的数据有误！");
        } else if (month == 1) {
            System.out.println("1月是冬季！");
        } else if (month == 2) {
            System.out.println("2月是冬季！");
        } else if (month == 3) {
            System.out.println("3月是春季！");
        } else if (month == 4) {
            System.out.println("4月是春季！");
        } else if (month == 5) {
            System.out.println("5月是春季！");
        } else if (month == 6) {
            System.out.println("6月是夏季！");
        } else if (month == 7) {
            System.out.println("7月是夏季！");
        } else if (month == 8) {
            System.out.println("8月是夏季！");
        } else if (month == 9) {
            System.out.println("9月是秋季！");
        } else if (month == 10) {
            System.out.println("10月是秋季！");
        } else if (month == 11) {
            System.out.println("11月是秋季！");
        } else if (month == 12) {
            System.out.println("12月是冬季！");
        }*/

        //精简代码
        /*if (month < 1 || month > 12) {
            System.out.println("您输入的月份有误！");
        } else if (month == 1 || month == 2 || month == 12) {
            System.out.println("冬季");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("春季");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("夏季");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("秋季");
        }*/


        //case穿透
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("您输入的月份有误！");
                break;
        }
    }

}
