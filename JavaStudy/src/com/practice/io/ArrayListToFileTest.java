package com.practice.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author WangWD.
 * @date 2019/4/10.
 * @time 11:50.
 *
 * 把ArrayList集合中的字符串数据存储到文本文件
 * 每一个字符串元素作为文件中的一行数据
 */
public class ArrayListToFileTest {
    public static void main(String[] args) throws IOException {
        //创建集合对象
        ArrayList<String> arrayList = new ArrayList<>();
        //目标文件
        String destFileName = "arrayList.txt";

        //写数据到集合
        for (int i = 0; i < 10; i++) {
            arrayList.add(i, "hello:" + i);
        }

        //调用方法
        copyFile(arrayList, destFileName);
    }

    /**
     *
     * @param arrayList
     * @param destFileName
     * @throws IOException
     * 返回值类型 void
     */
     public static void copyFile (ArrayList<String> arrayList, String destFileName) throws IOException {
         //创建输出缓冲流对象
         BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destFileName));

         //一次写入一个字符串
         for (int i = 0; i < arrayList.size(); i++) {
             String string = arrayList.get(i);
             bufferedWriter.write(string);
             bufferedWriter.newLine();
             bufferedWriter.flush();
         }

         //释放资源
         bufferedWriter.close();
     }
}
