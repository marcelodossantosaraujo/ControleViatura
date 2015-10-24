package model.dao.factoresMetod;

import model.Modelo;

public class TipoCategoria {
	public Modelo getValor(int tipo) {
		switch (tipo) {
		case 1 :return new Moto().Moto();
		case 2 :return new Carro().Carro();
		case 3 :return new Camionete().Camionete();	
		case 4 :return new Caminhao().Caminhao();
	}
		return null;
	}

}
