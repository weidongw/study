package com.wwd.io.bufferedStream;

import java.io.*;

/**
 * @author WangWD.
 * @date 2019/4/10.
 * @time 10:47.
 *
 * 缓冲流的特殊功能：
 * BufferedWriter
 *      void newLine():写一个换行符，这个换行符由系统决定
 *
 * BufferedReader
 *      String readLine():一次读取一行数据，但是不读取换行符
 */
public class BufferedStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //创建输出缓冲流对象
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("bw2.txt"));
        for (int i = 0; i < 10; i++) {
            bufferedWriter.write("hello" + i);
//            bufferedWriter.write("\r\n");
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        bufferedWriter.close();

        //创建输入缓冲流对象
        BufferedReader bufferedReader = new BufferedReader(new FileReader("bw.txt"));
//        String string = bufferedReader.readLine();
        /*System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());*/

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
