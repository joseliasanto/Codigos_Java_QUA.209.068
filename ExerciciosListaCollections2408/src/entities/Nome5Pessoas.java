package entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Nome5Pessoas {
	
	////Fa�a um programa que receba o nome de 5 pessoas e 
	//imprima na ordem alfab�tica (usar o Scanner, n�o precisa de classe);
	

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		
		
		ArrayList<String> nomes = new ArrayList<>();
		
		System.out.println("Digite o primeiro nome");
		nomes.add(sc.nextLine());
		System.out.println("Digite o segundo nome");
		nomes.add(sc.nextLine());
		System.out.println("Digite o terceiro nome");
		nomes.add(sc.nextLine());
		System.out.println("Digite o quarto nome");
		nomes.add(sc.nextLine());
		System.out.println("Digite o quinto nome");
		nomes.add(sc.nextLine());
		Collections.sort(nomes);
		
		System.out.println(nomes);
		
		//Collections.sort(nomes);
		
		
		System.out.println("Ignorando classe sensitive: ");
		
		Collections.sort(nomes, String.CASE_INSENSITIVE_ORDER);
		nomes.forEach(nome -> System.out.println(nome));
		
		
		
		
		

	}

}
