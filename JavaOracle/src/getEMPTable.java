import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class getEMPTable {

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
			
			String sql = "SELECT * FROM EMP";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.printf("%s",rs.getString("EMPNO"));
				System.out.printf("%10s",rs.getString("ENAME"));
				System.out.printf("%10s",rs.getString("JOB"));
				System.out.printf("%10s",rs.getInt("MGR"));
				System.out.printf("%15s",rs.getDate("HIREDATE"));
				System.out.printf("%10s",rs.getInt("SAL"));
				System.out.printf("%10s",rs.getInt("COMM"));
				System.out.printf("%10s\n",rs.getInt("DEPTNO"));
			}
			
		}	catch (ClassNotFoundException e) {
				System.out.println(e);
		}	catch (SQLException e) {
				System.out.println(e);
		}
	}
}
