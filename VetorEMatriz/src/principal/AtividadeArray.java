package principal;

public class AtividadeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//*Faça um programa que mostre os índices de um array de 100 posições;
		
		int array = 10;
		
		int[] numeros = new int[100];
		
		
		System.out.println("fora do for:" + numeros[0]);
		
		
		for(int contador = 0; contador < numeros.length; contador++) {
			System.out.println("Dentro do for: " + numeros[contador]);
			
			for(int numero : numeros) {
				System.out.println(numero);
			}
			
			
			
				
			
		}
			
			

	}

}

	
