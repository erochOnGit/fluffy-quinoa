package covoit.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionBDD {
	
	public Connection connect() {
		
		String response = "";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			response += "okClass ";
		}
		catch (Exception e){
			e.printStackTrace();
			return null;
		}
		try {
			return DriverManager.getConnection("jdbc:mysql://mysql-.alwaysdata.net","artas_covoit_ipi","789456123");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}  
	}
	
	public void insert(String sql) {
		
		
		try(Connection conn = this.connect();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql)){
					
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void select(String sql) {
		
		try(Connection conn = this.connect();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql)){
					
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
}
