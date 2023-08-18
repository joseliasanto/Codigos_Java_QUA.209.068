package atividade02;

import java.util.Scanner;

public class Progama {
	
	
	public static void main(String[] args) {
	
		//Faça um programa que receba o nome e o ano de nascimento e retorne a idade atual do usuário;
		
		Scanner sc = new Scanner(System.in);
        
		Usuario usuario1 = new Usuario();
		System.out.println("Digite seu nome: ");
		usuario1.nome = sc.next();
        
        System.out.println("Digite seu ano de nascimento: ");
        usuario1.anoNascimento = sc.nextInt();
        
        System.out.println(usuario1.obterIdade());
        
        sc.close();
		
	}

}
