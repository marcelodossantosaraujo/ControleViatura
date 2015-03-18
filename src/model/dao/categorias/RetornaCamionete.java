package model.dao.categorias;

public class RetornaCamionete extends TipoVeiculo{

	@Override
	public SetVeiculo setCategoria() {
		return new Camionete();
	}

}
