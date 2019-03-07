package com.stock.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
	private final String url =
		      "jdbc:mysql://localhost:3306/hello?useUnicode=true&characterEncoding=utf8&&useSSL=false";
	private final String driver = "com.mysql.jdbc.Driver";
	private final String user = "root";
	private final String psw = "123456789";

	private Connection con = null;
	
//	private String driver = "oracle.jdbc.driver.OracleDriver";
//	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:ORCL";
////	private String url = "jdbc:oracle:thin:@192.168.56.1:1521:ORCL";
//	private String user = "ps";
//	private String psw = "ps";
//	private Connection con = null;

	public Connection getConnection() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, psw);
			con.setAutoCommit(false); // �ر��Զ��ύ
			if (con == null)
				throw new Exception("��ȡ���ݿ�����ʧ�ܣ�");
		} catch (SQLException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e2) {
			e2.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public void commit() {
		try {
			con.commit();// �ֶ��ύ
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * public static void main(String[] args) { DBUtil db = new DBUtil(); String
	 * userid; String password; String sql =
	 * "select user_id, password, name, sex, birthday, email, telephone from user_info where user_id=? and password=?"
	 * ; Connection con = db.getConnection();
	 * 
	 * }
	 */
	/*
	 * public static void main(String[] args) { DBUtil d = new DBUtil();
	 * d.getConnection(); System.out.println("�ɹ�"); }
	 */
}