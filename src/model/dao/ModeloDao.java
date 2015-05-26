package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Modelo;
import model.jdbc.Conexao;


public class ModeloDao implements ICRUD<Modelo>{

	private Connection connect;
	public PreparedStatement prepara;
	
	public ModeloDao() {
		connect = Conexao.getConnection();
	} 
	
	@Override
	public long create(Modelo obj) throws SQLException {
		
String sql = "INSERT INTO modelos (modelo,marca,categoria) "
		+ "VALUES (?,?,?)";
//-------
prepara = connect.prepareStatement(sql);		

prepara.setString(1, obj.getModelo());
prepara.setString(2, obj.getMarca());
prepara.setString(3, obj.getCategoria());

prepara.execute();

return 0;
}

	@Override
	public long update(Modelo obj) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean delete(Modelo obj) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Modelo> restriveAll() throws SQLException {
		
            
            
            List<Modelo> listaModelos = new ArrayList<>();
		Modelo modelo;
		String sql = "select * from modelos";

		prepara = connect.prepareStatement(sql);

		ResultSet rs = prepara.executeQuery();

		while (rs.next()) {
			modelo = new Modelo();
                        modelo.setCategoria(rs.getString("categoria"));
                        modelo.setMarca(rs.getString("marca"));
                        modelo.setModelo(rs.getString("modelo"));
                        modelo.setId(rs.getInt("pk_modelo"));

			listaModelos.add(modelo);
		}
		prepara.close();

		return listaModelos;
            
            
            
            
            
            
//		return null;
	}

	@Override
	public Modelo retriveOneByPkKey(long pkKLey) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Modelo> retriveByName(String nome) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	

}
