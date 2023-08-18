package atividade01;

import java.util.Scanner;

public class Progran {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Terreno terreno1 = new Terreno();
		
		System.out.println("Digite a largura: ");
		terreno1.largura = sc.nextDouble();
		
		System.out.println("Digite o comprimento: ");
		terreno1.comprimento = sc.nextDouble();
		
		System.out.println(terreno1.calcularMetragem());
		
		sc.close();
		
		

	}
	
}
