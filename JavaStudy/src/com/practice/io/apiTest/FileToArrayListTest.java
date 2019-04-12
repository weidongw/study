package com.practice.io.apiTest;

import com.practice.arrayList.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author WangWD.
 * @date 2019.04.10.
 * @time 19:59.
 *
 * 把文本中的学生信息读取出来存储到集合中，然后遍历集合，在控制台输出
 */
public class FileToArrayListTest {
    public static final String srcFileName = "test.txt";

    public static void main(String[] args) throws IOException {

        //实例化一个集合对象
        ArrayList<Student> arrayList = new ArrayList<Student>();

        readFile(arrayList);
    }

    public static void readFile(ArrayList<Student> arrayList) throws IOException {
        //实例化一个缓冲输入流对象
        BufferedReader bufferedReader = new BufferedReader(new FileReader(srcFileName));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            Student student = new Student();
            //分割字符串
            String[] strings =  line.split(", ");

            student.setStuId(strings[0]);
            student.setStuName(strings[1]);
            student.setStuAge(strings[2]);
            student.setStuAddress(strings[3]);

            arrayList.add(student);
        }

        bufferedReader.close();

        System.out.println("学号\t" + "姓名\t" + "年龄\t" + "居住地");
        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            System.out.println(student.getStuId() + "\t" + student.getStuName() + "\t" + student.getStuAge() + "\t" + student.getStuAddress());
        }

    }
}
