package com.wwd.io.fileWriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author WangWD.
 * @date 2019/4/9.
 * @time 11:20.
 *
 * 输出流写数据步骤：
 *      A:创建输出流对象
 *      B:调用输出流对象的写数据方法，并刷新缓冲区
 *      C:释放资源
 *
 * 相对路径：相对当前项目而言，在项目的根目录下
 * 绝对路径：以盘符开始
 *
 * clost()和flush()方法的区别：
 *      flush()：刷新缓冲区
 *      close()：先刷新缓冲区，然后通知系统释放资源，流对象不可以再被使用了
 */
public class FileWriterDemo2 {
    public static void main(String[] args) throws IOException {
        //创建输出流对象
        FileWriter fileWriter = new FileWriter("b.txt");

        //写入数据,刷新缓冲区
        fileWriter.write("Hello World!");
        fileWriter.flush();

        //释放资源
        fileWriter.close();
    }
}
