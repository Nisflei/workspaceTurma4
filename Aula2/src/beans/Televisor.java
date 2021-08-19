package beans;

public class Televisor {	
	private int canal;
	private int volume;
	private boolean ligado;
	
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	public int getVolume() {
		return volume;
	}
	private void setVolume(int volume) {
		this.volume = volume;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	// Metodos
	
	public void aumentarVolume() {
		if (volume < 10)
		   //volume = volume +1;
			setVolume(this.volume+1);
	}
	
	public void reduzirVolume() {
		volume = volume--;
	}
	
	public String mostrarStatus() {
		return "Canal: " + canal + " volume: " + volume + " Ligado: " + ligado;
	}
	
}
