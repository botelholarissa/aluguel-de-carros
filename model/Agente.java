package com.aluguelVeiculos.powebsys.model;

public class Agente extends Usuario{
	private String tipo;
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Agente(String nome,String telefone, String email,String senha,String confSenha,String tipo) {
		super(nome,telefone,email,senha,confSenha);
		this.setTipo(tipo);
	}
	public void modificar(Pedido p) {
		
	}
	public void avaliar(Pedido p,boolean veredito) {
		p.setAprovacao(veredito);
	}
	
}
