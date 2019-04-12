package com.wwd.object.demo1;

/**
 * @author WangWD.
 * @date 2019/4/2.
 * @time 14:45.
 *
 * 学生类的测试类
 */
public class StudentDemo {
    public static void main(String[] args) {
        //无参 + setXxx()
        Student student = new Student();
        student.setAge(23);
        student.setName("王伟东");
        System.out.println(student.getName() + "----------" + student.getAge());

        //带参构造
        Student student1 = new Student("杨梦园", 25);
        System.out.println(student1.getName() + "----------" + student1.getAge());
    }
}
