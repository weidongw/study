package com.wwd.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OperatorMoney {

	// 数据库连接对象
	private static Connection connection;
	// 数据库连接地址
	private static String MYSQL_URL = "jdbc:mysql://192.168.202.238:3306/personal?useUnicode=true&characterEncoding=UTF-8";
	// 数据库的用户名
	private static String USERNAME = "wangwd";
	// 数据库的密码
	private static String PASSWD = "robert9920";
	
	public static Connection getConnection() {
		try {

			Class.forName("com.mysql.jdbc.Driver"); // 加载驱动

			System.out.println("加载驱动成功!!!");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		try {

			// 通过DriverManager类的getConenction方法指定三个参数,连接数据库
			connection = DriverManager.getConnection(MYSQL_URL, USERNAME, PASSWD);
			System.out.println("连接数据库成功!!!");
			
			/*String sql = "select * from personal.money order by date;";
			PreparedStatement pStatement = connection.prepareStatement(sql);
			ResultSet resultSet = pStatement.executeQuery();
			
			while (resultSet.next()) {
				
				int monid = resultSet.getInt("monid");
				String monname = resultSet.getString("monname");
				int monCount = resultSet.getInt("count");
				System.out.print(monid + "\t" + monname + "\t" + monCount);
				System.out.println("");
				
			}*/

            //返回连接对象
            return connection;

        } catch (SQLException e) {
        	// TODO: handle exception
            e.printStackTrace();
        	System.out.println("SQLException: " + e.getMessage());
			System.out.println("SQLState: " + e.getSQLState());
			System.out.println("VendorError: " + e.getErrorCode());
			System.out.println("连接失败");
			return null;
        }
	}

}