/*
1)Escreva uma classe FiguraGeometrica com atributos
nome e cor.Escreva uma classe Figura2D e uma classe
Figura3D.Ambas classes Figura2D e Figura3D são
subclasses da classe FiguraGeometrica. Crie ainda
as classes Circulo, Quadrado e Triangulo que estendem
a classe Figura2D e crie também as classes Cubo e
Cilindro e Piramide que estendem a classe Figura3D.

2)Escreva a interface DimensaoSuperficial que contém 
o método calcularArea. Escreva a interface DimensaoVolumetrica 
que contém o método calcularVolume. Aplique a interface 
DimensaoSuperficial em todas as subclasses de Figura2D e 
Figura3D e aplique a interface DimensaoVolumetrica nas subclasses 
de Figura3D, implementando seus métodos de acordo com as regras 
de cada figura geométrica (crie os atributos necessários).

3)Crie pelo menos uma instância de cada classe e adicione em um
array do tipo FiguraGeometrica. Itere esse array, imprimindo na
tela a área e o volume (quando aplicável). Dica: você pode usar
o operador instaceOf.
*/

package curso.estudoInterface.FiguraGeometrica;

public class Main {

	public static void main(String[] args) {
		
		Quadrado fg1 = new Quadrado();
		
		fg1.setNome("quadrado");
		fg1.setCor("amarelo");
		fg1.setLado(4);
		
		Triangulo fg2 = new Triangulo();
		
		fg2.setNome("triângulo");
		fg2.setCor("verde");
		fg2.setBase(3);
		fg2.setAltura(4);
		
        Circulo fg3 = new Circulo();
		
		fg3.setNome("círculo");
		fg3.setCor("azul");
		fg3.setRaio(7);
		
        Cubo fg4 = new Cubo();
		
		fg4.setNome("cubo");
		fg4.setCor("rosa");
		fg4.setLado(10);
		
        Piramide fg5 = new Piramide();
		
		fg5.setNome("pirâmide");
		fg5.setCor("cinza");
		fg5.setNumPoliBase(4);
		fg5.setAltura(4);
		fg5.setArestaBase(6);
		fg5.setApotema(5);
		fg5.setAreaBase(fg1);
		
	    Cilindro fg6 = new Cilindro();
			
	    fg6.setNome("cilindro");
	    fg6.setCor("preto");
	    fg6.setAltura(18);
	    fg6.setRaio(6);
	    
	    FiguraGeometrica[] figuras = new FiguraGeometrica[6];
	    figuras[0] = fg1;
	    figuras[1] = fg2;
	    figuras[2] = fg3;
	    figuras[3] = fg4;
	    figuras[4] = fg5;
	    figuras[5] = fg6;
	    
	    for(FiguraGeometrica figura : figuras) {
	    	
	    	System.out.println(figura);
	    	
	    	if(figura instanceof Figura2D) {
	    		
	    		Figura2D f2d = (Figura2D) figura;
	    		System.out.println(f2d.calcularArea());
	    		System.out.println(" ");

	        }
	    	
            if(figura instanceof Figura3D) {
	    		
	    		Figura3D f3d = (Figura3D) figura;
	    		System.out.println(f3d.calcularArea());
	    		System.out.println(f3d.calcularVolume());
	    		System.out.println(" ");
	    		
            }
	    }


	    
			
		
	}

}
