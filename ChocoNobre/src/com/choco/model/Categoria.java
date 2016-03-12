package com.choco.model;

public class Categoria {

	private int codCategoria;
	private String nome;
	
	public Categoria() {
		super();
	}

	public Categoria(int codCategoria, String nome) {
		super();
		this.codCategoria = codCategoria;
		this.nome = nome;
	}

	public int getCodCategoria() {
		return codCategoria;
	}

	public void setCodCategoria(int codCategoria) {
		this.codCategoria = codCategoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
