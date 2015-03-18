package model.dao.categorias;

import model.Modelo;

public class Caminhao extends SetVeiculo{

	@Override
	public Modelo setCategoria() {
		Modelo mod = new Modelo();
		mod.setCategoria("caminhao");
		return mod;
	}

}