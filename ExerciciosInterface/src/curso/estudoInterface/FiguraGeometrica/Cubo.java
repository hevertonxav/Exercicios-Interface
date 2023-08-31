package curso.estudoInterface.FiguraGeometrica;

public class Cubo extends Figura3D  {
	
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double calcularArea() {
	
		//area total do sólido geométrico
	    double areaTotal = 6*Math.pow(lado, 2);
	    return areaTotal;
	
	}

	
	@Override
	public double calcularVolume() {
		
		double vol = Math.pow(lado, 3);
		return vol;
	
	}

	
	
}
