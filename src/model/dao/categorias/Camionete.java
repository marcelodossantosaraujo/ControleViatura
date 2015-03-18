package model.dao.categorias;

import model.Modelo;

public class Camionete extends SetVeiculo{

	@Override
	public Modelo setCategoria() {
		Modelo mod = new Modelo();
		mod.setCategoria("Camionete");
		return mod;
	}

}