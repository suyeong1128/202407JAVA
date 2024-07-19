package project0719;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex1 {
	public static void main(String[]args) {
		String createTable = "CREATE TABLE EMP" + 
				"(EMPNO int(11) not null primary key," +
				"ENAME varchar(10) not null, " + 
				"JOB varchar(9) DEFAULT NULL, " +
				"MGR int(11) DEFAULT NULL, " + 
				"HIREDATE date DEFAULT NULL, "+
				"SAL int(11) DEFAULT NULL, " + 
				"COMM int(11) DEFAULT NULL, " +
				"DEPTNO int(11) DEFAULT NULL)";
		String URL = "jdbc:mysql://localhost:3306/spring5fs";
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, "spring5", "spring5");
			System.out.println("Mysql 접속 성공!");
			stmt = con.createStatement();
			int num = stmt.executeUpdate(createTable);
			System.out.println("테이블 등록 성공!" + num);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace(); 
		}
	}
}
