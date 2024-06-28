package br.com.fuctura.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private String url;
	private String user;
	private String password;
	
	public Conexao(String url, String user, String password) {
		super();
		this.url = url;
		this.user = user;
		this.password = password;
	}

	public Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(url, user, password);
		return conn;
	}
	
}
