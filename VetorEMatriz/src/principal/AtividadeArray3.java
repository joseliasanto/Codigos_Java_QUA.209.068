package principal;

import java.util.Scanner;

public class AtividadeArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fa�a um programa que receba o nome do aluno e as 4 notas bimestrais desse aluno,
		//mostre a media e se foi aprovado (>=7) ou reprovado(<7);
		
		Scanner sc = new Scanner(System.in);
		
	  double[] notas = new double[4];
	  System.out.println("Entre com o nome do aluno: ");
	  String nome = sc.nextLine();
	  
	  for(int contador = 0; contador < notas.length; contador++) {
		  System.out.println("Entre com a nota: ");
		  notas[contador] = sc.nextDouble();
		  
		  
	  }
	      double media = (notas[0] + notas[1] + notas[2] + notas[3] / 4);
	      if(media >= 7) {
	    	  
	    	  System.out.printf("%s aprovado com media: %.2f", nome, media);
	      }else {
	    	  System.out.printf("%s reprovado com media: %.2f", nome,media); } 
	      
	      
	      
	    	  
	    	sc.close();
	    	
	      }
	      
	}
	    	  
	      
	      
	      
	    	  
	      
	    	  
	    	  
	    	    
	    	  
	        
	    	    
	    	    
	      
	      
	

		
		
	

	

 
