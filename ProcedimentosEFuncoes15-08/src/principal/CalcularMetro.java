package principal;

import java.util.Scanner;

public class CalcularMetro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crie um programa que receba os valores de
		//largura e comprimento do terreno
		//e informa quantos metros quadrados ele tem
		//utilize funçao.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a largura do terreno: ");
		double largura = sc.nextDouble();
		
		System.out.println("Digite o comprimento do tereno: ");
		double comprimento = sc.nextDouble();
		
		sc.close();
		
		System.out.print("A metragem do terreno é igual a: " + calcular(largura, comprimento) + "mª"); 
		}
	
	
		static double calcular(double largura, double comprimento) {
		return largura * comprimento;
		
		
		
		
		
		
	
				
				
				

	}

}
