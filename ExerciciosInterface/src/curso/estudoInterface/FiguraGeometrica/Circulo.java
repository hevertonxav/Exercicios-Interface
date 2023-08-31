package curso.estudoInterface.FiguraGeometrica;

public class Circulo extends Figura2D {

	private double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		
		double area = Math.PI*Math.pow(raio, 2);
		return area;
	
	}

}
