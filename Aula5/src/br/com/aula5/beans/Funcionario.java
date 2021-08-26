package br.com.aula5.beans;

public class Funcionario extends Pessoa{

	private float salario;
	private String dtadmissao;
	private String dtdemissao;
	
	public Funcionario() {}
	public Funcionario(String cpf, String nome, String fone, float salario, String dtadmissao, String dtdemissao) {
		super(cpf, nome, fone);
		this.salario = salario;
		this.dtadmissao = dtadmissao;
		this.dtdemissao = dtdemissao;
	}
	
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public String getDtadmissao() {
		return dtadmissao;
	}
	public void setDtadmissao(String dtadmissao) {
		this.dtadmissao = dtadmissao;
	}
	public String getDtdemissao() {
		return dtdemissao;
	}
	public void setDtdemissao(String dtdemissao) {
		this.dtdemissao = dtdemissao;
	}
	// metodos 
	public void cadastrar() {
		//
	}
	public void alteracao() {
		//
	}
	public void pesquisar() {
		//
	}
	
	
}
