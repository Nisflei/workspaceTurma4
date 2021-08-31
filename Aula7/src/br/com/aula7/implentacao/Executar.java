package br.com.aula7.implentacao;

import javax.swing.JOptionPane;

import br.com.aula7.beans.Aluno;

public class Executar {

	public static String pesquisa(String vetorParaPesquisar[], int tamanho, String texto) {
		String resultado="Não Localizado" ;
		for (int i=0;i<tamanho;i++) {
			if (vetorParaPesquisar[i].equalsIgnoreCase(texto)){
				resultado = vetorParaPesquisar[i] + " posição:" + i;
			}
		}
		return resultado;
	}

	public static String pesquisa(Aluno vetorParaPesquisar[], int tamanho, String texto) {
		String resultado="Não Localizado" ;
		for (int i=0;i<tamanho;i++) {
			if (vetorParaPesquisar[i].getNome().equalsIgnoreCase(texto)){
				resultado = vetorParaPesquisar[i].getNome() + " posição:" + i;
			}
		}
		return resultado;
	}

	public static void main(String[] args) {
		String textoProcura;
		
		//vetor simples de String
		String nomeVetor[] = {"Beatriz","Maria","Ana"}; 
		
		// apresentar informação de 1 elemento
		System.out.println(nomeVetor[0]);
		System.out.println(nomeVetor);
		
		
		// usando o metodo pesquisa
		textoProcura = JOptionPane.showInputDialog("Informe o nome de Pesquisa:");
		System.out.println("Pesquisa String: " + pesquisa(nomeVetor, 3, textoProcura));
		
		
		// vetor simples de Objetos
		Aluno[] alunosVetor = new Aluno[3];
		
		alunosVetor[0] = new Aluno("Pedro", 8, 50, 20);
		alunosVetor[1] = new Aluno("Ana", 9, 5, 21);
		alunosVetor[2] = new Aluno();
		alunosVetor[2].setNome("Maria");
		alunosVetor[2].setIdade(22);
		alunosVetor[2].setMedia(10);
		
		// usando o metodo pesquisa
		textoProcura = JOptionPane.showInputDialog("Informe o nome de Pesquisa:");
		System.out.println("Pesquisa Objeto: " + pesquisa(alunosVetor, 3, textoProcura));
		
	}

}
