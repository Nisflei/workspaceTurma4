package br.com.aula9.excecoes;

public class meuControleException extends Exception {

	public meuControleException(String msg, Exception e) {
		super(msg,e);
		// agora é minha implementação... // 
		System.out.println("=========== Meu Exception ==========");
		System.out.println(msg);
	}
}
