package teste;

import model.Modelo;
import model.dao.categorias.SetVeiculo;
import model.dao.categorias.TipoVeiculo;

public class Teste {

	public static void main(String[] args) {
		TipoVeiculo teste = TipoVeiculo.categoria(2);
		SetVeiculo set = teste.setCategoria();
		Modelo mod = set.setCategoria();
		System.out.println(mod.getCategoria());

	}

}
