package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.Motorista;
import model.jdbc.Conexao;

public class MotoristaDao implements ICRUD<Motorista> {
	
	private Connection connect;
	public PreparedStatement prepara;
	
	public MotoristaDao() {
	connect = Conexao.getConnection();
	}
	
	@Override
	public long create(Motorista obj) throws SQLException {
				
		String sql = "INSERT INTO motoristas (nome,nascimento,cpf,cnh,telefone,endereco,logradouro,bairro) "
				+ "VALUES (?,?,?,?,?,?,?,?)";
//		-------
		prepara = connect.prepareStatement(sql);		
		
		prepara.setString(1, obj.getNome());
		prepara.setString(2, obj.getNascimento());
		prepara.setString(3, obj.getCpf());
		prepara.setString(4, obj.getCnh());
		prepara.setString(5, obj.getTelefone());
		prepara.setString(6, obj.getEndereco());
		prepara.setString(7, obj.getLogradouro());
		prepara.setString(8, obj.getBairro());
		
		prepara.execute();
		
		return 0;
	}

	@Override
	public long update(Motorista obj) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean delete(Motorista obj) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Motorista> restriveAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Motorista retriveOneByPkKey(long pkKLey) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Motorista> retriveByName(String nome) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
