package com.wwd.arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author WangWD.
 * @date 2019/4/8.
 * @time 16:53.
 *
 * 存储自定义对象并遍历
 *
 * 分析：
 *      A:定义学生类
 *      B:创建集合对象
 *      C:创建学生对象
 *      D:把学生对象作为元素添加到集合中
 *      E:遍历集合
 *
 */
public class ArrayListTest2 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> arrayList = new ArrayList<Student>();

        /*//创建学生对象
        Student student1 = new Student("鞠婧祎", 25);
        Student student2 = new Student("华晨宇", 25);
        Student student3 = new Student("佟丽娅", 25);
        Student student4 = new Student("陈伟霆", 25);
        Student student5 = new Student("欧阳娜娜", 22);

        //把学生对象添加到集合中
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        arrayList.add(student5);*/

        addStudent(arrayList);
        addStudent(arrayList);
        addStudent(arrayList);

        //遍历集合
        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            System.out.println(student.getName() + "---" + student.getAge());
        }
    }

    /*
     * 两个明确：
     *      返回值类型：void
     *      参数列表：ArrayList<Student> array
     */
    public static void addStudent(ArrayList<Student> arrayList) {
        //键盘录入数据，创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = scanner.nextLine();
        arrayList.add(new Student(name, 23));
    }
}
