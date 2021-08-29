package br.com.aula6.beans;

public class Funcionario extends Pessoa{

	private int id;
	// TODO nesse item vc pode utiliar float ao invez do string, pois sera necessario realizar operações matematicas
	// TODO caso mantenha como string, voce terá que fazer PARSE para converter 
	private float salario;
	private String dtadmissao;
	private String dtdemissao;
	private String deptartamento;
	
	
	public Funcionario() {}
	public Funcionario(int id, String cpf, String nome, String fone, float salario, String dtadmissao, String dtdemissao, String departamento) {
		super(cpf, nome, fone);
		this.id = id;
		this.salario = salario;
		this.dtadmissao = dtadmissao;
		this.dtdemissao = dtdemissao;
		this.deptartamento = departamento;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDeptartamento() {
		return deptartamento;
	}
	public void setDeptartamento(String deptartamento) {
		this.deptartamento = deptartamento;
	}
	@Override
	public String pesquisar(String texto) {
		return "Falta implementar a pesquisa";
	}
	@Override
	public String salvar() {
		return "Falta implementar o SALVAR";
	}
	
	public double clacularParticipacaoNosLucros() {
		return this.salario * 0.2f;
	}
}
