package model.dao.categorias;

import model.Modelo;

public class Carro extends SetVeiculo{

	@Override
	public Modelo setCategoria() {
		Modelo mod = new Modelo();
		mod.setCategoria("carro");
		return mod;
		
	}

}