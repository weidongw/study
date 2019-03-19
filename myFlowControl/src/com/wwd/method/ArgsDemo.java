package com.wwd.method;

/**
 * @author WangWD.
 * @date 2019/3/19.
 * @time 19:43.
 *
 * 方法的参数如果是基本数据类型：形参的改变不影响实参。
 *      参数如果是引用数据类型：形参的改变直接影响实参。
 *
 * 形参(形式参数)：
 *      用于接收实际参数的变量
 * 实参(实际参数)：
 *      实际参与运算的变量
 */
public class ArgsDemo {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a:" + a + ",b:" + b);       //1、a 10, b 20
        change(a, b);
        System.out.println("a:" + a + ",b:" + b);       //4、???

        //定义一个数组，并且对其进行静态初始化
        int[] arr = {11, 22, 33, 44, 55};
        //调用数组遍历方法
        printArray(arr);

    }

    public static void change(int a, int b) {

        System.out.println("a:" + a + ",b:" + b);       //2、a 10, b 20
        a = b;
        b = a + b;
        System.out.println("a:" + a + ",b:" + b);       //3、a 20, b 40

    }

    /*
     * 遍历数组
     * 返回值类型：int
     * 参数列表：  int[] arr
     */
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }

}
