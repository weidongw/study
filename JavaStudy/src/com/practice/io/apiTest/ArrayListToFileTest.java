package com.practice.io.apiTest;

import com.practice.arrayList.Student;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * @author WangWD.
 * @date 2019.04.10.
 * @time 17:01.
 *
 * 键盘录入3个学生信息(学号，姓名，年龄，居住地)存入集合。然后遍历集合把每一个学生信息存入文本文档(每一个学生信息为一行数据，自己定义分隔标记)
 */
public class ArrayListToFileTest {

    public static final String destFileName = "test.txt";
    public static void main(String[] args) throws IOException {

        //创建集合对象
        ArrayList<Student> arrayList = new ArrayList<>();
        int stuNumber;

        System.out.println("请输入学生人数：");
        Scanner scanner = new Scanner(System.in);
        stuNumber = scanner.nextInt();

        inputStuInfo(arrayList, stuNumber);
    }

    /**
     * 返回值类型：void
     * @param arrayList
     */
    public static void inputStuInfo(ArrayList<Student> arrayList, int stuNumber) throws IOException {
        //创建键盘录入对象
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= stuNumber; i++) {
            //实例化一个学生对象
            Student student = new Student();
            StringBuilder stuId;

            boolean flag;

            while (true) {
                flag = false;
                System.out.println("请输入第" + i + "个学生的学号：");
                stuId = new StringBuilder(scanner.nextLine());
                for (int j = 0; j < arrayList.size(); j++) {
                    if (stuId.equals(arrayList.get(j).getStuId())) {
                        flag = true;
                        break;
                    }
                }

                if (flag) {
                    System.out.println("不好意思，您输入的学号已存在，请重新输入：");
                } else {
                    break;
                }
            }

            student.setStuId(stuId.toString());
            System.out.println("请输入第" + i + "个学生的姓名：");
            StringBuilder stuName = new StringBuilder(scanner.nextLine());
            student.setStuName(stuName.toString());
            System.out.println("请输入第" + i + "个学生的年龄：");
            StringBuilder stuAge = new StringBuilder(scanner.nextLine());
            student.setStuAge(stuAge.toString());
            System.out.println("请输入第" + i + "个学生的居住地：");
            StringBuilder stuAddress = new StringBuilder(scanner.nextLine());
            student.setStuAddress(stuAddress.toString());

            //添加学生对象到ArrayList
            arrayList.add(student);

            System.out.println("添加学生信息成功！");
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i).getStuId());
        }

        //创建字符缓冲输出流对象
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destFileName));

        //遍历ArrayList，读取数据写入到文件
        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(student.getStuId() + ", " + student.getStuName() + ", " + student.getStuAge() + ", " + student.getStuAddress());


            /*StringBuilder stuId = new StringBuilder(arrayList.get(i).getStuId());
            StringBuilder stuName = new StringBuilder(arrayList.get(i).getStuName());
            StringBuilder stuAge = new StringBuilder(arrayList.get(i).getStuAge());
            StringBuilder stuAddress = new StringBuilder(arrayList.get(i).getStuAddress());
            bufferedWriter.write(stuId + ", " + stuName + ", " + stuAge + ", " + stuAddress);*/

            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        //释放资源
        bufferedWriter.close();
    }
}
