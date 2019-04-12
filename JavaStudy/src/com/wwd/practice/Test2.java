package com.wwd.practice;

/**
 * @author WangWD.
 * @date 2019/3/28.
 * @time 16:07.
 *
 * 需求：打印五位数中的回文数。
 *      什么是回文数？举例：12321是回文数。
 * 分析：
 *      A:5位数，范围已知，用for循环实现
 *      B:获取一个数的个、十、千、万
 *              如何获取？
 *              个位：x%10
 *              十位：x/10%10
 *              千位：x/10/10/10%10
 *              万位：x/10/10/10/10%10
 *      C:根据条件进行判断，把满足条件的数据输出
 *
 * 需求2：
 *      有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第3个月后每个月又生一对兔子，
 *      假如兔子都不死，问第二十个月的兔子是多少对？
 *
 * 规律：
 *      第一个月：1
 *      第二个月：1
 *      第三个月：2
 *      第四个月：3
 *      第五个月：5
 *      第六个月：8
 *      ······
 *
 *      第三个月开始，每个月的兔子对数是前两个月的兔子对数之和
 *      第一个月和第二个月的兔子对数都是1
 *
 * 分析：
 *      A:由于数据比较多，用数组实现
 *              int[] arr = new int[20];
 *      B:给数组元素赋值
 *              arr[0] = 1;
 *              arr[1] = 1;
 *      C:找规律
 *              arr[2] = arr[1] + arr[0];
 *              ······
 *
 */
public class Test2 {
    public static void main(String[] args) {
        //for循环遍历所有五位数
        /*for (int i = 10000; i < 100000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int qian = i / 1000 % 10;
            int wan = i / 10000 % 10;
            if ((ge == wan) && (shi == qian)) {
                System.out.println(i);
            }
        }*/

        shengTuZi();
    }

    //需求2
    public static void shengTuZi() {
        //定义数组
        int[] arr = new int[20];

        //初始化前两个月的值
        arr[0]=1;
        arr[1]=1;

        //找规律赋值
        for (int i = 2; i < arr.length; i++) {

            arr[i] = arr[i-1] + arr[i-2];

        }

        //输出结果
        System.out.println(arr[arr.length-1]);
    }
}
