package com.wwd.stringBuilder;

/**
 * @author WangWD.
 * @date 2019/4/8.
 * @time 10:21.
 *
 * StringBuilder和String的相互转换
 *
 * StringBuilder -- String
 *      public String toString():通过
 *
 * String -- StringBuilder
 */
public class StringBuilderTest {
    public static void main(String[] args) {

        //StringBuilder -- String
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("hello").append("world");

        String string = stringBuilder.toString();

        System.out.println(string);

        String s = "HelloWorld!";
        StringBuilder stringBuilder1 = new StringBuilder(s);
        System.out.println(stringBuilder1);


    }
}
