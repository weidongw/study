package com.wwd.base;

/*
 * 在控制台输出所有的"水仙花数"
 * 
 * 水仙花数?
 * 		所谓的水仙花数是指一个三位数，其各位数字的立方和等于该数本身
 * 		举例：153就是一个水仙花数
 * 		153 = 1*1*1 + 5*5*5 + 3*3*3
 * 
 * 分析：
 * 		A:首先水仙花数是一个三位数,也就是100~999
 * 		B:获取一个三位数的个位、十位、百位
 * 			举例：153
 * 			个位：153%10
 * 			十位：153/10%10
 * 			百位：153/10/10%10
 * 			...
 * 
 * 统计"水仙花数"共有多少个?
 * 分析：
 * 		定义统计变量,初始化为0
 * 
 * break：结束整个循环
 * continue：结束本次循环,继续下一层循环
 */
public class ForTest4 {
	public static void main(String[] args) {
		
		int count = 0;

		System.out.println("水仙花数：");
		for (int i = 100; i < 1000; i++) {
			//百位
			int a = i/10/10%10;
			//十位
			int b = i/10%10;
			//个位
			int c = i%10;
			
			if (i == a*a*a + b*b*b + c*c*c) {
				System.out.println(i);
				count++;
			}
			
		}
		
		System.out.println(count);
	}
}
