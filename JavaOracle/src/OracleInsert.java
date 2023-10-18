import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleInsert {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "c##green";
		String password = "green1234";
				
		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("oracle connection success.\n");
			
			Statement stmt = conn.createStatement();
			
			String sql1 = "SELECT max(deptno) FROM dept";
			ResultSet rs = stmt.executeQuery(sql1);
			rs.next();
			String strdeptno = rs.getString("MAX(deptno)");

			int ideptno = Integer.parseInt(strdeptno);
			ideptno += 10;
			String sdname = "IT", sloc = "SEOUL";
			String sql2 = "INSERT INTO dept VALUES ('" + ideptno + "','" + sdname + "','" + sloc + "')";
			System.out.println(sql2);
			boolean b = stmt.execute(sql2);
			
			if(!b) {
				System.out.println("Insert Success.\n");
			} else {
				System.out.println("Insert fail.\n");
			}	
			
			String sql3 = "SELECT * FROM dept";
			ResultSet rs2 = stmt.executeQuery(sql3);
			while(rs2.next()) {
				System.out.print(rs2.getString("deptno") + " ");
				System.out.print(rs2.getString("dname") + " ");
				System.out.println(rs2.getString("loc") + " ");
			}
			
			
		}	catch (ClassNotFoundException e) {
				System.out.println(e);
		}	catch (SQLException e) {
				System.out.println(e);
		}
	}
}