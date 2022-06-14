package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class CoenexionBDsustantiva {
	
	private static Connection con = null;
	
	private CoenexionBDsustantiva() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver"); //Mysql
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sustantiva","root","123456");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		
	} 
	public static Connection getCon() {
		if (con==null) {
			new CoenexionBDsustantiva();
		}
		return con;
	}
	

}
