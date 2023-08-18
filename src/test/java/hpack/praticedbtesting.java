package hpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class praticedbtesting {
	
	
	@Test
	public void praticedbtesting() throws SQLException
	{
		
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","Sai@2255");
		
		if(connection.isClosed())
		{
			System.out.println("My SQL data base is disconnected");
			
		}
		else {
			System.out.println("JDBC has connected");
		}
		
	Statement statement = connection.createStatement();
	
	ResultSet execute = statement.executeQuery("SELECT * FROM praticedatabase.inputdata where SerialNo=6");
	
	while(execute.next())
	{
		System.out.println(execute.getString("surname"));
		System.out.println(execute.getString("fullname"));
		System.out.println(execute.getString("occupation"));
		System.out.println(execute.getString("Age"));
		
		
	}
		
		
	}
	
	
	
	

}
