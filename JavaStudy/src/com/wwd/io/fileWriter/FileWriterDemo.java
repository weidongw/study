package com.wwd.io.fileWriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author WangWD.
 * @date 2019/4/9.
 * @time 10:52.
 *
 * 需求：向文件中写数据
 *      写数据--输出流--FileWriter
 *
 * FileWriter:
 *      FileWriter(String fileName):传递一个文件名称
 *
 * 输出流写数据的步骤：
 *      A:创建输出流对象
 *      B:调用输出流对象的写数据的方法
 *      C:释放资源
 */
public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        //创建输出流对象
        FileWriter fileWriter = new FileWriter("a.txt");

        /*
         * 创建输出流对象做了哪些事情
         *      A:调用系统资源创建了一个文件
         *      B:创建输出流对象
         *      C:把输出流对象指向文件
         */

        //调用输出流对象的写数据的方法
        fileWriter.write("IO流，你好！");
        //数据没有直接写入文件，而是写到了内存缓冲区
        fileWriter.flush();

        //释放资源
        //通知系统释放和该文件相关的资源
        fileWriter.close();

        //while (true) {}
    }
}
