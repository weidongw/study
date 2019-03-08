package com.wwd.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


/**
 * ClassName: VisitMySql
 * @Description: TODO 数据库辅助类
 * @author WangWD
 */

public class VisitMySql {
	//连接对象
	private Connection connection;
	//传递SQL语句
	private Statement stat;
	//结果集
	private ResultSet resultSet; 
	
	//查询
	public void select() {
		try {
			//获取链接
			connection = OperatorMoney.getConnection();
			if (connection == null)
				return;
			
			//定义SQL语句
			String sql = "select * from money order by date;";
			//执行SQL语句
			stat = connection.createStatement();
			//返回结果集
			resultSet = stat.executeQuery(sql);
			//获取数据
			while (resultSet.next()) {
				int monId = resultSet.getInt(1);
				String monName = resultSet.getString(2);
				float monAmount = resultSet.getFloat(4);
				int monCount = resultSet.getInt(5);
				float monAllAmount = resultSet.getFloat(6);
				
				System.out.println(monName + "\t" + monAmount);
				System.out.println("");
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			//释放资源
			try {
				resultSet.close();
				connection.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	//插入
	// 使用Statement接口的executeUpdate()方法向数据库添加数据
	public void insert() {
		try {
			//获取链接
			connection = OperatorMoney.getConnection();
			if (connection == null)
				return;
			
			//获取用户输入的内容
			Scanner input = new Scanner(System.in);
			System.out.print("请输入用户名：");
			String userName = input.nextLine();
			/*System.out.print("请输入每期还款额");
			float monAmount = input.nextFloat();*/
			System.out.print("请输入密码：");
			String passwd = input.nextLine();
			
			
			//定义SQL语句
			String sql = "insert into login values('"+userName+"', '"+passwd+"');"; 
			//获取Statement对象
			stat = connection.createStatement();
			//执行sql语句
			stat.executeQuery(sql);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			//释放资源
			try {
				connection.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	//插入
		// 使用Statement接口的executeUpdate()方法向数据库添加数据
		public void insert2() {
			try {
				//获取链接
				connection = OperatorMoney.getConnection();
				if (connection == null)
					return;
				
				//获取用户输入的内容
				Scanner input = new Scanner(System.in);
				System.out.print("请输入用户名：");
				String userName = input.nextLine();
				/*System.out.print("请输入每期还款额");
				float monAmount = input.nextFloat();*/
				System.out.print("请输入密码：");
				String passwd = input.nextLine();
				
				
				//定义SQL语句
				String sql = "INSERT INTO login VALUES('"+userName+"', '"+passwd+"');"; 
				String sql2 = "INSERT INTO login VALUES (?,?);";
				//创建一个Statement对象
				PreparedStatement ps = connection.prepareStatement(sql2);
				//向sql语句的第一个问号添加数据
				ps.setString(1, userName);
				//向sql语句的第二个问号添加数据
				ps.setString(2, passwd);
				
				//执行sql语句
				ps.executeQuery(sql2);
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			} finally {
				//释放资源
				try {
					connection.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
	
		//使用Statement接口的executeUpdate()方法实现从数据库删除数据
		public void delete() {
			try {
				
				//获取链接
				connection = OperatorMoney.getConnection();
				if (connection == null)
					return;
				
				//提示用户输入要删除的用户
				System.out.println("请输入要删除的用户:");
				Scanner input = new Scanner(System.in);
				String userName = input.nextLine();
				
				//定义sql语句
				String deleteSql = "DELETE FROM login WHERE user="+userName+");";
				//获取Statement对象
				stat = connection.createStatement();
				//执行sql语句
				stat.executeQuery(deleteSql);
				
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
	            //释放资源
	            try {
	            	connection.close();
	                
	            } catch (Exception e2) {
	            	// TODO: handle exception
	            }
	        }
		}
		
		//使用PreparedStatement接口中的executeUpdate()方法实现修改数据
		public void update() {
			try {
				//获取链接
				connection = OperatorMoney.getConnection();
				if (connection == null)
					return;
				
				//输入要修改的用户
				System.out.println("请输入用户名：");
				Scanner input = new Scanner(System.in);
				String userName = input.nextLine();
				//提示输入新的密码
				System.out.println("请输入新密码:");
				String newPasswd = input.nextLine();
				//定义SQL语句
				String updateSql = "UPDATE login SET passwd='"+newPasswd+"' where username='"+userName+"';";
				//创建Statement对象
				PreparedStatement pStatement = connection.prepareStatement(updateSql);
				//执行SQL
				pStatement.executeQuery();
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			} finally {
	            //释放资源
	            try {
	            	connection.close();
	            } catch (Exception e2) {}
	            
	        }
		}
	
}
