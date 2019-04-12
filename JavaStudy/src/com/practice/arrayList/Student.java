package com.practice.arrayList;

/**
 * @author WangWD.
 * @date 2019/4/8.
 * @time 20:35.
 *
 * 标准的学生类
 */
public class Student {

    //学号
    private String stuId;
    //姓名
    private String stuName;
    //年龄
    private String stuAge;
    //居住地
    private String stuAddress;

    public Student() {
    }

    public Student(String stuId, String stuName, String stuAge, String stuAddress) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.stuAddress = stuAddress;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuAge() {
        return stuAge;
    }

    public void setStuAge(String stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuAddress() {
        return stuAddress;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress;
    }
}
