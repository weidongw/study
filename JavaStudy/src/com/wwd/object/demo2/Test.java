package com.wwd.object.demo2;

/**
 * @author WangWD.
 * @date 2019/4/2.
 * @time 14:51.
 *
 * 类名作为形式参数传递，其实需要的是该类的对象。
 * 类名作为返回值：其实返回的是该类的对象。
 */
public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student = new Student();
        teacher.test(student);

        Student student1 = teacher.getStudent();
        student1.study();
    }


}
