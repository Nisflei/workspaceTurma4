package br.com.aula8.implementacao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import br.com.aula8.util.Input;

public class ExecutarSetControleAcesso {

	public static void main(String[] args) {

		boolean resp = true;
		String cracha, tipo;

		Set<String> controleAcesso = new HashSet<String>();

		while (resp == true) {
			System.out.println(controleAcesso);

			tipo = Input.texto("Diginte <E>ntrada ou <S>aida");

			if (tipo.equalsIgnoreCase("E")) {
				cracha = Input.texto("Leitor Cracha: ");

				if (!controleAcesso.contains(cracha)) {
					Input.mensagem("Bem Vindo! Acesso Liberado");
					controleAcesso.add(cracha);
				} else {
					Input.mensagem("Entrada ja foi registrada para esse cracha - Acesso Bloqueado");
				}
			}
			if (tipo.equalsIgnoreCase("S")) {
				cracha = Input.texto("Leitor Cracha: ");

				if (!controleAcesso.contains(cracha)) {
					Input.mensagem("Entrada não registrada -  Acesso bloqueado para sair");
				} else {
					Input.mensagem("Obrigado pela Visita");
					controleAcesso.remove(cracha);
				}

			}

		}
	}
}
