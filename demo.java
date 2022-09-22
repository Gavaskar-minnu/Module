 package minnu04;
import java.sql.*;
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Connection connection = null;
	        Statement stmt = null;
	        try
	        {
	          Class.forName("com.mysql.cj.jdbc.Driver");
	        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch", "root", "A#s852edr");
	           
	          stmt = connection.createStatement();
	          String qerry="INSERT INTO Employee VALUES (6,'gavaskar','anumalla',10000)";
	          stmt.execute(qerry);
	        } 
	        catch (Exception e) {
	         
	            e.printStackTrace();
	          }
	        
	}

}
