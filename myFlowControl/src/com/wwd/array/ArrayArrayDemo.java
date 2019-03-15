package com.wwd.array;

/**
 * @author WangWD.
 * @date 2019/3/13.
 * @time 16:24.
 *
 * 二维数组：其实就是元素为一维数组的数组。
 *
 * 定义格式：
 *      A:数组类型[][] 数组名; (推荐的方式)
 *      B:数据类型 数组名[][];
 *      C:数据类型[] 数组名[];
 *
 * 初始化：
 *      A:动态初始化
 *          数据类型[][] 数组名 = new 数据类型[m][n];
 *          m是一维数组的个数
 *          n是一维数组中元素的个数
 *
 *      B:静态初始化
 *          数据类型[][] 数组名 = new 数据类型[][] {{元素···}, {元素···}, {元素···}, ···};
 *          简化格式：
 *          数据类型[][] 数组名 = {{元素···}, {元素···}, {元素···}, ···};
 */
public class ArrayArrayDemo {

    public static void main(String[] args) {
        //数据类型[][] 数组名 = {{元素···}, {元素···}, {元素···}, ···};
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9, 0}};

        System.out.println(arr);    //[[I@4554617c
        System.out.println(arr[0]); //[I@74a14482
        System.out.println(arr[1]); //[I@1540e19d
        System.out.println(arr[2]); //[I@677327b6

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]:" + arr[i].length);
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
