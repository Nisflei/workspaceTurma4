package br.com.aula4.beans;

public class ContaCorrente {
	private int agencia;
	private int conta;
	private float saldo;
	private boolean especial;
	private Cliente cliente;
	
	public ContaCorrente() {}
	
	public ContaCorrente(int agencia, int conta, float saldo, boolean especial, Cliente cliente) {
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
		this.especial = especial;
		this.cliente = cliente;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	
}
