package principal;

import java.util.Scanner;

public class AtividadeArray02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//*Faça um programa que peça quantidade x de nomes,insira os nomes e mostre os nomes inseridos;
		
		Scanner sc = new Scanner (System.in);
		
		int quantidade = 0;
		
		System.out.println("Digite a quantidade de nomes que você deseja inserir: ");
		 quantidade = sc.nextInt();
		
		
		
		String [] nomes = new String [quantidade];
		
		for (int contador = 0; contador < nomes.length; contador++) {
			System.out.println("Digite o nome: ");
			nomes[contador] = sc.nextLine();
		}
		for(String nome : nomes) {
			System.out.println("Digite o nome: ");
		  }
         for(String nome : nomes)  {
        	 System.out.println(nomes);
         }
         
         sc.close();
         
	
}
}
	

       
