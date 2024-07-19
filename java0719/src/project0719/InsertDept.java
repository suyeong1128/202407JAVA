package project0719;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDept {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("부서번호 : ");
		int deptNo = Integer.parseInt(scan.nextLine());
		
		System.out.print("부서명 : ");
		String dName = scan.nextLine();
		
		System.out.print("지역 : ");
		String loc = scan.nextLine();
		String insertTable = "INSERT INTO DEPT VALUES(" + deptNo + ", '" + dName + "', '" + loc + "')";
		 
		String URL = "jdbc:mysql://localhost:3306/spring5fs";
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, "spring5", "spring5");
			System.out.println("Mysql 접속 성공~!");
			stmt = con.createStatement();
			int num = stmt.executeUpdate(insertTable);
			System.out.println("테이블에 삽입! " + num);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
	
}
