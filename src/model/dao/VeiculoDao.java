package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import model.Veiculo;
import model.jdbc.Conexao;

public class VeiculoDao implements ICRUD<Veiculo> {
	
	private Connection connect;
	public PreparedStatement prepara;
	
	public VeiculoDao() {
	connect = Conexao.getConnection();
	}
	
	@Override
	public long create(Veiculo obj) throws SQLException {
				
		String sql = "INSERT INTO modelo (modelo,marca) "
				+ "VALUES (?,?)";
//		-------
		prepara = connect.prepareStatement(sql);		
		
		prepara.setString(1, obj.getModelo());
		prepara.setString(2, obj.getMarca());
		prepara.execute();
		
		return 0;
	}

	@Override
	public long update(Veiculo obj) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean delete(Veiculo obj) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Veiculo> restriveAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Veiculo retriveOneByPkKey(long pkKLey) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Veiculo> retriveByName(String nome) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
