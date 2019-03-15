package com.wwd.array;
/*
 * 数组：存储同一种数据类型的多个元素的容器
 * 
 * 定义：
 * 		A:数据类型[] 数组名; (推荐)
 * 		B:数据类型 数组名[];
 * 
 * 数组初始化：
 * 		A:所谓的初始化,就是为数组开辟内存空间,并为数组中的每个元素赋予初始值
 * 		B:两种方式可以实现数组初始化
 * 			a:动态初始化	只给出长度,由系统给出初始化值
 * 			b:静态初始化	给出初始化值,由系统给出长度
 * 
 * 动态初始化：
 * 		数据类型[] 数组名 = new 数据类型[数组长度];
 * 静态初始化：
 * 		数据类型[] 数组名 = new 数据类型[]{元素1, 元素2, 元素3, ···};
 *
 * 		举例：
 * 			int[] arr = new int[]{1, 2, 3};
 * 		简写：
 * 			int[] arr = {1, 2, 3};
 *
 *
 * 两个常见小问题：
 * 		ArrayIndexOutOfBoundsException:数组索引越界异常
 * 		数组  索引 超出  边界  异常
 * 			产生的原因：我们访问了不存在的索引
 *
 * 		NullPointerException:空指针异常
 * 			产生的原因：数组已经不再指向堆内存的数据了,你还使用数组名去访问元素
 *
 *
 */
public class ArrayDemo {
	public static void main(String[] args) {
		//数据类型[] 数组名 = new 数据类型[数组长度];
		int[] arr = new int[3];
		/*
		 * 左边：
		 * 		int:说明数据类型是int类型
		 * 		[]:说明这是一个数组
		 * 		arr:数组名
		 * 
		 * 右边：
		 * 		new:为数组申请内存,开辟空间
		 * 		int:说明数组中的元素类型是int
		 * 		[]：说明这是一个数组
		 * 		3：数组长度,其实就是数组中的元素个数
		 * 
		 */
		
		//输出数组名
		System.out.println("arr:" + arr);	//	[I@15db9742	括号代表数组,说明是一个数组的地址值
		//遍历数组
		//访问格式：数组名[索引]
		for ( int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]" + arr[i]);
		}

		int[] arr2 = {1, 2, 3};
		for ( int i = 0; i < arr.length; i++) {
			System.out.println("arr2[" + i + "]" + arr2[i]);
		}

		//访问数组元素
//		System.out.println(arr[3]);

		//引用类型：类,接口,数组
		//常量：空常量,null,是可以赋值给引用类型的
		arr = null;
		System.out.println(arr[1]);
		
	}

}
