package br.com.aula10.implementacao;

import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.aula10.beans.Veiculo;
import br.com.aula10.businessObject.VeiculoBo;
import br.com.aula10.dao.VeiculoDao;

public class ExecutarVeiculo {

	public static void main(String[] args) {
		
		VeiculoDao vdao = new VeiculoDao();
		VeiculoBo vbo = new VeiculoBo();

		Scanner s=new Scanner(System.in);
		char opc= ' ';
		String placa;
		
		do {
			System.out.println("Controle de Veiculo \n");
			System.out.println("Menu: <C>reat  <R>ead  <U>pdate   <D>elete   <L>ist   <E>xit");
			System.out.println("opc:");
			opc = s.nextLine().toUpperCase().charAt(0);
			
			switch (opc) {
			
			case 'C':
				Veiculo v = new Veiculo();
				v.setPlaca(JOptionPane.showInputDialog("Placa:"));
				v.setModelo(JOptionPane.showInputDialog("Modelo:"));
				v.setPotencia(Float.parseFloat(JOptionPane.showInputDialog("Potencia:")));
				
				vbo.adicionar(v);
				//vdao.incluir(v);
				break;
			case 'R':
				Veiculo vconsulta = new Veiculo();
				placa = JOptionPane.showInputDialog("Placa para pesquisa:");
				vconsulta = vdao.consultar(placa);
				JOptionPane.showMessageDialog(null,"========= Dados do Veiculo ========= \n"
						+"\nPlaca:" + vconsulta.getPlaca()
						+"\nModelo:" + vconsulta.getModelo());
				break;
			case 'U':
				System.out.println("alterar");
				break;
			case 'D':
				placa = JOptionPane.showInputDialog("Placa para remover:");
				vconsulta = vdao.consultar(placa);
				vdao.apagar(vconsulta);
				break;
			case 'L':
				System.out.println(vdao.listaVeiculos());
				break;
			}
			
		} while (opc!='E');
		
		System.out.println("Funcionou..");
		
	}

}
