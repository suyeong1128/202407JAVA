import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx5 {
	public static void main(String[]args) {
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		Connection conn = null;
		Statement stmt = null;
		String sql = "select count(*) from dept";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL, "root", "mysql");
			System.out.println("접속 성공!!");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
//			while(rs.next()){
//내가 한 코드
//				int count = rs.getInt(rs.getRow());
//				System.out.printf("%d개", count);
//			}
		//강사님 코드
		rs.next();
		System.out.println("dept테이블에는 총 " + rs.getInt(1) + "건 입니다.");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
