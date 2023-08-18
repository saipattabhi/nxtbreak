package hpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class database {

	@Test
	public void database() throws SQLException {

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database1", "root", "Sai@2255");

		if (con.isClosed()) {
			System.out.println(" My SQL is not connected");

		} else {

			System.out.println("My Sql is connected");
		}

	Statement statement = con.createStatement();
	
	 ResultSet resultset = statement.executeQuery("SELECT * FROM database1.`workers table` where age=27");
	 
	 while(resultset.next())
	 {
		 System.out.println(resultset.getString("lastname"));
		 System.out.println(resultset.getString("firstname"));
		 
		 System.out.println(resultset.getInt("workers id"));
		 
	 }
		
		
	}
	

}
