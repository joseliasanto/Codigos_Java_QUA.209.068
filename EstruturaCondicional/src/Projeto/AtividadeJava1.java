package Projeto;

import java.util.Scanner;

public class AtividadeJava1 {

	public static void main(String[] args) {
	
		//1 Fa�a um programa que pe�a para o usuario entrar com um ano e dizer se esse ano � bissexto ou n�o;

		Scanner leia = new Scanner(System.in);
		//digitar um ano e dizer se � bissexto
		int ano =0;
		
		
		System.out.println("Entre com o ano para saber se �bissexto:");
		ano = leia.nextInt();
		
		
		if(ano %4 == 0 && ano % 100 != 0) {
			System.out.println("� um ano bissexto!");
		}
			else if(ano % 400 == 0) {
			
			}
				else {
					System.out.println("N�o � um ano bissexto!");
					
					
					leia.close();
				}
				
		}
		
		

	}

}
