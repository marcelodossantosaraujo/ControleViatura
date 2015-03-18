package model.dao.categorias;

public class RetornaMoto extends TipoVeiculo{

	@Override
	public SetVeiculo setCategoria() {
		return new Moto();
	}

}
