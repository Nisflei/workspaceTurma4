package br.com.consulta.beans;

public class Agendamento {


	private String data;
	private String hora;
	private Paciente paciente;
	private float valorConsulta;
	private Medico medico;
	
	public Agendamento() {}
	public Agendamento(String data, String hora, Paciente paciente, float valorConsulta, Medico medico) {
		super();
		this.data = data;
		this.hora = hora;
		this.paciente = paciente;
		this.valorConsulta = valorConsulta;
		this.medico = medico;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public float getValorConsulta() {
		return valorConsulta;
	}
	public void setValorConsulta(float valorConsulta) {
		this.valorConsulta = valorConsulta;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	
	public String agendar() {
		if (paciente.getNome().isEmpty() || medico.getNome().isEmpty()) {
			return "Não é possivel agendar com dados pendentes";
		} 
		return "Sucesso";
	}
	
	public String cancelar() {
		this.data="";
		this.hora="";
		return "Sucesso";
	}
	
	public String mostrar() {
		return "Data:" + data + " hora:"+ hora + " Paciente:" + paciente.getNome() + " Medico:" + medico.getNome(); 
	}
	
	
	
		
}
