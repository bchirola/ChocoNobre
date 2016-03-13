package com.choco.model;

import java.util.Date;

public class Pedido {

	private int numPedido;
	private Date dataPedido;
	private Date dataEntrega;
	private double valorTotal;
	private double valorEntrega;
	private double valorPago;
	private TipoEntrega tipoEntrega;
	private boolean pedidoPago;
	private String respEntrega;
	private String respRecebimento;
	private Endereco endereco;
	
	//private Cliente cliente;
	//private Usuario usuario;
	
	//private StatusPedido pedidoNovo;
	//private StatusPedido status;
	
	
	public Pedido() {
		super();
	}
	
	public Pedido(int numPedido, Date dataPedido, Date dataEntrega, double valorTotal, double valorEntrega,
			      double valorPago, TipoEntrega tipoEntrega, boolean pedidoPago, String respEntrega, String respRecebimento) {
		super();
		this.numPedido = numPedido;
		this.dataPedido = dataPedido;
		this.dataEntrega = dataEntrega;
		this.valorTotal = valorTotal;
		this.valorEntrega = valorEntrega;
		this.valorPago = valorPago;
		this.tipoEntrega = tipoEntrega;
		this.pedidoPago = pedidoPago;
		this.respEntrega = respEntrega;
		this.respRecebimento = respRecebimento;
	}
	
	public int getNumPedido() {
		return numPedido;
	}
	
	public void setNumPedido(int numPedido) {
		this.numPedido = numPedido;
	}
	
	public Date getDataPedido() {
		return dataPedido;
	}
	
	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}
	
	public Date getDataEntrega() {
		return dataEntrega;
	}
	
	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	
	public double getValorTotal() {
		return valorTotal;
	}
	
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public double getValorEntrega() {
		return valorEntrega;
	}
	
	public void setValorEntrega(double valorEntrega) {
		this.valorEntrega = valorEntrega;
	}
	
	public double getValorPago() {
		return valorPago;
	}
	
	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}
	
	public TipoEntrega getTipoEntrega() {
		return tipoEntrega;
	}
	
	public void setTipoEntrega(TipoEntrega tipoEntrega) {
		this.tipoEntrega = tipoEntrega;
	}
	
	public boolean isPedidoPago() {
		return pedidoPago;
	}
	
	public void setPedidoPago(boolean pedidoPago) {
		this.pedidoPago = pedidoPago;
	}
	
	public String getRespEntrega() {
		return respEntrega;
	}
	
	public void setRespEntrega(String respEntrega) {
		this.respEntrega = respEntrega;
	}
	
	public String getRespRecebimento() {
		return respRecebimento;
	}
	
	public void setRespRecebimento(String respRecebimento) {
		this.respRecebimento = respRecebimento;
	}	
	

		
	
	
}
