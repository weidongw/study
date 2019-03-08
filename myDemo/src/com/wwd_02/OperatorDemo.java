package com.wwd_02;
/*
 * 赋值运算符：
 * 		基本的赋值运算符：=
 * 		扩展的赋值运算符：+=,-=,*=,/=,...
 */
public class OperatorDemo {
	public static void main(String[] args) {
		//定义变量
		int a = 10;	//把10赋值给int类型的变量a
		
		//+=的操作,拿 += 的左边和右边的数据做 + ，然后把结果赋值给左边
		a += 20;
		System.out.println("a:" + a);
		
		//注意：扩展的赋值运算符，隐含了强制类型转换
		//有一个变量a,a+=10
		//相当于：a=(a的数据类型)(a + 10)
		short s = 1;
		s += 1;
		System.out.println("s:" + s);
		
	}
}
