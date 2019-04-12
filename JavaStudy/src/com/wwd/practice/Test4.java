package com.wwd.practice;

import java.util.Scanner;

/**
 * @author WangWD.
 * @date 2019/3/28.
 * @time 18:04.
 *
 * 需求：
 * (1)键盘录入5个int类型的数据存储数组arr中
 * (2)定义方法将arr数组中的内容反转
 * (3)定义方法对反转后的数组进行遍历
 *
 * 分析：
 * 		A:定义一个长度为5的数组
 * 		B:通过键盘录入数据给数组中的元素赋值
 * 		C:定义方法将arr数组中的内容反转
 * 			什么是反转?如何实现反转
 * 		D:定义方法对反转后的数组进行遍历
 *
 */
public class Test4 {
    public static void main(String[] args) {
        //定义一个长度为5的数组
        int[] arr = new int[5];

        //通过键盘录入数据给数组中的元素赋值
        Scanner sc = new Scanner(System.in);
        for(int x=0; x<arr.length; x++) {
            System.out.println("请输入"+(x+1)+"个元素值：");
            int number = sc.nextInt();
            arr[x] = number;
        }

        //反转前
        printArray(arr);

        //定义方法将arr数组中的内容反转
        reverse(arr);

        //定义方法对反转后的数组进行遍历
        printArray(arr);
    }

    //遍历数组
    public static void printArray(int[] arr) {
        System.out.print("[");
        for(int x=0; x<arr.length; x++) {
            if(x==arr.length-1) {
                System.out.println(arr[x]+"]");
            }else {
                System.out.print(arr[x]+", ");
            }
        }
    }

    /*
     * 两个明确：
     * 		返回值类型：void
     * 		参数列表：int[] arr
     */
    public static void reverse(int[] arr) {
        for(int start=0, end=arr.length-1; start<=end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }

}
