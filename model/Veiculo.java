package com.aluguelVeiculos.powebsys.model;


public class Veiculo {
	
	private String matricula;
	private String placa;
	private Usuario proprietario;
	private String marca;
	private String modelo;
	private int ano;
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getPlaca() {
		return placa;
	}
	public Veiculo(String matricula, String placa, String marca, String modelo, int ano) {
		this.matricula = matricula;
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public Usuario getProprietario() {
		return proprietario;
	}
	public void setProprietario(Usuario proprietario) {
		this.proprietario = proprietario;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
}
