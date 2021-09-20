package implementacao;

import beans.Produto;
import br.com.aula3.util.Input;

public class ExecutarProdutoUtil {

	public static void main(String[] args) {

		// Usando pacote Util
		Produto listaCompra = new Produto(Input.texto("Descrição"),
										  Input.texto("Marca"),
										  Input.decimal("Valor"),
										  Input.logico("Promocao"));

		System.out.println(listaCompra.detalhe());
		
	}

}
