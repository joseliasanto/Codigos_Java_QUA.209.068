package atividade03;

import java.util.Scanner;

public class Programa {
	
	//Faça um programa que receba 3 valores e indique/retorne que tipo de triangulo ele pode ser;

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Triangulo triangulo = new Triangulo();
		
		System.out.println("Entre com o valor do lado B: ");
		triangulo.ladoB = sc.nextInt();
		
		System.out.println("Entre com o valor do lado C: ");
		triangulo.ladoC = sc.nextInt();
		
		sc.close();
		
		
		
		
		
		
		

	}

}
