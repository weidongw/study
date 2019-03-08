package com.wwd;

import java.util.Random;

/*
 * Random:用于产生随机数
 * 
 * 使用步骤：
 * 		A:导包
 * 			import java.util.Random;
 * 		B:创建对象
 * 			Random r = new Random();
 * 		C:获取随机数
 * 			int number = r.nextInt(10);
 * 			获取数据的范围:[0,10) 包括0,不包括10
 */
public class RandomDemo {
	public static void main(String[] args) {
		//创建对象
		Random random = new Random();
		
		for (int i = 0; i < 10; i++) {
			//获取随机数
			int number = random.nextInt(10);
			System.out.println("number：" + number);
		}
		
		//如何获取1-100之间的随机数呢?
		//int i = r.nextInt(100);	//[0,99]
		int i = random.nextInt(100) + 1;
		System.out.println("i:" + i);
		
	}
}
