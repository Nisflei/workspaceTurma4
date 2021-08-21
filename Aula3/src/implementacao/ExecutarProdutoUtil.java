package implementacao;

import beans.Produto;
import util.Input;

public class ExecutarProdutoUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produto listaCompra = new Produto(Input.texto("Descrição"),
										  Input.texto("Marca"),
										  Input.decimal("Valor"),
										  Input.logico("Promocao"));

		System.out.println(listaCompra.detalhe());
		
	}

}
