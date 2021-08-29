package br.com.aula6.implementacao;

import javax.swing.JOptionPane;

import br.com.aula6.beans.Funcionario;
import br.com.aula6.beans.Gerente;
import br.com.aula6.beans.Medico;

public class executar {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario(1, "Cpf123456", "Antonio", "998989898", 1500, "01/01/2019", null, "ADM");
		
		Medico m = new Medico(2, "Cpf12121", "Dra. Ana", "9821231", 5000, "10/10/2009", null, "Pronto Atendimento", "CRM5052", "Pediatra");
		
		Gerente g = new Gerente(3, "Cpf525252", "Camila", "988525", 4500, "12/05/2005", null, "ADM", "ADM");
		
		JOptionPane.showMessageDialog(null, "Funcionario: " + f.getNome() + "\n\tSalario: "+ f.getSalario() + "\n\tParticipação: " + f.clacularParticipacaoNosLucros());
			
		JOptionPane.showMessageDialog(null, "Medico: " + m.getNome() + "\n\tSalario: "+ m.getSalario() + "\n\tParticipação: " + m.clacularParticipacaoNosLucros());

		JOptionPane.showMessageDialog(null, "Gerente: " + g.getNome() + "\n\tSalario: "+ g.getSalario() + "\n\tParticipação: " + g.clacularParticipacaoNosLucros());

	}

}
