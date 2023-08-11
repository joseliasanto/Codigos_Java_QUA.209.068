package Projeto;

import java.util.Scanner;

public class AtividadeJava1 {

	public static void main(String[] args) {
	
		//1 Faça um programa que peça para o usuario entrar com um ano e dizer se esse ano é bissexto ou não;

		Scanner leia = new Scanner(System.in);
		//digitar um ano e dizer se é bissexto
		int ano =0;
		
		
		System.out.println("Entre com o ano para saber se ébissexto:");
		ano = leia.nextInt();
		
		
		if(ano %4 == 0 && ano % 100 != 0) {
			System.out.println("É um ano bissexto!");
		}
			else if(ano % 400 == 0) {
			
			}
				else {
					System.out.println("Não é um ano bissexto!");
					
					
					leia.close();
				}
				
		}
		
		

	}

}
