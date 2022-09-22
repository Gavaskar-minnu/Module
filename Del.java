package minnu04;
import java.util.*;

import java.sql.*;
public class Del {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement prepstmt=null;
	try {
	    
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch","root","A#s852edr");
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter account number");
	    int ano=sc.nextInt();
	    //to write querry
	    String query="delete from bank where ano=?";
	     prepstmt=conn.prepareStatement(query);
	    prepstmt.setInt(1,ano);
	    prepstmt.execute();
	    conn.close();
	    sc.close();
	} catch(Exception e) {
	    e.printStackTrace();
	}
	}
	
}
