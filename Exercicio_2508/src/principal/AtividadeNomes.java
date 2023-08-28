package principal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class AtividadeNomes {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		
		for(int contador = 1; contador <= 5; contador++) {
			System.out.println("Digite o nome " + contador);
			String nome = scanner.nextLine();
			nomes.add(nome);
		}
		
		nomes.sort(Comparator.naturalOrder());
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		scanner.close();
	}

}
