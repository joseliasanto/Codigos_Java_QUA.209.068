package principal;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	
	/*
	 * faça um programa que recebea a altura de 10 pessoas e mostre a media da altura delas.
	 */
	 
		double media = 0;
		double altura = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite  a altura: " + (i + 1) + " pessoa: ");
			altura = sc.nextDouble();
			media +=altura;
		}
		media = media / 10;
		System.out.printf(" A media da altura de 10 pessoas é igual a: %.2fcm:", media);
		

	}

}
