package br.com.aula10.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.aula10.beans.Veiculo;

public class VeiculoDao {
	
	List<Veiculo> bancoVeiculos = new ArrayList<Veiculo>();
    
  
	public VeiculoDao() {}
	
	public void incluir(Veiculo v) {
       bancoVeiculos.add(v);

	}
	
	public void alterar() {}
	
	public Veiculo consultar(String placa) {
		for (Veiculo elemento: bancoVeiculos) {
			if (elemento.getPlaca().equals(placa)) {
				return elemento;
			}
		}
		return null;
	}
	
	public void apagar(Veiculo v) {
		bancoVeiculos.remove(v);
	}
	
	public String listaVeiculos() {
		String resultado="";
		
		for (Veiculo elemento: bancoVeiculos) {
			resultado = resultado + "\nPlaca:" +elemento.getPlaca() + " - " + elemento.getModelo();
		}
		
		return resultado;
	}

}
