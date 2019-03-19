package com.wwd.method;

/**
 * @author WangWD.
 * @date 2019/3/14.
 * @time 11:15.
 *
 * 写一个方法打印水仙花数
 */
public class MethodTest {

    public static void main(String[] args) {

        //定义一个数组，并且对其进行静态初始化
        int[] arr = {11, 22, 33, 44, 55};
        //调用数组遍历方法
        int result = getMax(arr);
        System.out.println("result:" + result);

        //调用打印水仙花数的方法
        printShuiXianHua();
    }

    /*
     * 打印水仙花数
     * 返回值类型：无
     * 参数列表：无
     */

    public static void printShuiXianHua () {
        System.out.println("水仙花数：");
        for (int i = 100; i < 1000; i++) {
            int a = i % 10;         //个位
            int b = i / 10 % 10;    //十位
            int c = i / 100 % 10;   //百位

            if ( i == a*a*a+b*b*b+c*c*c) {
                System.out.print(i + " ");
            }

        }
    }

    /*
     * 获取数组最大值
     * 返回值类型：int
     * 参数列表：  int[] arr
     */

    public static int getMax(int[] arr) {
        //定义参照物
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
