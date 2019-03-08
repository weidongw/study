package com.wwd_04;
/*
 * 逻辑运算符：用于连接关系表达式
 * &,|,^,!
 * &&,||
 * 
 * &：有false则false
 * |：有true则true
 * ^：相同则false，不同则true
 * !：取反
 */
public class OperatorDemo {
	public static void main(String[] args) {
		//定义变量
		int a = 3;
		int b = 4;
		int c = 5;
		
		//&
		System.out.println((a > b) & (a > c));	//false & false
		System.out.println((a < b) & (a > c));	//true & false
		System.out.println((a > b) & (a < c));	//false & true
		System.out.println((a < b) & (a < c));	//true & true
		System.out.println("-------------");
		
		//|
		System.out.println((a > b) | (a > c));	//false | false
		System.out.println((a < b) | (a > c));	//true | false
		System.out.println((a > b) | (a < c));	//false | true
		System.out.println((a < b) | (a < c));	//true | true
		System.out.println("-------------");
		
		//^ 逻辑亦或 相同为0 不同为1
		System.out.println((a > b) ^ (a > c));	//false ^ false
		System.out.println((a < b) ^ (a > c));	//true ^ false
		System.out.println((a > b) ^ (a < c));	//false ^ true
		System.out.println((a < b) ^ (a < c));	//true ^ true
		System.out.println("-------------");
		
		//!
		System.out.println((a > b));	//false
		System.out.println(!(a > b));
		System.out.println(!!(a > b));
	}
}
