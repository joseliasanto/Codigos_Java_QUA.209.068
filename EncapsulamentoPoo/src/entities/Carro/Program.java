package entities.Carro;

import java.util.Scanner;

public class Program {
	
	private static String velocidade;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Carro carro = new Carro();
		
		System.out.println("Qual o carro: ");
		carro.setNome(sc.next());
		
		
		System.out.println("Qual o modelo: ");
		carro.setModelo(sc.next());
		
		System.out.print("Qual a cor ");
		carro.setCor(sc.next());
		
		System.out.print("Qual o ano de fabricacao: ");
		carro.setAnoFabricacao(sc.next());
		
		System.out.print("Qual o cambio: ");
		carro.setCambio(sc.next());
		
		System.out.print("Qual a velocidade atual: ");
		carro.setVelocidade(sc.next());
		
		
		carro.getdadosVeiculos();
		
		
		
		
		
		
		
		

		sc.close();
	}

}
