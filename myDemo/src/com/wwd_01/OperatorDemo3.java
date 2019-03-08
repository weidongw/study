package com.wwd_01;

/**
 * 
 * @author WangWD
 * 
 * +:
 * 		做加法运算
 * 
 * 字符参与加法运算，其实是拿字符在计算机中存储的数据值来参与运算的
 * 		'A' 65
 * 		'a' 97
 * 		'0' 48
 * 
 * 字符串参与加法运算，其实做的不是加法运算，而是字符串的拼接
 *
 */

public class OperatorDemo3 {
	public static void main(String[] args) {
		//定义变量
		int a = 10;
		int b = 20;
		
		System.out.println(a + b);
		System.out.println("---------------------");
		
		//字符参与加法运算
		char c = 'A';
		System.out.println(a + c);
		System.out.println("---------------------");
		
		//字符串参与加法运算 从左到右依次进行
		System.out.println("hello" + a);
		System.out.println("hello" + a + b);
		System.out.println(a + b + "hello");
	}

}