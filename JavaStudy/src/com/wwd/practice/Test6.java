package com.wwd.practice;

import java.util.Scanner;

/**
 * @author WangWD.
 * @date 2019/3/28.
 * @time 18:16.
 *
 * 需求：
 *      键盘录入数据，要求数据是四位的整数，现需要对数据进行加密，加密规则如下：
 *          每位数字都加上5，然后对10取余
 *          再将第一位和第四位交换，第二位和第三位交换
 *          请把加密后的数据输出到控制台
 *
 * 分析：
 * 		A:键盘录入一个4位数
 * 			举例：4567
 * 		B:定义一个长度为4的数组
 * 			int[] arr = new int[4];
 * 			arr = {4,5,6,7};
 * 		C:对数组中的数据进行加密规则的操作
 * 			每位数字都加上5,然后除以10的余数代替该数字
 * 				arr[x] += 5;
 * 				结果：arr = {9,10,11,12};
 * 				arr[x] %= 10;
 * 				结果：arr = {9,0,1,2};
 * 			再将第一位和第四位交换,第二位和第三位交换
 * 				结果：arr = {2,1,0,9};
 *		D:请把加密后的数据输出到控制台
 *
 */

public class Test6 {
    public static void main(String[] args) {
        //获取输入对象
        Scanner scanner = new Scanner(System.in);

        //键盘录入一个四位数
        System.out.println("请输入一个四位数：");
        int number = scanner.nextInt();

        //定义一个长度为4的数组
        int[] arr = new int[4];
        arr[3] = number % 10;
        arr[2] = number / 10 % 10;
        arr[1] = number / 100 % 10;
        arr[0] = number / 1000 % 10;


        //每位数字都加上5，然后对10取余
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
        }
        //打印目前数组状态
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("");

        //将第一位和第四位交换，第二位和第三位交换
        for (int start = 0, end = arr.length-1; start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        //输出加密后的数字
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
