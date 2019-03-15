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

        printShuiXianHua();
    }

    /*
     * 打印水仙花数
     */

    public static void printShuiXianHua () {
        for (int i = 100; i < 1000; i++) {
            int a = i % 10;         //个位
            int b = i / 10 % 10;    //十位
            int c = i / 100 % 10;   //百位

            if ( i == a*a*a+b*b*b+c*c*c) {
                System.out.println(i);
            }

        }
    }
}
