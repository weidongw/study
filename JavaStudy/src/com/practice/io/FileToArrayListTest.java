package com.practice.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author WangWD.
 * @date 2019/4/10.
 * @time 12:04.
 *
 * 从文本文件中读取数据到ArrayList集合
 *
 */
public class FileToArrayListTest {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        String srcFileName = "arrayList.txt";

        readFile(srcFileName, arrayList);

    }

    /**
     *
     * @param srcFileName
     * @param arrayList
     * @throws IOException
     */
    public static void readFile (String srcFileName, ArrayList<String> arrayList) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(srcFileName));
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            arrayList.add(line);
        }

        bufferedReader.close();

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
