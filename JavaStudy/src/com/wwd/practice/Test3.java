package com.wwd.practice;

import java.util.Scanner;

/**
 * @author WangWD.
 * @date 2019/3/28.
 * @time 17:50.
 *
 * 需求：在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
 * 选手的最后得分为：去掉一个最高分和一个最低分后 的4个评委平均值。
 * 请写代码实现。(不考虑小数部分)
 *
 * 分析：
 * 		A:定义一个长度为6的数组
 * 		B:键盘录入评委的分数
 * 		C:写方法实现获取最高分,最低分
 * 		D:写方法求评委的分数和
 * 		E:平均分：(和-最高分-最低分)/(arr.length-2)
 * 		F:输出平均分即可
 */

public class Test3 {
    public static void main(String[] args) {
        //定义一个长度为6的数组
        int[] arr = new int[6];

        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        //键盘录入评委的分数
        for(int x=0; x<arr.length; x++) {
            //接收数据
            System.out.println("请输入第"+(x+1)+"个评委给出的分数(0-100)：");
            int score = sc.nextInt();
            arr[x] = score;
        }

        //写方法实现获取最高分,最低分
        //调用方法
        int max = getMax(arr);
        int min = getMin(arr);

        //写方法求评委的分数和
        int sum = sum(arr);

        //平均分：(和-最高分-最低分)/(arr.length-2)
        int avg = (sum-max-min)/(arr.length-2);

        //输出平均分即可
        System.out.println("该选手的最终得分是："+avg);
    }

    /*
     * 两个明确：
     * 		返回值类型：int
     * 		参数列表：int[] arr
     */
    public static int sum(int[] arr) {
        //定义求和变量
        int sum = 0;

        for(int x=0; x<arr.length; x++) {
            sum += arr[x];
        }

        return sum;
    }

    /*
     * 两个明确：
     * 		返回值类型：int
     * 		参数列表：int[] arr
     */
    public static int getMin(int[] arr) {
        //定义参照物
        int min = arr[0];

        for(int x=1; x<arr.length; x++) {
            if(arr[x] < min) {
                min = arr[x];
            }
        }

        return min;
    }

    /*
     * 两个明确：
     * 		返回值类型：int
     * 		参数列表：int[] arr
     */
    public static int getMax(int[] arr) {
        //定义参照物
        int max = arr[0];

        for(int x=1; x<arr.length; x++) {
            if(arr[x] > max) {
                max = arr[x];
            }
        }

        return max;
    }
}
