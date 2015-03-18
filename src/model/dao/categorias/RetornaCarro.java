package model.dao.categorias;

public class RetornaCarro extends TipoVeiculo{

	@Override
	public SetVeiculo setCategoria() {
		return new Carro();
	}

}
