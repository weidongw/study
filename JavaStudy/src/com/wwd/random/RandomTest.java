package com.wwd.random;

import java.util.Random;
import java.util.Scanner;

/*
 * 猜数字小游戏：
 */
public class RandomTest {
	public static void main(String[] args) {
		//获取随机数
		int number = new Random().nextInt(100) + 1;
		
		System.out.println("请开始你的表演：");
		//多次猜数字,直到猜中为止
		while (true) {
			//键盘录入我们要猜的数字
			int guessNumber = new Scanner(System.in).nextInt();
			
			//比较结果
			if (guessNumber > number) {
				System.out.println(":不好意思 " + guessNumber + " 猜大了！");
			} else if (guessNumber < number) {
				System.out.println(":不好意思 " + guessNumber + " 猜小了！");
			} else {
				System.out.println("恭喜你猜中了！");
				break;
			}
			System.out.println("请重新开始你的表演：");
			
		}
	}
}
