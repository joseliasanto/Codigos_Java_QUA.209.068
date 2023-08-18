package atividade03;

public class Triangulo {
	
	public int ladoA;
	public int ladoB;
	public int ladoC;
	
	public void obterTipoTriangulo() {
		if(ladoA == ladoB && ladoA == ladoC)  {
			System.out.println("Triangulo equilatero");
		}else if(ladoA == ladoB || ladoA ==ladoC|| ladoB == ladoC) {
			System.out.println("triangulo esóceles");
		}else{
			System.out.println("trianguloescaleno");
			
		}
	}
}
