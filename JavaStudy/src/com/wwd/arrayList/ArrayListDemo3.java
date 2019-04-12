package com.wwd.arrayList;

import java.util.ArrayList;

/**
 * @author WangWD.
 * @date 2019/4/8.
 * @time 15:57.
 *
 * ArrayList集合遍历
 *
 */
public class ArrayListDemo3 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> arrayList = new ArrayList<>();

        //添加元素
        arrayList.add("java");
        arrayList.add("c++");
        arrayList.add("python");

        //集合遍历
        for (int i = 0; i < arrayList.size(); i++) {
            String string = arrayList.get(i);
            System.out.println(string);
        }
    }
}
