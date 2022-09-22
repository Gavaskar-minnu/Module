package minnu04;
import java.sql.*;
public class select {
    int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Connection conn= null;
       try
       {
    	   Class.forName("com.mysql.cj.jdbc.Driver");
    	   conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch","root","A#s852edr");
    	   
    	   String query="select * from employee where empId=5";
    	   Statement stmt=conn.prepareStatement(query);
    	   
    	   ResultSet result=stmt.executeQuery(query);
    	   
    	   while(result.next())
    	   {
    		   int empId=result.getInt(1);
    		   String fName=result.getString(2);
    		   String lName=result.getString(3);
    		   int sal=result.getInt(4);
    		   
    		   System.out.println(empId);
    		   System.out.println(fName);
    		   System.out.println(lName);
    		   System.out.println(sal);
    	   }
    	   conn.close();
       }
       catch (Exception e)
       {
    	   e.printStackTrace();
       }
	}

}
