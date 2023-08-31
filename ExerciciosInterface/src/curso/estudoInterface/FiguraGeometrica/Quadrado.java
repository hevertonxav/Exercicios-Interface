package curso.estudoInterface.FiguraGeometrica;

public class Quadrado extends Figura2D  {
	
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		
		double area = Math.pow(lado, 2);
		return area;
	
	}
	

	
	
}
