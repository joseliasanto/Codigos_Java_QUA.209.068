package principal;

import java.util.Scanner;

public class AtividadeFuncao1508 {

	public static void main(String[] args) {
		
		
		//1.Fa�a um programa que receba um valor em real e converta para d�lares na cota��o atual,
		//fa�a o inverso tamb�m;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Valor em real para converter em dollar:R$  ");
		double Valorreal = sc.nextDouble();
		
		
		System.out.printf("valor em dolar �: $%.2f " , calculardollar(Valorreal));
		
		
		System.out.println("Digite o valor em dollar para converter em real:$ ");
		double Valordollar = sc.nextDouble();
		System.out.printf("O valor em real �/: R$%.2f" , calcularreal(Valordollar));
	}
	

		
		
		
		
		static double calculardollar(double Valorreal) {
			return Valorreal / 4.99;
			
		}
		static double calcularreal(double valordollar)  {
			return 4.99 * valordollar;
			
			
	
		
			
		
		 

	}

}
