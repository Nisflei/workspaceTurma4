package br.com.aula5.beans;

import br.com.aula5.interfaces.MetodoPadrao;

public abstract class Pessoa implements MetodoPadrao {

	private String cpf;
	private String nome;
	private String fone;
	
	public Pessoa() {}
	public Pessoa(String cpf, String nome, String fone) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.fone = fone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	
	public String registrar() {
		return "Sucesso";
	}
	
	// Implementação da INTERFACE MetodoPadra
	public String incluir() {
		return "Inclusao OK";
	}
	
	public String alterar() {
		return "Alteração Ok";
	}
	
	public String pesquisar(String texto) {
		return "Pesquisa_pessoa: " + texto;
	}
}
