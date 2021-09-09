package br.com.aula10.businessObject;

import br.com.aula10.beans.Veiculo;
import br.com.aula10.dao.VeiculoDao;

public class VeiculoBo {
	
	VeiculoDao dao = new VeiculoDao();
		
	public void adicionar(Veiculo v) {
		if (v.getPotencia() < 50) {
			System.out.println("Somente é permitido veiculo com potencia >50 ");
		} else {
			dao.incluir(v);
		}
	}
}
