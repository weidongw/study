package com.wwd.stringBuilder;

/**
 * @author WangWD.
 * @date 2019/4/8.
 * @time 10:33.
 *
 * 把数组拼接成一个字符串
 * 举例：
 *      int[] arr = {1, 2, 3};
 *
 * 结果：
 *      [1, 2, 3]
 */
public class StringBuilderTest2 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {1, 2, 3};
        String string = arrayToString(arr).toString();
        System.out.println(string);
    }

    public static StringBuilder arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                sb.append(arr[i] + "]");
            } else {
                sb.append(arr[i] + ", ");
            }
        }
        return sb;
    }
}
