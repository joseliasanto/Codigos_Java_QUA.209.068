package principal;

import java.util.Scanner;

public class TreinandoExemploDedaos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		//final double PI = 3.1415;
		//PI = 316657984
		String nome;
		String sobrenome;
		String cor;
		int idade;
		double altura;
		char sexo;
		System.out.println("por favor, digite seu nome:");
		//leitura de dados tipo String (conjunto de caractere);
		nome = leia.nextLine();
		
		System.out.println("Qual o seu sobrenome:");
		sobrenome = leia.nextLine();
		 
		System.out.println("Qual a sua cor:");
		cor = leia.nextLine();
		
		System.out.println("Digite a sua idade:");
		idade = leia.nextInt();
		
		System.out.println("Digite a sua altura:");
		altura = leia.nextDouble();
		
		System.out.println("Qual o sexo(m/f):");
		sexo =leia.next () .charAt(0);
		
		
		System.out.println("O nome digitado foi:" + idade);
		System.out.println("O sobrenome digitado foi:" + sobrenome);
		System.out.println("A cor digitada foi:" + cor);
		System.out.println("A idade digitada foi:" + idade);
		System.out.println("A altura digitada foi:" + altura);
		System.out.println("o sexo digitado foi:" + sexo);
		
		
		
		
		
		
		

	}

}
