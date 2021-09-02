package br.com.aula8.implementacao;

import java.util.HashSet;
import java.util.Set;

public class ExecutarSET {

	public static void main(String[] args) {

		Set<String> h_set = new HashSet<String>();
		
		// adicionando elementes
		h_set.add("azul");
		h_set.add("verde");
		h_set.add("branco");
		h_set.add("preto");
		h_set.add("amarelo");

		h_set.add("azul"); /// esse não entra pois é repetido
				
		// lista de Cores
		System.out.println(h_set);
		
		for (String conteudo: h_set) {
			System.out.println(conteudo);
		}
		// tem conteudo ? 
		System.out.println("Esta vazio:" +h_set.isEmpty());
		
		// procurar elemento
		System.out.println("Tem a cor verde: " + h_set.contains("verde"));
		System.out.println("Tem a cor cinza: " + h_set.contains("cinza"));

		// remover elemento
		h_set.remove("verde");
		System.out.println(h_set);
		
	}

}
