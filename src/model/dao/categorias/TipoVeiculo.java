package model.dao.categorias;

public abstract class TipoVeiculo {
	public static TipoVeiculo categoria(int tipo) {
		switch (tipo) {
		case 1 :return new RetornaMoto();	
		case 2 :return new RetornaCarro();
		case 3 :return new RetornaCamionete();	
		case 4 :return new RetornaCaminhao();
	}
		return null;
	}	
	
	public abstract SetVeiculo setCategoria();

}
