package br.com.aula8.implementacao;

import java.util.HashMap;
import java.util.Map;

public class ExecutarMAP {

	public static void main(String[] args) {
		Map<Integer,String> h_map = new HashMap<Integer,String>();
		
		// adicionando elementes
		h_map.put(10,"azul");
		h_map.put(11,"verde");
		h_map.put(12,"branco");
		h_map.put(13,"preto");
		h_map.put(14,"amarelo");

		h_map.put(13,"azul"); ///substitui o valor da chave atual 

		// lista de Cores
		System.out.println(h_map.entrySet());
		System.out.println(h_map.keySet());
		System.out.println(h_map.values());
		
		for (Map.Entry conteudo : h_map.entrySet()) {
			System.out.println(conteudo.getKey() + "  "+conteudo.getValue());
		}
		
		// procurar elemento
		System.out.println("Tem a chave 10: " + h_map.containsKey(10));
		System.out.println("Tem a cor cinza: " + h_map.containsValue("cinza"));

		// Obter valo da chave
		System.out.println(h_map.get(12));
		
		//Remover chave
		System.out.println(h_map.remove(12));
		System.out.println(h_map.entrySet());
		
	}

}
