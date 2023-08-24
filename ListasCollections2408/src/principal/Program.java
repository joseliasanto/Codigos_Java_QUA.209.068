package principal;

import java.util.ArrayList;
import java.util.Collections;

public class Program {

	public static void main(String[] args) {
		// Listas trabalham com dados do mesmo tipo
		// Uma lista � um tipo generico de uma colletions
		// Uma lista � uma cole��o de dados

		ArrayList<String> nomes = new ArrayList<>();

		String nome1 = "Adicionado por ultimo";

		nomes.add("Miguel");
		nomes.add("Julia");
		nomes.add("Maria");
		nomes.add("Jos�");
		nomes.add(nome1);

		System.out.println(nomes);
		System.out.println(nomes.get(4));
		nomes.remove(1);

		System.out.println(nomes);

		System.out.println("Imprimindo com forEach: ");
		for (String nome : nomes) {
			System.out.println(nome);
		}

		System.out.println("Imprimindo com for: ");

		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));

		}
		System.out.println("Impriminddo com express�o lambda: ");
		// pesquisem sobre express�o lambda
		nomes.forEach(nome -> System.out.println(nome));

		System.out.println("Imprimindo ordenadamente: ");
		Collections.sort(nomes);

		nomes.forEach(nome -> System.out.println(nome));

	}

}
