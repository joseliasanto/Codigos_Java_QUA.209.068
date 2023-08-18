package principal;

import java.util.Scanner;

public class RevisaoM02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	
	/*
	//2.fazer uma matriz 4x4 para inserir nome e as 4 notas do aluno,
	//não precisa mostrar a media.imprima o nome e as notas.
	*/
	
	String [][] nome = new String[4][5];
	
	      nome[0][0] ="Joselia";
	      nome[0][1] = "10";
	      nome[0][2] = "5,0";
	      nome[0][3] = "7,0";
	      nome[0][4] = "6,5";
	      
	      nome[1][0] ="Juliana";
	      nome[1][1] = "10";
	      nome[1][2] = "8,0";
	      nome[1][3] = "7,0";
	      nome[1][4] = "6,5";
	      
	      nome[2][0] ="Maria";
	      nome[2][1] = "9,5";
	      nome[2][2] = "5,5";
	      nome[2][3] = "7,0";
	      nome[2][4] = "6,5"; 
	      
	      nome[3][0] ="Théo";
	      nome[3][1] = "10";
	      nome[3][2] = "4,0";
	      nome[3][3] = "7,0";
	      nome[3][4] = "6,5";
	      
	      
	
	for (int i =0; i < nome.length; i++) { 
		for (int j = 0; j < nome.length; j++){
			if (j == 0) {
				System.out.println("Digite o " +(i+1) + "Nome do aluno: ");
				nome[i][j] = sc.next();
			}else  {
				System.out.println("Digite a nota" + j + " do "  + (i + 1) + "Aluno: ");
				nome[i][j] = sc.nextLine();
			
			}
				
				
			}
			
			
		}
		for (int i = 0; i < nome.length; i++)  {
			for (int j = 0; j < nome.length; j++)  {
				System.out.print(nome[i][j] + "\t");
				System.out.print("\t");
				
			}
			System.out.println();
		}
	
		
		}
		
		
	}
	


