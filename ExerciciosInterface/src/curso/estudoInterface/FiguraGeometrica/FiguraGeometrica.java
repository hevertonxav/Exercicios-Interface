package curso.estudoInterface.FiguraGeometrica;

public abstract class FiguraGeometrica {
	
	private String nome, cor;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String toString() {
		
		String info = "Figura geométrica: " + getNome() + "\n";
		info += "Cor: " + getCor();
		return info;
	
	}
	

}
