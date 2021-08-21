package implementacao;

import beans.Produto;

public class ExecutarProduto {

	public static void main(String[] args) {
		
		Produto baton = new Produto();
		
		
		baton.setDescricao("Avon Rosa");
		baton.setMarca("Avon");
		baton.setValor(50.0f);
		
		System.out.println(baton.detalhe());
		System.out.println("Valor: " + baton.getValor());
		
		
		Produto mouse = new Produto();
		
		mouse.setDescricao("Dell touch");
		mouse.setMarca("Dell");
		
		// mouse.valor = -150.0f; problema
		
		mouse.setValor(-150.0f);
		
		System.out.println(mouse.detalhe());
		System.out.println("Valor: " + mouse.getValor());
		System.out.println(mouse.getDescricao());
	}

}
