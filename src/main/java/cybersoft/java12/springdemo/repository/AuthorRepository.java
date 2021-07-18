package cybersoft.java12.springdemo.repository;

import cybersoft.java12.springdemo.dbconnection.DatabaseConnection;
import cybersoft.java12.springdemo.dbconnection.MySqlConnection;

public class AuthorRepository {
	
	private DatabaseConnection dbConnection;
	public AuthorRepository() {
		dbConnection = new MySqlConnection();
	}
	public void getAuthors() {
		dbConnection.getConnetion();
	}
}
