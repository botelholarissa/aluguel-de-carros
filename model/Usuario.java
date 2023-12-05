package com.aluguelVeiculos.powebsys.model;
import javax.persistence.*;
@Entity
public class Usuario {

	
	private String nome;
    private String telefone;
    private String email;
    private String senha;
    private String confSenha;
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
    protected Usuario() {}
    
    public Usuario(String nome,String telefone, String email,String senha,String confSenha) {
    	this.setConfSenha(confSenha);  
    	this.setSenha(senha);
    	this.setEmail(email);
    	this.setTelefone(telefone);
    	this.setNome(nome);
    	}
    public boolean efeutarLogin(String email, String senha) {
    	boolean logar=false;
    	if(email.equals(this.email) && senha.equals(this.senha)) {
    		logar = true;
    	}
    	return logar;
    }
    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getConfSenha() {
		return confSenha;
	}

	public void setConfSenha(String confSenha) {
		this.confSenha = confSenha;
	}

	public String getNome() {
         return nome;
    }

    public void setNome(String nome) {
         this.nome = nome;
    }

   

    public String getTelefone() {
         return telefone;
    }

    public void setTelefone(String telefone) {
         this.telefone = telefone;
    }
}
