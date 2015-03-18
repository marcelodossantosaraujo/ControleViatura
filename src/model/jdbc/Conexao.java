package model.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexao {
	
	
	
	public static Connection getConnection(){
		Connection con = null;	
		
			try {
				con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/controle_viatura","postgres","1532");
				System.out.println("conectado com sucesso");
			} catch (SQLException e) {
				
				System.out.println("falha ao conectar" + e.getMessage());
			}
		return con;
	}

	
}
