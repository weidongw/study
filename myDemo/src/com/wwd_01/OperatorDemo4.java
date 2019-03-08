package com.wwd_01;

/*
 * ++,--:自增自减，用于对变量加1或者减1
 * 
 * ++,--既可以用在变量的后面，也可以用在变量的前面
 * 
 * 单独使用的时候，++或者--放在变量的前面或者后面，结果一样。
 * 参与其他操作的时候：
 * 		++在后，先拿变量做操作，然后变量再++
 * 		++在前，先变量++，然后再拿变量做操作
 */

public class OperatorDemo4 {
	public static void main(String[] args) {
		//定义变量
		int a = 10;
		System.out.println("a:" + a);
		
		//++演示
//		a++;
//		++a;
//		System.out.println("a:" + a);
		
		//参与其他操作
//		int b = a;
//		int b = a++;
		int b = ++a;
		System.out.println("a:" + a);
		System.out.println("b:" + b);
	}
}
