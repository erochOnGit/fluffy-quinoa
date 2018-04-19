package covoit.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionBDD {
	
	public Connection connect() {
		//SQLite connection string
		try {
			Class.forName("org.sqlite.JDBC");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String url = "jdbc:sqlite:/Users/deriot/Documents/workspace-sts-3.9.0.RELEASE/essaiCovoit/CovoitDB.db";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url);
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return conn;
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
