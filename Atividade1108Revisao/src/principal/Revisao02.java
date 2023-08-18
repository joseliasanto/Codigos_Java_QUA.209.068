package principal;

import java.util.Scanner;

public class Revisao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*2) Um posto está vendendo combustíveis com a seguinte tabela de descontos:
		 * *até 20 litros, desconto de 3% por litro Álcool
		 * *acima de 20 litros, desconto de 5% por litro
		 * *até 20 litros, desconto de 4% por litro Gasolina, acima de 20 litros, desconto de 6% por litro
		 * Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado da
		 * seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se
		 * que o preço do litro da gasolina é R$ 5,80 e o preço do litro do álcool é R$ 3,90. 	}
		 
		 */
		Scanner leia = new Scanner(System.in);
		
		
		
		double valorGasolina =5.80;
		double valorAlcool = 3.90;
		
		//criar uma variavel para receber a quantidade de litros
		double quantidadeLitros = 0;
		
		//variavel para receber qual o tipo de combustivel
		char tipoCombustivel;
		
		//variavel total a pagar já com o desconto
		double totalAPagar = 0;
		
		//pedir para o usuario digitar a quantidade de litros
		
		do {
			System.out.println("Entre com o combustivel (A/G): ");
			tipoCombustivel = leia.next().charAt(0);
		}while(Character.toUpperCase(tipoCombustivel) != 'A'&& Character.toUpperCase(tipoCombustivel) != 'G');
		
		//pedir a quantidade de litros que foram abastecidos
		//validar quantidade de litros,, não pode ser zer e nem negativo
	
		do {
			System.out.print("Quantos litros foram abastecidos? ");
			quantidadeLitros = leia.nextDouble();
		}while(quantidadeLitros <= 0);
		
		//fazer o calculo do desconto com base na quantidade de litrosque foi abastecido e o tipo do combustivel
		
		if(tipoCombustivel == 'G') {
			if(quantidadeLitros <= 20) { 
				totalAPagar = (quantidadeLitros * valorGasolina);
				totalAPagar = totalAPagar -(totalAPagar * 0.04) ;
				System.out.print("Valor a ser pago com desconto: " + totalAPagar);
			}else {
				totalAPagar = (quantidadeLitros * valorGasolina);
				totalAPagar = totalAPagar -(totalAPagar * 0.06) ;
				System.out.print("Valor a ser pago com desconto: " + totalAPagar);
				
				
				
				
			}
		leia.close();
		
		
		}
		
		
			
			
			
			
			
			
		}

}
