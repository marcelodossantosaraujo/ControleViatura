package model;

public class Veiculo extends Modelo {
	private String ano;
	private String placa;
	private String cidade;
	private String estadoSigla;
	private String cor;
	private String nChassis;
	
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstadoSigla() {
		return estadoSigla;
	}
	public void setEstadoSigla(String estadoSigla) {
		this.estadoSigla = estadoSigla;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getnChassis() {
		return nChassis;
	}
	public void setnChassis(String nChassis) {
		this.nChassis = nChassis;
	}

}
