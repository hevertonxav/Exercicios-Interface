package curso.estudoInterface.FiguraGeometrica;

public class Piramide extends Figura3D{
	
	private double altura, arestaBase, apotema;
	private int numPoliBase;
	private Figura2D areaBase;

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getArestaBase() {
		return arestaBase;
	}

	public void setArestaBase(double arestaBase) {
		this.arestaBase = arestaBase;
	}

	public double getApotema() {
		return apotema;
	}

	public void setApotema(double apotema) {
		this.apotema = apotema;
	}
	
	public int getNumPoliBase() {
		return numPoliBase;
	}

	public void setNumPoliBase(int numPoliBase) {
		this.numPoliBase = numPoliBase;
	}

	public Figura2D getAreaBase() {
		return areaBase;
	}

	public void setAreaBase(Figura2D areaBase) {
		this.areaBase = areaBase;
	}

	
	@Override
	public double calcularArea() {
		
		if(areaBase != null) {
			
			//area total do sólido geométrico
		    double areaTotal = numPoliBase*((arestaBase*apotema)/2) + areaBase.calcularArea();
		    return areaTotal;
		
		} else {
			
			return 0;
			
		}
	}

	
	@Override
	public double calcularVolume() {
		
		if(areaBase != null) {
		
			double vol = (areaBase.calcularArea() *altura)/3;
		    return vol;
		
		} else {
			
			return 0;
			
		}
	
	}
	
	

}
