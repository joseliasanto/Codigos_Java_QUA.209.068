package principal;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		//* 1 Faca um programa que peça uma nota,entre zero e dez.
		//Mostre uma mensagem caso o valor seja ivalido e continue pedindo
		//até que o usuario informe um valor valido.	
		
		System.out.println("Digite um numero de 0 a 10");
		
		double  numero = leia.nextDouble();
		
		while(numero < 0 || numero > 10 ) {
		System.out.print("numero é invalido, digite novamente");
		numero = leia.nextDouble();
		
		// correçao
		}
		
		{
		
		String nota;
		System.out.println("Noa valida! Valor informado: " + nota); 
	       
		
		leia.close();  
		
		
			
		}
		
		

	}

}
