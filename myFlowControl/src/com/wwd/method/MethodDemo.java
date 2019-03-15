package com.wwd.method;

/**
 * @author WangWD.
 * @date 2019/3/13.
 * @time 17:19.
 *
 * 方法：完成特定功能的代码块
 *
 * 定义格式：
 *      修饰符 返回类型 方法名(参数类型1 参数名1, 参数类型2 参数名2, ···) {
 *          方法体;
 *          return 返回值;
 *      }
 *
 * 格式解释：
 *      A:修饰符        目前记住 public static
 *      B:返回类型      用于限定返回值的类型
 *      C:方法名        为了方便我们调用方法
 *      D:参数类型      用于限定调用方法时传入数据的类型
 *      E:参数名        用于接收调用方法时传入的数据的变量
 *      F:方法体        完成功能的代码
 *      G:return       结束方法，并且将返回值带给调用者
 *
 * 写一个方法要有两个明确
 *      A:返回值类型
 *      B:参数列表
 */
public class MethodDemo {

    public static void main(String[] args) {
        System.out.println("This is a method！");

        //输出调用，不建议
//        System.out.println(sum(3, 5));

        //赋值调用
        int result = sum(20, 50);
        //可以对result进一步操作
        System.out.println(result);

        printHelloWorld();
    }

    /*
     * 返回值类型：int
     * 参数列表：int a, int b
     *
     */
    public static int sum (int a, int b) {
        return a + b;
    }

    public static void printHelloWorld() {

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!");
        }
    }
}
