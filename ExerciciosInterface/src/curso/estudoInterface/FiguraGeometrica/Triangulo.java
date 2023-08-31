package curso.estudoInterface.FiguraGeometrica;

public class Triangulo extends Figura2D  {
	
	private double base, altura;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		
		double area = (base*altura)/2;
		return area;
	
	}

	
}
