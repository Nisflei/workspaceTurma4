package br.com.aula9.implementacao;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.aula9.excecoes.meuControleException;

public class executarExceptionClass {

	public static void main(String[] args) throws meuControleException {
		
		Scanner s = new Scanner(System.in);
		
		try {
			System.out.println("Dig. Valo1");
			int vl1 = s.nextInt();
			System.out.println("Dig. Valor2");
			int vl2 = s.nextInt();
			
			System.out.println("Soma: " + (vl1/vl2));
			
		} catch (InputMismatchException ex) {
			System.out.println("meu.. :(  vc digitou uma letra no lugar de numero.");
		} catch (Exception ex) {
			throw new meuControleException("Erro no valor", ex) ;
		} finally {
			System.out.println("Rotina Finalizada");
		}
		

	}

}
