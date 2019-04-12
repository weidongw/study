package com.wwd.io.bufferedStream;

import java.io.*;

/**
 * @author WangWD.
 * @date 2019/4/10.
 * @time 11:08.
 *
 * 文件复制
 *
 * 数据源：
 *      读数据 -- FileReader -- 高效的读数据 -- BufferedReader
 * 目的地：
 *      写数据 -- FileWriter -- 高效的写数据 -- BufferedWriter
 *
 */
public class CopyFileDemo2 {
    public static void main(String[] args) throws IOException {
        //创建缓冲输入流对象
        BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));

        //创建缓冲输出流对象
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("bw3.txt"));

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        //释放资源
        bufferedWriter.close();
        bufferedReader.close();
    }
}
