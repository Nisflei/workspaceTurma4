package implementacao;

import beans.Produto;

public class ExecutarProduto {

	public static void main(String[] args) {
		
		
		Produto micro = new Produto("Dell","Notebook 15x");
		System.out.println(micro.detalhe());

		Produto tv = new Produto();
		tv.setDescricao("UltraSlin");
		tv.setMarca("Sansung");
		System.out.println(tv.detalhe());

		Produto impressora = new Produto("HP Deskink", 250.0f);
		
		System.out.println(impressora.detalhe());
		System.out.println(impressora.getValor());
		
		Produto game = new Produto("PS5", "Sony", 4000.0f);
		
		System.out.println(game.detalhe());
		System.out.println(game.getValor());
		
		
		
		
	}

}
