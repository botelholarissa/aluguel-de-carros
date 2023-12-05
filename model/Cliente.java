package com.aluguelVeiculos.powebsys.model;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Cliente extends Usuario{
	private String rg;
	private String cpf;
	private String profissao;
	private Map<String ,Double> trabalho;
	private List<Pedido> pedidos;
	private List<Aluguel> contratos;
	
	private static final int MAX_TRAB = 3;
	public void modificarPedido() {
		
	}
	public void addContrato(Aluguel contrato) {
		contratos.add(contrato);
	}
	public void removeContrato(Aluguel contrato) {
		contratos.remove(contrato);
	}
	public void addPedido(Pedido ped) {
		pedidos.add(ped);
	}
	public void removePedido(Pedido ped) {
		pedidos.remove(ped);
	}
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public List<Aluguel> getContratos() {
		return contratos;
	}
	
	public void addTrabalho(String trab, double sal) {
		if(trabalho.size() < MAX_TRAB) {
			trabalho.put(trab, new Double(sal));
		}
	}
	public void removeTrabalho(String trab) {
		trabalho.remove(trab);
	}
	public double getSalarioDeTrab(String trab) {
		
		return trabalho.get(trab);
	}
	public Map<String, Double> getTrabalho() {
		return trabalho;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public Cliente(String nome,String telefone, String email,String senha,String confSenha,String rg,String cpf,String profissao) {
		super(nome,telefone,email,senha,confSenha);
		this.setCpf(cpf);
		this.setRg(rg);
		this.setProfissao(profissao);
		trabalho = new HashMap<String,Double>();
		pedidos = new ArrayList<Pedido>();
		contratos = new ArrayList<Aluguel>();
	}
	
}
