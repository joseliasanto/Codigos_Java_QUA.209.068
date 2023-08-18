package principal;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * um vetor de 20 posições mostrar os numeros inseridos somar os numeros inseridos
		 
		 */
		Scanner leia = new Scanner(System.in);
		int[] numeros = new int[5];
		int soma = 0;
		
		//i = iterador mesmo que o contador
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Entre o numero: ");
			numeros[i] = leia.nextInt();
			while(numeros[i] < 0)  {
				System.out.println("Numero invalido");
				System.out.println("Entre o numero");
				numeros[i] = leia.nextInt();
				
			}
			soma += numeros[i];
			
		}
		System.out.println("A soma dos numeros: " + soma);
		
		System.out.println("numeros digitados:" );
		for(int numero : numeros) {
			System.out.println(numero);
			
			
		}
		
		leia.close();
		

	}

}
