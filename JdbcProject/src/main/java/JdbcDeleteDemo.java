import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDeleteDemo {

	public static void main(String[] args) {
		// step 1
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded...");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		Connection conn = null;
		try {
			// step 2
			String connectionUrl = "jdbc:mysql://localhost:3306/sampledb";
			String username = "root";
			String password = "root";
			conn = DriverManager.getConnection(connectionUrl, username, password);
			System.out.println("COnnection established...");
			
			// step 3
			String query = "delete from account where acc_id=?";
			PreparedStatement ps = conn.prepareStatement(query);
			
			ps.setInt(1, 6);
			int rowsAffected = ps.executeUpdate();
			System.out.println(rowsAffected + " row((s) affected...");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
