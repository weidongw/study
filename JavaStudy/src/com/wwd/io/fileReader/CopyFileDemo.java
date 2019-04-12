package com.wwd.io.fileReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author WangWD.
 * @date 2019/4/9.
 * @time 15:28.
 *
 * 文件复制
 *
 * 数据源：每次读一个字符
 * 目的地：每次写一个字符
 *
 */
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        //创建输入流对象
        FileReader fileReader = new FileReader("test.txt");
        //创建输出流对象
        FileWriter fileWriter = new FileWriter("copy.txt");

        //读写数据
        /*int ch;
        while ((ch = fileReader.read()) != -1) {
            fileWriter.write(ch);
        }*/

        //读写数据
        int len;
        char[] chars = new char[1024];
        while ((len = fileReader.read(chars)) != -1) {
            fileWriter.write(chars, 0, len);

        }


        //释放资源
        fileWriter.close();
        fileReader.close();
    }
}
