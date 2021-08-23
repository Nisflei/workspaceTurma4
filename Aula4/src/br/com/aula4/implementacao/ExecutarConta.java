package br.com.aula4.implementacao;

import br.com.aula4.beans.Cliente;
import br.com.aula4.beans.ContaCorrente;

public class ExecutarConta {

	public static void main(String[] args) {
		
		// 1o. capturar dados do cliente 
		
		Cliente cli = new Cliente("Nisflei", "Rua que Sobe,0", "123.120.223-11", "10.123-4", "99998989");

		// 2o. Gerar conta corrente
		
		ContaCorrente cc = new ContaCorrente();
		
		cc.setAgencia(5050);
		cc.setConta(123456);
		cc.setSaldo(100.0f);
		cc.setCliente(cli);
		
		System.out.println("Ag:" +cc.getAgencia() + " cc:"+cc.getConta() + " saldo:"+cc.getSaldo());
		System.out.println("cpf:" + cc.getCliente().getCpf() + " Nome:" + cc.getCliente().getNome());

	}

}
