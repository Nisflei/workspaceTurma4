package br.com.aula5.implementacao;

import br.com.aula5.beans.Funcionario;
import br.com.aula5.beans.Medico;
import br.com.aula5.beans.Paciente;
import br.com.aula5.beans.Pessoa;

public class ExecutaPessoa {

	public static void main(String[] args) {
		
		/*Pessoa p = new Pessoa("1234536","Nisflei","98989898");
	    
		System.out.println("Pessoa: " +  p.getNome());
		System.out.println(p.pesquisar("Procura Nisflei"));
		*/
		
		Medico m = new Medico( "CRM12345", "Pediatra","123453679","Dra. Ana","99999989");
		
		//System.out.println(m.registrar());
		System.out.println("Medico: "+ m.getNome() +" - " + m.getEspecialidade());
		System.out.println(m.pesquisar("Procura Medico"));
		
		
		Funcionario f = new Funcionario("123456789", "FuncionaPadrão", "998989989", 5000f, "10/01/2020", null);

		System.out.println("Funcionario: " + f.getNome() + " Dtadm: " + f.getDtadmissao() + " Salario:" + f.getSalario());
		System.out.println(f.pesquisar("Funcionario"));

		
		Paciente pa= new Paciente("1234657","Antonio","989898");
		System.out.println("Paciente: " + pa.getNome() + " cpf:" + pa.getCpf());
		System.out.println(pa.pesquisar("Paciente"));
	}

}
