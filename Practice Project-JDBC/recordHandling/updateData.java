package setupJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class updateData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/ecommerce";
		String username = "root";
		String password = "Passwordis-1234";
		String query = "UPDATE products SET product_price = 500 where product_id = 1001 ;";
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(dbUrl, username, password);
			Statement stmt = con.createStatement();
			stmt.execute(query);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			con.close();
		}

	}
}
