import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsertDemo {

	public static void main(String[] args) {
		// step 1 - load the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully...");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection conn = null;
		Statement stmt = null;
		String connectionUrl = "jdbc:mysql://localhost:3306/sampledb";
		String username = "root";
		String password = "root";
		try {
			// step 2 -  establish connection to the db
			// "<protocol>/<ipaddress>/<portnumber>"
			conn = DriverManager.getConnection(connectionUrl, username, password);
			System.out.println("Established Connection...");
			
			// step 3 - create a statement and execute
			stmt = conn.createStatement();
			System.out.println("Statement created...");
			String query = "insert into account(acc_name, acc_balance) values ('Test', 20000)";
			int rowsAffected = stmt.executeUpdate(query);
			System.out.println(rowsAffected + " row(s) affected...");
			
			// step 4 - handle the exceptions
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			// step 5 - close the resources
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		

	}

}
