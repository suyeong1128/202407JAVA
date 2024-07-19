package project0719;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Droptable {
	public static void main(String[]args) {
		String droptable = "drop table EMP";
		
		String URL = "jdbc:mysql://localhost:3306/spring5fs";
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, "spring5", "spring5");
			System.out.println("Mysql 접속 성공~!");
			stmt = con.createStatement();
			int num = stmt.executeUpdate(droptable);
			System.out.println("테이블 삭제! " + num);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}