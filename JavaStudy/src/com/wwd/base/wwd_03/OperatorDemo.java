package com.wwd.base.wwd_03;
/*
 * 关系运算符：
 * 		==,!=,>,>=,<,<=
 * 		关系运算符的结果是Boolean类型
 * 
 * 注意事项：
 * 		千万不要把 == 写成 =
 */

public class OperatorDemo {
	public static void main(String[] args) {
		//定义变量
		int a = 10;
		int b = 20;
		int c = 10;
		
		//==
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println("-------------");
		
		//注意事项：
		System.out.println(a == b);
		System.out.println(a = b);	//把b的值赋值给a,然后把a的值输出
		
	}
}
