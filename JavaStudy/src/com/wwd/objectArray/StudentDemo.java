package com.wwd.objectArray;

/**
 * @author WangWD.
 * @date 2019/4/8.
 * @time 13:51.
 *
 * 创建一个学生数组，存储三个学生对象并遍历
 *
 * 分析：
 *      A:定义学生类
 *      B:创建学生数组
 *      C:创建学生数组对象
 *      D:把学生对象作为元素赋值给学生数组
 *      E:遍历学生数组
 *
 */
public class StudentDemo {
    public static void main(String[] args) {
        //创建学生数组
        Student[] students = new Student[3];

        //创建学生对象
        Student student1 = new Student("孙权", 46);
        Student student2 = new Student("曹操", 40);
        Student student3 = new Student("刘备", 38);

        //把学生对象作为元素赋值给学生数组
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        //遍历学生数组
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
//            System.out.println(s);
            System.out.println(s.getName() + "---" + s.getAge());
        }

    }
}
