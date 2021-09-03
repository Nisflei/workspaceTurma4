package br.com.aula9.implementacao;

import java.util.Scanner;

public class ExecutarExcecoes {

	public static void main(String[] args) {
		/*
		Scanner s = new Scanner(System.in);
		
		try {
			System.out.println("Dig. Valo1");
			int vl1 = s.nextInt();
			System.out.println("Dig. Valor2");
			int vl2 = s.nextInt();
			
			System.out.println("Soma: " + (vl1+vl2));
			
		} catch (Exception ex) {
			System.out.println("Erro");
			ex.printStackTrace();
			//System.out.println(ex.getClass());
		}
		
		*/
		Scanner ss = new Scanner(System.in);
		
		String senha = "12345";
		try {
			System.out.println("Dig. palavra SECRET:");
			String palavraSecreta = ss.nextLine();

			if (!senha.equals(palavraSecreta)) {
				throw new Exception("Sua senha esta Incorreta..!");
				//System.out.println("Senha invalida ");
			}
			System.out.println("Acesso Liberado.!");
			
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			//ex.printStackTrace();
			//System.out.println(ex.getClass());
		}
		
	}
}
