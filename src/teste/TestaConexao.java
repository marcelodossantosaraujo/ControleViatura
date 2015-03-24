package teste;

import java.sql.SQLException;

import model.Modelo;
import model.Motorista;
import model.dao.ICRUD;
import model.dao.ModeloDao;
import model.dao.MotoristaDao;
import model.dao.categorias.*;

public class TestaConexao {
	
	public static void main(String[] args) {
	testeModelo();
//		Conexao.getConnection();
//		testa_crud();
//		Veiculo carro = new Veiculo();
//		carro.setAno("12/12/1992");
//		System.out.println(carro.getAno());
//		carro.getMarca();
		
	}


	
	
	
	

	
private static void testeModelo() {
	TipoVeiculo teste = TipoVeiculo.categoria(1);
	SetVeiculo set = teste.setCategoria();
	Modelo mod = set.setCategoria();
	mod.setMarca("CG");
	mod.setModelo("TitaFSJKMNKHGFn");
	
	ICRUD<Modelo> mode;
	
		mode = new ModeloDao();
		try {
			mode.create(mod);
			System.out.println("dados cadastrados com sucesso!");
		} catch (SQLException e) {
			System.out.println("Falha ao cadastrar!");
			e.printStackTrace();
		}
	

	
}


	
	
	
	
	
	
	
	
	
	private static void testa_crud() {
		Motorista mot = new Motorista();
		mot.setNome("marcelho");
		mot.setBairro("park");
		mot.setCnh("234576r");
		mot.setCpf("34534576854");
		mot.setEndereco("dgbhsdfgds");
		mot.setLogradouro("fhgmgfd");
		mot.setNascimento("12-12-1212");
		mot.setTelefone("4568765435");
		ICRUD<Motorista> moto = new MotoristaDao();
		
		try {
			moto.create(mot);
			System.out.println("dados cadastrados com sucesso!");
		} catch (SQLException e) {
			System.out.println("Falha ao cadastrar!");
			e.printStackTrace();
		}
	}

}
