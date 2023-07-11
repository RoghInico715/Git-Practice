package seleniumAndJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumAndJDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String dbUrl = "jdbc:mysql://localhost:3306/user_credentials";
		String username = "root";
		String password = "Passwordis-1234";
		String query = "select * from user_info;";
		Connection con = null;
		String user_email = null;
		String user_password = null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(dbUrl, username, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		
		while (rs.next()) {
		    user_email = rs.getString("email");
			user_password = rs.getString("pass");
		}
		
        ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys(user_email);
		driver.findElement(By.id("pass")).sendKeys(user_password);
		
		driver.findElement(By.name("login")).click();
		
		driver.quit();

	}

}
