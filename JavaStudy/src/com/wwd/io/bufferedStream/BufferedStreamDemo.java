package com.wwd.io.bufferedStream;

import java.io.*;

/**
 * @author WangWD.
 * @date 2019/4/9.
 * @time 19:01.
 *
 * BufferedWriter:将文本写入字符输出流，缓冲各个字符，从而提供单个字符、数组和字符串的高效写入
 * BufferedReader:从字符输入流中读取文本，缓冲各个字符，从而实现字符、数组和行的高效读取
 *
 */
public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {
        //创建输出缓冲流对象
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("bw.txt"));

        bufferedWriter.write("hello");
        bufferedWriter.flush();
        bufferedWriter.close();

        //创建输入缓冲流对象
        BufferedReader bufferedReader = new BufferedReader(new FileReader("bw.txt"));
        int ch;
        while ((ch = bufferedReader.read()) != -1) {
            System.out.print((char)ch);
        }

        char[] chars = new char[1024];
        int len;
        while ((len = bufferedReader.read(chars)) != -1) {
            System.out.print(new String(chars, 0, len));
        }

        //释放资源
        bufferedReader.close();
    }
}
