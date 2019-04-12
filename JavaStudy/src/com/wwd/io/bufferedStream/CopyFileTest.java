package com.wwd.io.bufferedStream;

import java.io.*;

/**
 * @author WangWD.
 * @date 2019/4/10.
 * @time 11:19.
 *
 * 复制文本文件的5种方式：
 *      1:FileReader/FileWriter char c != -1
 *      2:FileReader/FileWriter char[] chars != -1
 *      3:BufferedReader/BufferedWriter char c != -1
 *      4:BufferedReader/BufferedWriter char[] chars != -1
 *      5:BufferedReader/BufferedWriter readLine() String line; newLine()
 */
public class CopyFileTest {
    public static void main(String[] args) throws IOException {
        //源文件
        String srcFileName = "test.txt";
        //目标文件
        String destFileName = "write.txt";

        method5(srcFileName, destFileName);
    }

    /*
     * 返回值类型：void
     * 参数列表：String srcFileName, String destFileName
     * 一次读取一个字符
     * 基本流：FileReader/FileWiter
     */
    public static void method1(String srcFileName, String destFileName) throws IOException {
        //创建输入流对象
        FileReader fileReader = new FileReader(srcFileName);
        //创建输出流对象
        FileWriter fileWriter = new FileWriter(destFileName);

        int ch;
        while ((ch = fileReader.read()) != -1) {
            fileWriter.write(ch);
            fileWriter.flush();
        }

        //释放资源
        fileWriter.close();
        fileReader.close();
    }

    /*
     * 返回值类型：void
     * 参数列表：String srcFileName, String destFileName
     * 一次读取一个字符数组
     * 基本流：FileReader/FileWriter
     */
    public static void method2(String srcFileName, String destFileName) throws IOException {
        //创建输入流对象
        FileReader fileReader = new FileReader(srcFileName);
        FileWriter fileWriter = new FileWriter(destFileName);

        char[] chars = new char[1024];
        int len;
        while ((len = fileReader.read(chars)) != -1) {
            fileWriter.write(chars, 0, len);
            fileWriter.flush();
        }

        //释放资源
        fileWriter.close();
        fileReader.close();
    }

    /*
     * 返回值类型：void
     * 参数列表：String srcFileName, String destFileName
     * 一次读取一个字符
     * 缓冲流：BufferedReader/BufferedWriter
     */
    public static void method3(String srcFileName, String destFileName) throws IOException {
        //创建输入缓冲流对象
        BufferedReader bufferedReader = new BufferedReader(new FileReader(srcFileName));
        //创建输出缓冲流对象
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destFileName));

        int ch;
        while ((ch = bufferedReader.read()) != -1) {
            bufferedWriter.write(ch);
            bufferedWriter.flush();
        }

        //释放资源
        bufferedWriter.close();
        bufferedReader.close();
    }

    /*
     * 返回值类型：void
     * 参数列表：String srcFileName, String destFileName
     * 一次读取一个字符数组
     * 缓冲流：BufferedReader/BufferedWriter
     */
    public static void method4(String srcFileName, String destFileName) throws IOException {
        //创建输入缓冲流对象
        BufferedReader bufferedReader = new BufferedReader(new FileReader(srcFileName));
        //创建输出缓冲流对象
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destFileName));

        char[] chars = new char[1024];
        int len;
        while ((len = bufferedReader.read(chars)) != -1) {
            bufferedWriter.write(chars, 0, len);
            bufferedWriter.flush();
        }

        //释放对象
        bufferedWriter.close();
        bufferedReader.close();
    }

    /*
     * 返回值类型：void
     * 参数列表：String srcFileName, String destFileName
     * 一次读取一个字符串
     * 缓冲流：BufferedReader/BufferedWriter
     */
    public static void method5(String srcFileName, String destFileName) throws IOException {
        //创建输入缓冲流对象
        BufferedReader bufferedReader = new BufferedReader(new FileReader(srcFileName));
        //创建输出缓冲流对象
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destFileName));

        //一次读取一个字符串
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