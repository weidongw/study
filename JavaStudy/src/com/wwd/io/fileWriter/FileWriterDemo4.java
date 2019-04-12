package com.wwd.io.fileWriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author WangWD.
 * @date 2019/4/9.
 * @time 11:42.
 *
 * 如何实现数据的换行？
 *      \n可以实现换行，但是Windows系统自带的记事本打开并没有换行，why？因为Windows识别的不是 \n，而是 \r\n
 *      windows:\r\n
 *      linux:\n
 *      mac:\r
 *
 * 如何实现数据的追加写入？
 *      FileWriter(String fileName, boolean append)
 *
 */
public class FileWriterDemo4 {
    public static void main(String[] args) throws IOException {
        //创建输出流对象
//        FileWriter fileWriter = new FileWriter("test.txt");
        FileWriter fileWriter = new FileWriter("test.txt", true);   //表示追加写入，默认是false

        for (int i = 0; i < 10; i++) {
            fileWriter.write("hello:" + i);
            fileWriter.write("\n");
        }

        //释放资源
        fileWriter.close();
    }
}
