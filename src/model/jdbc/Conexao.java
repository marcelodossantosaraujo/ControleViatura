package model.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {
	
	
	
	public static Connection getConnection(){
		Connection con = null;	
	
                
			try {
                                Class.forName("org.postgresql.Driver");
				con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/controle_viatura","postgres","1532");
				System.out.println("conectado com sucesso");
                                
			} catch (SQLException | ClassNotFoundException ex) {
				
				System.out.println("falha ao conectar" + ex.getMessage());
			} 
		return con;
	}

	
}
