package com.choco.model;

public class Ingrediente {
	
	private int codIngrediente;
	private String nome;
	private double valor;
	
	public Ingrediente() {}
	
	public Ingrediente(int codIngrediente, String nome, double valor) {
		super();
		this.codIngrediente = codIngrediente;
		this.nome = nome;
		this.valor = valor;
	}


	public int getCodIngrediente() {
		return codIngrediente;
	}
	
	public void setCodIngrediente(int codIngrediente) {
		this.codIngrediente = codIngrediente;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
