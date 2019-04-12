package com.wwd.object.demo2;

/**
 * @author WangWD.
 * @date 2019/4/2.
 * @time 14:51.
 */
public class Teacher {

    public void test (Student student) {
        student.study();
    }

    public Student getStudent() {
        Student student = new Student();
        return student;
    }

}
