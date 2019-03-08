package com.wwd.test;

import com.wwd.controller.VisitMySql;

public class Test {
	
	public static void main(String[] args) {
		
		//实例化对象
		VisitMySql visitMySql = new VisitMySql();
		
		//调用查询方法
		visitMySql.select();
		visitMySql.insert();
		visitMySql.update();
//		visitMySql.delete();
	}

}
