package com.choco.model;

public class ItemPedido {
	
	private int numItem;
	private int quantidade;
	private Pedido pedido;
	
	public ItemPedido() {
		super();
	}

	public ItemPedido(int numItem, int quantidade, Pedido pedido) {
		super();
		this.numItem = numItem;
		this.quantidade = quantidade;
		this.pedido = pedido;
	}

	public int getNumItem() {
		return numItem;
	}
	
	public void setNumItem(int numItem) {
		this.numItem = numItem;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public Pedido getPedido() {
		return pedido;
	}
	
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

}
