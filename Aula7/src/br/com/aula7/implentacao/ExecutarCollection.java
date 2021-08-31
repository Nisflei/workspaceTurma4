package br.com.aula7.implentacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.aula7.beans.Aluno;

public class ExecutarCollection {

	
	public static void main(String[] args) {
		String textoProcura;
		
		List<String> nomes = new ArrayList<String>();
		
		nomes.add("Beatriz");
		nomes.add("Pedro");
		nomes.add("Ana");
		
		System.out.println("tamanho:" + nomes.size());
		System.out.println(nomes);
		
		Collections.sort(nomes);
		System.out.println("Lista Organizado: " + nomes);
		
		System.out.println("posiçao 0:" + nomes.get(2));
		
		// pesquisa na ArrayList
		textoProcura = JOptionPane.showInputDialog("Informe o nome de Pesquisa:");
		if (nomes.indexOf(textoProcura)>=0) {
			System.out.println("Pesquisa String: " + nomes.get(nomes.indexOf(textoProcura)));
		} else {
			System.out.println("Não Localizado ");
		}
		
		
		
		// Agora é classe
	    System.out.println(" \\n\\n\\n Agora usando Classe");
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		Aluno a1 = new Aluno("Pedro", 8, 50, 20);
		Aluno a2 = new Aluno("Ana", 9, 5, 21);
		Aluno a3 = new Aluno("Maria", 8, 0, 18);
		
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		System.out.println("tamanho:" + alunos.size());
		System.out.println("Elemento 1:" + alunos.get(1).getNome());

		for (Aluno alunoElemento: alunos) {
			System.out.println(alunoElemento.getNome() + " idade:" + alunoElemento.getIdade());
		}
		
		Collections.sort(alunos);
		System.out.println("\n\n Lista em ordem Idade");
		for (Aluno alunoElemento: alunos) {
			System.out.println(alunoElemento.getNome() + " idade:" + alunoElemento.getIdade());
		}
		
	}

}
