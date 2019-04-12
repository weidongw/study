package com.wwd.scanner;

import java.util.Scanner;

/*
 * 键盘录入两个数据，并对这两个数据求和，输出其结果
 * 
 */
public class ScannerTest {
	public static void main(String[] args) {
		
		//创建键盘输入对象
		Scanner scanner = new Scanner(System.in);
		
		//接收数据
		System.out.println("请输入第一个数据:");
		int a = scanner.nextInt();
		
		//接收数据
		System.out.println("请输入第一个数据:");
		int b = scanner.nextInt();
		
		//对数据求和
		int sum = a + b;
		//输出结果
		System.out.println("sum:" + sum);
		
//		boolean flag = (a == b) ? true : false;
		boolean flag = (a == b);
		System.out.println("res:" + flag);
	}
}