package br.com.aula9.implementacao;

import br.com.aula9.beans.ContaCorrente;

public class executarContaCorrente {

	public static void main(String[] args) {
        boolean resp=true;
		ContaCorrente cc = new ContaCorrente(100);
		
		while (resp==true) {
			// obter o valor via tela
			// fazer tratamento para valores errados
			// deve continuar no laço... 
			cc.depositar(0);
			cc.sacar(0);
			
		}
	}

}
