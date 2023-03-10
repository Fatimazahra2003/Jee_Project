package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
	
	static String dbURL="jdbc:oracle:thin:@localhost:1521:xe";
	static String username="system";
	static String pw="Fatimazahra123";
	
	
	private static Connection cnx=null;
	
	public static Connection getInstance() throws ClassNotFoundException, SQLException{
		
		if(cnx==null || cnx.isClosed()) {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				cnx=DriverManager.getConnection(dbURL,username,pw);
				
			}catch(SQLException e) {
				System.out.println("Oppppps");
				e.printStackTrace();
			}
		}
		return cnx;
	}
	
	

}
