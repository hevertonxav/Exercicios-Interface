package curso.estudoInterface.FiguraGeometrica;

public class Cilindro extends Figura3D {
	
	private double raio, altura;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	
	@Override
	public double calcularArea() {
		
		//area total do sólido geométrico
		double areaTotal = 2*Math.PI*raio*(raio + altura);
		return areaTotal;
	
	}

	@Override
	public double calcularVolume() {
		
		double vol = Math.pow(raio, 2)*Math.PI*altura;
		return vol;
	
	}

	
	
	
	
	
	
}
