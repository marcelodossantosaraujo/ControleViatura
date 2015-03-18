package model.dao.categorias;

public class RetornaCaminhao extends TipoVeiculo{

	@Override
	public SetVeiculo setCategoria() {
		return new Caminhao();
	}

}
