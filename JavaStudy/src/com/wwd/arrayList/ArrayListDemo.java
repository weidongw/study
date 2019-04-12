package com.wwd.arrayList;

import java.util.ArrayList;

/**
 * @author WangWD.
 * @date 2019/4/8.
 * @time 15:15.
 *
 * 为什么会出现集合类：
 *      我们学习的是面向对象编程语言，而面线对象编程语言对事物的描述都是通过对象来体现的。
 *      为了方便对多个对象进行操作，我们就必须对这多个对象进行存储，而要想对多个对象进行存储，
 *      就不能是一个基本变量，而应该是一个容器类型的变量。
 *      目前为止，我们学习过的容器类型的数据有：StringBuilder、数组。
 *      StringBuilder的结果只能是一个字符串类型，不一定满足我们的需求。
 *      所以，我们目前只能选择数组，也就是我们前面学过的对象数组。
 *      但是，数组的长度是固定的，适应不了变化的需求，那么，我们该如何选择呢？
 *      这个时候，Java就提供了集合类供我们使用。
 *
 * 集合类的特点：
 *      长度可变。
 *
 * ArrayList<E>
 *     大小可变数组的实现
 *
 *     <E>:是一种特殊的数据类型，泛型。
 *     如何使用？
 *          在出现E的地方我们使用引用数据类型替换即可
 *          举例：ArrayList<String>, ArrayList<Student>
 *
 * 构造方法：
 *      ArrayList()
 *
 * 添加元素：
 *      public boolean add(E e):添加元素
 *      public void add(int index, E element):在指定的索引处添加一个元素
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> array = new ArrayList<>();

        //add(E e):添加元素
        array.add("java");
        array.add("python");
        array.add("Scala");

        //add(int index, E element):在指定的索引处添加一个元素
        array.add(1, "android");

        System.out.println(array);
    }
}
