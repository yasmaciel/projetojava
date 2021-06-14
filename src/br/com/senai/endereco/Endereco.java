package br.com.senai.endereco;

//CLASSE
public class Endereco extends Cidade {

	// ATRIBUTOS
	private String bairro;
	private String rua;
	private String complemento;
	private String numero;

	// METODOS

	public String getBairro() {
		return bairro;

	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
