package Projeto;

import java.util.Scanner;

public class AtividadeJava3 {

	public static void main(String[] args) {
		// Entrar com um numero e dizer se � par ou impar
		
		Scanner leia = new Scanner(System.in);
		
		int numero =0;
		System.out.println("Entre com um numero para saber se � par ou impar");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println(numero + " � par");
		}else {
				System.out.println(numero + " � impar");
				
			}
		
	
	 leia.close();

	}

}
