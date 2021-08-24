package br.com.consulta.beans;

public class Paciente {
	private String nome;
	private String cpf;
	private String fone;
	
	public Paciente() {};
	
	public Paciente(String nome, String cpf, String fone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.fone = fone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}
	
	public String apresentar() {
		return "Nome:" + nome + " cpf:" + cpf + " Celular:" + fone;
	}
	
	
}
