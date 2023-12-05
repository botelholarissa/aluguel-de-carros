package com.aluguelVeiculos.powebsys.model;

public class Contrato {
	private double preco;
	private String duracao;
	private Cliente cliente;
	private Veiculo veiculo;
	
	public Contrato() {}
	
	public Contrato(double preco, String duracao, Cliente cliente, Veiculo veiculo) {
		this.preco = preco;
		this.duracao = duracao;
		this.cliente = cliente;
		this.veiculo = veiculo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	
}
