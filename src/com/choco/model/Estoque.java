package com.choco.model;

import java.util.Date;

public class Estoque {
	
	private	int codEstoque;
	private int quantidade;
	private Date dataMovimentacao;
	private int tipoMovimentacao;
	private Ingrediente ingrediente;
	
	public Estoque() {}

	public Estoque(int codEstoque, int quantidade, Date dataMovimentacao, int tipoMovimentacao,	Ingrediente ingrediente) {
		super();
		this.codEstoque = codEstoque;
		this.quantidade = quantidade;
		this.dataMovimentacao = dataMovimentacao;
		this.tipoMovimentacao = tipoMovimentacao;
		this.ingrediente = ingrediente;
	}

	public Ingrediente getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(Ingrediente ingrediente) {
		this.ingrediente = ingrediente;
	}

	public int getCodEstoque() {
		return codEstoque;
	}
	
	public void setCodEstoque(int codEstoque) {
		this.codEstoque = codEstoque;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public Date getDataMovimentacao() {
		return dataMovimentacao;
	}
	
	public void setDataMovimentacao(Date dataMovimentacao) {
		this.dataMovimentacao = dataMovimentacao;
	}
	
	public int getTipoMovimentacao() {
		return tipoMovimentacao;
	}
	
	public void setTipoMovimentacao(int tipoMovimentacao) {
		this.tipoMovimentacao = tipoMovimentacao;
	}
	
}
