package beans;

public class Produto {
	private String descricao;
	private String marca;
	private float valor;
	
	// setters + getters
 
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		if (valor < 0) {
			this.valor=0;
		} else {
			this.valor = valor;
		}
	}

	public String detalhe() {
		return "Produto:" + descricao + " - Marca: " + marca;
	}
}
