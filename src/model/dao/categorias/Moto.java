package model.dao.categorias;

import model.Modelo;

public class Moto extends SetVeiculo{

	@Override
	public Modelo setCategoria() {
		Modelo mod = new Modelo();
		mod.setCategoria("moto");
		return mod;
	}

}
