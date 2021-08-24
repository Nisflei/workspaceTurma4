package br.com.consulta.implementacao;

import br.com.consulta.beans.Agendamento;
import br.com.consulta.beans.Medico;
import br.com.consulta.beans.Paciente;
import br.com.consulta.util.Input;

public class ExecutarConsulta {

	public static void main(String[] args) {
		
		String opcao;
		
		Paciente pac = new Paciente();
		
		pac.setNome(Input.texto("Paciente:"));
		pac.setCpf(Input.texto("Cpf:"));
		pac.setFone(Input.texto("Celular"));
		
		System.out.println(pac.apresentar());
		// 
		
		Medico med1 = new Medico(Input.texto("Crm1:"),Input.texto("Medico1:"));
		Medico med2 = new Medico(Input.texto("Crm2:"),Input.texto("Medico2:"));
		
		System.out.println(med1.apresentar());
		System.out.println(med2.apresentar());
		//
		
		Agendamento agenda = new Agendamento();
		//Agendamento agenda = new Agendamento(Input.texto("data:"), Input.texto("Hora:"), pac, Input.decimal("valor:"), med1);


		
		opcao = Input.texto("Escolha o medico 1="+ med1.getNome() + " 2=" + med2.getNome());

		agenda.setData(Input.texto("data:"));
		agenda.setHora(Input.texto("Hora:"));
		agenda.setPaciente(pac);
		agenda.setValorConsulta(Input.decimal("valor:"));
	
		if (opcao.equalsIgnoreCase("1")) {
			agenda.setMedico(med1);
		} else {
		    agenda.setMedico(med2);;
		}
		
		System.out.println(agenda.agendar());
		System.out.println(agenda.mostrar());
		
		System.out.println(agenda.cancelar());
		System.out.println(agenda.mostrar());
		
		
		
	}

}
