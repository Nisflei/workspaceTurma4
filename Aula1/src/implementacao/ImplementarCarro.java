package implementacao;

import beans.CarroFormula1;

public class ImplementarCarro {

	public static void main(String[] args) {
		
		CarroFormula1 carro = new CarroFormula1();
		
		carro.equipe = "Ferrari";
		
		carro.cor = "vermelho"; 
		
		System.out.println("Carro-Equipe: " + carro.equipe );
		

		
	}

}
