package com.wwd.string;

import java.util.Scanner;

/**
 * @author WangWD.
 * @date 2019/4/2.
 * @time 16:24.
 *
 * 模拟登录,给三次机会,并提示还有几次.
 *
 */
public class StringTest {
    public static void main(String[] args) {

        //定义两个字符串对象，用于存储已存在的用户名和密码
        String username = "admin";
        String password = "admin";

        //三次机会，用for
        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String name = scanner.nextLine();
            System.out.println("请输入密码：");
            String pwd = scanner.nextLine();

            if (username.equals(name) && password.equals(pwd)) {
                System.out.println("登录成功！");
                break;
            } else {
                if (2-i != 0) {
                    System.out.println("登录失败！还有" + (2-i) + "次机会。");
                } else {
                    System.out.println("密码已被锁定，请联系管理员重置。");
                }
            }
        }
    }

}
