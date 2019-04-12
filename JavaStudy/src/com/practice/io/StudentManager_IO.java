package com.practice.io;

import com.practice.arrayList.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * @author WangWD.
 * @date 2019.04.11.
 * @time 13:16.
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
 *
 */
public class StudentManager_IO {
    public static void main(String[] args) throws IOException {

        //定义文件
        String fileName = "student.txt";

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
                    findAllStudent(fileName);
                    break;
                case "2":
                    //2 添加学生
                    addStudent(fileName);
                    break;
                case "3":
                    //3 删除学生
                    deleteStudent(fileName);
                    break;
                case "4":
                    //4 修改学生
                    updateStudent(fileName);
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

    //从文件中读数据到集合
    public static void readData(String fileName, ArrayList<Student> arrayList) throws IOException {

        //创建输入缓冲流对象
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            //分割字符串
            String[] strings = line.split(", ");
            //实例化一个学生对象
            Student student = new Student();

            //给学生对象赋值
            student.setStuId(strings[0]);
            student.setStuName(strings[1]);
            student.setStuAge(strings[2]);
            student.setStuAddress(strings[3]);

            //添加学生对象到集合
            arrayList.add(student);
        }

        bufferedReader.close();
    }

    //把集合中数据写入文件
    public static void writeData(ArrayList<Student> arrayList, String fileName) throws IOException {

        //创建输出缓冲流对象
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            StringBuilder stringBuilder = new StringBuilder();

//            stringBuilder.append(student.getStuId() + ", " + student.getStuName() + ", "
//            + student.getStuAge() + ", " + student.getStuAddress());
            stringBuilder.append(student.getStuId()).append(", ").append(student.getStuName()).append(", ")
                    .append(student.getStuAge()).append(", ").append(student.getStuAddress());

            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        bufferedWriter.close();
    }

    //添加学生信息
    public static void addStudent(String fileName) throws IOException {
        //创建集合对象
        ArrayList<Student> arrayList = new ArrayList<>();
        //从文件中把数据读取到集合
        readData(fileName, arrayList);

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

        //把集合中的数据写入到文件
        writeData(arrayList, fileName);

        //给出提示
        System.out.println("添加学生成功！");

    }

    //删除学生信息
    public static void deleteStudent(String fileName) throws IOException {
        //创建集合对象
        ArrayList<Student> arrayList = new ArrayList<>();
        //从文件中把数据读取到集合
        readData(fileName, arrayList);

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
            //把集合中的数据写入到文件
            writeData(arrayList, fileName);
            System.out.println(stuId + "删除成功");
        }
    }

    //修改学生信息
    public static void updateStudent(String fileName) throws IOException {
        //创建集合对象
        ArrayList<Student> arrayList = new ArrayList<>();
        //从文件中把数据读取到集合
        readData(fileName, arrayList);

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

            //把集合中的数据写入到文件
            writeData(arrayList, fileName);

            System.out.println(stuId + "修改成功！");
        } else {
            System.out.println("不存在该学生，请重新输入：");
        }

    }

    //查询学生信息
    public static void findAllStudent(String fileName) throws IOException {
        //创建集合对象
        ArrayList<Student> arrayList = new ArrayList<>();
        //从文件中把数据读取到集合
        readData(fileName, arrayList);

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
