package com.choco.model;

public class Endereco {
	
	private String tipo;
	private String numero;
	private String cep;
	private String bairro;
	private String logradouro;
	private String uf;
	private String cidade;	
	
	public Endereco() {
		super();
	}

	public Endereco(String tipo, String numero, String cep, String bairro, String logradouro, String uf,
			String cidade) {
		super();
		this.tipo = tipo;
		this.numero = numero;
		this.cep = cep;
		this.bairro = bairro;
		this.logradouro = logradouro;
		this.uf = uf;
		this.cidade = cidade;
	}

	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public String getUf() {
		return uf;
	}
	
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}
