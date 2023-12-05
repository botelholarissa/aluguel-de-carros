package com.aluguelVeiculos.powebsys.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pedido extends Contrato{

	private boolean aprovacao;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Deprecated
    protected Pedido() {super();}
	
	public Pedido(double preco, String duracao, boolean aprovacao, Cliente cliente, Veiculo veiculo) {
		super(preco,duracao, cliente,veiculo);
		this.aprovacao = aprovacao;
	}
	public boolean isAprovacao() {
		return aprovacao;
	}
	public void setAprovacao(boolean aprovacao) {
		this.aprovacao = aprovacao;
	}

	
	

}
