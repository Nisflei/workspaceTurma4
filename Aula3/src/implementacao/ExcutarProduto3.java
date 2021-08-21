package implementacao;

import javax.swing.JOptionPane;

import beans.Produto;

public class ExcutarProduto3 {

		public static String texto(String msg) {
			return JOptionPane.showInputDialog(msg);
		}
		
		public static float decimal(String msg) {
			return Float.parseFloat(texto(msg));
			//return Float.parseFloat(JOptionPane.showInputDialog(msg));
		}
		
		public static boolean logico(String msg) {
			if (JOptionPane.showConfirmDialog(null, msg,"Pergunta",JOptionPane.YES_NO_OPTION) == 0) {
				return true;
			}
			return false;
		}
		
			
		
		public static void main(String[] args) {

			
			Produto note = new Produto(texto("Descricao"),
									   texto("Marca"),
									   decimal("Preço"),
									   logico("Promoçao?"));
			System.out.println(note.detalhe());
			
			

		}

	}

