package com.wwd.io.fileReader;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author WangWD.
 * @date 2019/4/9.
 * @time 15:44.
 *
 */
public class FileReaderDemo2 {
    public static void main(String[] args) throws IOException {

        //创建输入流对象
        FileReader fileReader = new FileReader("test.txt");

        /*//调用输入流对象的读数据方法
        //int read(char[] cbuf):一次读一个字符数组
        char[] chs = new char[5];

        //第一次读数据
        int len = fileReader.read(chs);
        System.out.println("len:" + len);
        System.out.println(new String(chs, 0, len));

        len = fileReader.read(chs);
        System.out.println("len:" + len);
        System.out.println(new String(chs, 0, len));

        len = fileReader.read(chs);
        System.out.println("len:" + len);
        System.out.println(new String(chs, 0, len));

        len = fileReader.read(chs);
        System.out.println("len:" + len);
        System.out.println(new String(chs, 0, len));

        //代码相似度过高，改进，但是不知道什么时候结束循环
        len = fileReader.read(chs);
        System.out.println("len:" + len);
        len = fileReader.read(chs);
        System.out.println("len:" + len);
        //通过测试，我们发现，实际长度是-1的时候，说明就没有数据了*/

//        char[] chars = new char[5];
        char[] chars = new char[1024];  //这里可以是1024及其整数倍
        int len;
        while ((len = fileReader.read(chars)) != -1) {
            System.out.print(new String(chars, 0, len));
        }

        //释放资源
        fileReader.close();

    }
}
