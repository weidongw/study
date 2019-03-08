package com.wwd_01;

/*
 * if语句有三种格式。
 * 
 * if语句格式1：
 * 		if(关系表达式) {
 * 			语句体;
 * 		}
 * 
 * 执行流程：
 * 		A:首先计算关系表达式的值,看是true还是false
 * 		B:如果是true,就执行语句体
 * 		C:如果是false,就不执行语句体
 */
public class IfDemo {
	public static void main(String[] args) {
		System.out.println("开始：");
		
		//定义两个变量
		int a = 10;
		int b = 20;
		
		if (a == b) {
			System.out.println("a等于b");
		}
		
		//定义变量
		int c = 10;
		if (a == c) {
			System.out.println("a等于c");
		}
		
		System.out.println("结束！");
	}
}
