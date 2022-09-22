package minnu04;
import java.sql.*;
public class update {

	public static void main(String[] args) {
		
        // TODO Auto-generated method stub
                 Connection conn= null;
                 Statement stmt= null;
                    try
                    {
                       Class.forName("com.mysql.cj.jdbc.Driver");
                 	   conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch","root","A#s852edr");
                          stmt = conn.createStatement();
                          String query = "UPDATE employee " +
                                  "SET sal = 150000 WHERE empId=5";
                          stmt.executeUpdate(query);

                    } 
                     catch (Exception e)
                    {

                          e.printStackTrace();
                    }
	}

}
