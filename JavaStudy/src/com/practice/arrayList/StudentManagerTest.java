package com.practice.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author WangWD.
 * @date 2019/4/8.
 * @time 20:37.
 *
 * 学生管理系统主类
 *
 * 分析：
 *      A:定义学生类
 *      B:学生管理系统系统主界面代码编写
 *      C:学生管理系统查看所有学生代码编写
 *      D:学生管理系统添加学生代码编写
 *      E:学生管理系统删除学生代码编写
 *      F:学生管理系统修改学生代码编写
 */
public class StudentManagerTest {
    public static void main(String[] args) {

        //创建ArrayList对象来存储学生
        ArrayList<Student> arrayList = new ArrayList<>();

        //为了让程序能够回到这里来，采用循环
        while (true) {
            //这是学生管理系统的主界面
            System.out.println("----------欢迎来到学生管理系统----------");
            System.out.println("1 查看所有学生");
            System.out.println("2 添加学生");
            System.out.println("3 删除学生");
            System.out.println("4 修改学生");
            System.out.println("5 退出");
            System.out.println("请输入菜单序号：");
            //创建输入对象
            Scanner scanner = new Scanner(System.in);
            String choiceString = scanner.nextLine();
            //用switch语句来实现选择
            switch (choiceString) {
                case "1":
                    //1 查看所有学生
                    findAllStudent(arrayList);
                    break;
                case "2":
                    //2 添加学生
                    addStudent(arrayList);
                    break;
                case "3":
                    //3 删除学生
                    deleteStudent(arrayList);
                    break;
                case "4":
                    //4 修改学生
                    updateStudent(arrayList);
                    break;
                case "5":
                    //5 退出
                    System.exit(0); //JVM退出
                default:
                    System.out.println("您输入的序号有误，请重新输入：");
                    System.out.println("谢谢您的使用！");
                    break;
            }
        }

    }

    //添加学生信息
    public static void addStudent(ArrayList<Student> arrayList) {
        //创建键盘录入对象
        Scanner scanner = new Scanner(System.in);

        //为了能让id被访问到，需要定义在循环的外面
        String stuId;
        //为了程序能够回到这里，用循环来实现
        while (true) {
            System.out.println("请输入学号：");
            stuId = scanner.nextLine();

            //判断学号有没有被占用，定义标记
            boolean flag = false;
            //遍历集合，得到每一个学生
            for (int i = 0; i < arrayList.size(); i++) {
                Student student = arrayList.get(i);
                //将获得的学生ID和键盘录入进行比较
                if (student.getStuId().equals(stuId)) {
                    flag = true;    //说明学号已经被占用
                    break;
                }
            }
            if (flag) {
                System.out.println("您输入的学号已经被占用，请重新输入：");
            } else {
                break;
            }
        }

        System.out.println("请输入姓名：");
        String stuName = scanner.nextLine();
        System.out.println("请输入年龄：");
        String stuAge = scanner.nextLine();
        System.out.println("请输入居住地：");
        String stuAddress = scanner.nextLine();

        //创建学生对象
        Student student = new Student();
        student.setStuId(stuId);
        student.setStuName(stuName);
        student.setStuAge(stuAge);
        student.setStuAddress(stuAddress);

        //把学生对象作为元素添加到集合
        arrayList.add(student);

        //给出提示
        System.out.println("添加学生成功！");

    }

    //删除学生信息
    public static void deleteStudent(ArrayList<Student> arrayList) {
        //判断集合中是否有数据，如果没有，给出提示，并让该方法不再往下执行
        if (arrayList.size() == 0) {
            System.out.println("不好意思，目前没有学生信息可供删除，请重新选择操作：");
            return;
        }
        //思路：键盘录入一个学号，遍历集合，查找是否有该学生信息，如果有就删除
        //创建键盘录入对象
        Scanner scanner = new Scanner(System.in);

        /*boolean flag = false;
        System.out.println("请输入要删除的学生学号：");
        String stuId = scanner.nextLine();
        //遍历集合，查找要删除的学生学号
        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            //判断是否存在该学号
            if (student.getStuId().equals(stuId)) {
                arrayList.remove(i);
                break;
            } else {
                flag = true;    //没有该学生
            }
        }
        if (flag) {
            System.out.println("未找到该学生信息，请重新输入：");
        } else {
            System.out.println(stuId + "删除成功");
        }*/

        System.out.println("请输入要删除的学生学号：");
        String stuId = scanner.nextLine();
        int index = -1;
        //遍历集合，查找要删除的学生学号
        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            //判断是否存在该学号
            if (student.getStuId().equals(stuId)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("不存在该学生，请重新输入：");
        } else {
            arrayList.remove(index);
            System.out.println(stuId + "删除成功");
        }
    }

    //修改学生信息
    public static void updateStudent(ArrayList<Student> arrayList) {
        //创建键盘录入对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学号：");
        String stuId = scanner.nextLine();

        int index = -1;

        //遍历集合
        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            if (student.getStuId().equals(stuId)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
//            Student student = arrayList.get(index);
            Student student = new Student();
            System.out.println("请输入姓名：");
            String stuName = scanner.nextLine();
            System.out.println("请输入年龄：");
            String stuAge = scanner.nextLine();
            System.out.println("请输入居住地：");
            String stuAddress = scanner.nextLine();

            student.setStuId(stuId);
            student.setStuName(stuName);
            student.setStuAge(stuAge);
            student.setStuAddress(stuAddress);

            arrayList.set(index, student);
            System.out.println(stuId + "修改成功！");
        } else {
            System.out.println("不存在该学生，请重新输入：");
        }

    }


    //查询学生信息
    public static void findAllStudent(ArrayList<Student> arrayList) {
        //判断集合中是否有数据，如果没有，给出提示，并让该方法不再往下执行
        if (arrayList.size() == 0) {
            System.out.println("不好意思，目前没有学生信息可供查询，请重新选择操作：");
            return;
        }

        // \t 其实就是一个tab键的位置
        System.out.println("学号\t\t姓名\t\t年龄\t\t居住地\t\t");
        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            System.out.println(student.getStuId() + "\t\t" + student.getStuName() + "\t" + student.getStuAge()
                    + "\t\t" + student.getStuAddress());
        }
    }
}
