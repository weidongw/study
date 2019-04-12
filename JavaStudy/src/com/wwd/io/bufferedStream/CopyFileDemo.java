package com.wwd.io.bufferedStream;

import java.io.*;

/**
 * @author WangWD.
 * @date 2019/4/10.
 * @time 9:17.
 *
 * 文件复制
 *
 * 数据源：
 *      读数据 -- FileReader -- 高效的读数据 -- BufferedReader
 * 目的地：
 *      写数据 -- FileWriter -- 高效的写数据 -- BufferedWriter
 *
 */
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        //创建缓冲输入流对象
        BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));
        //创建缓冲输出流对象
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("buffer.txt"));

        //一次读一个字符写入
        int ch;
        while ((ch = bufferedReader.read()) != -1) {
            bufferedWriter.write(ch);
        }

        //一次读取一个字符数组
        char[] chars = new char[1024];
        int len;
        while ((len = bufferedReader.read(chars)) != -1) {
            bufferedWriter.write(chars, 0, len);
        }

        //释放资源
        bufferedWriter.close();
        bufferedReader.close();
    }
}
