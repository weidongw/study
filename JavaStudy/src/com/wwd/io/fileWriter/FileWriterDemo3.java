package com.wwd.io.fileWriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author WangWD.
 * @date 2019/4/9.
 * @time 11:29.
 *
 * void write(String str):写一个字符串数据
 * void write(String str, int index, int len):写一个字符串中的部分数据
 * void write(int ch):写一个字符数据,这里写int类型的好处是既可以写char类型的数据，也可以写char对应的int类型的值。'a', 97
 * void write(char[] chs):写一个字符数组的数据
 * void write(char[] chs, int index, int len):写一个字符数组中的部分数据
 */
public class FileWriterDemo3 {
    public static void main(String[] args) throws IOException {
        //创建输出流对象
        FileWriter fileWriter = new FileWriter("test.txt");

        //void write(String str):写一个字符串数据
//        fileWriter.write("abcde");

        //void write(String str, int index, int len):写一个字符串中的部分数据
//        fileWriter.write("abcde", 2, 2);

        //void write(int ch):写一个字符数据,这里写int类型的好处是既可以写char类型的数据，也可以写char对应的int类型的值。'a', 97
//        fileWriter.write(99);
//        fileWriter.write('a');

        //void write(char[] chs):写一个字符数组的数据
        char[] chs = {'a', 'b', 'c'};
//        fileWriter.write(chs);
        //void write(char[] chs, int index, int len):写一个字符数组中的部分数据
        fileWriter.write(chs, 0, 2);

        //释放资源
        fileWriter.close();
    }
}
