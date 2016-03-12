package com.choco.model;

public class Produto {

	private int codProduto;
	private String nome;
	private String descricao;
	private String foto;
	private double valor;
	private int prazoConfeccao;
	private Categoria categoria;
	
	public Produto() {
		super();
	}

	public Produto(int codProduto, String nome, String descricao, String foto, double valor, int prazoConfeccao, Categoria categoria) {
		super();
		this.codProduto = codProduto;
		this.nome = nome;
		this.descricao = descricao;
		this.foto = foto;
		this.valor = valor;
		this.prazoConfeccao = prazoConfeccao;
		this.categoria = categoria;
	}

	public int getCodProduto() {
		return codProduto;
	}
	
	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getFoto() {
		return foto;
	}
	
	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public int getPrazoConfeccao() {
		return prazoConfeccao;
	}
	
	public void setPrazoConfeccao(int prazoConfeccao) {
		this.prazoConfeccao = prazoConfeccao;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
}
