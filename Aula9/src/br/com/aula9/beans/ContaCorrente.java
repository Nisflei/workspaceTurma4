package br.com.aula9.beans;

public class ContaCorrente {

	private double saldo;

	public ContaCorrente(double saldo) {
		super();
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public double getSaldoComLimite() {
		return this.saldo;
	    // falta implementar
	}
	
	public boolean sacar (double valor) {
		return true;
	}
	
	public void depositar(double valor) {
		
	}
}

