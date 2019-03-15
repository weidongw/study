package com.wwd.array;

/**
 * @author WangWD.
 * @date 2019/3/13.
 * @time 16:11.
 * 获取数组最值（最大和最小）
 */
public class ArrayTest {

    public static void main(String[] args) {
        //定义数组
        int[] arr = {12, 45, 98, 60, 73};

        //定义参照物
        int max = arr[0];

        //遍历数组,获取除了0之外的元素,进行比较
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        //输出max即可
        System.out.println("max:" + max);
    }

}
