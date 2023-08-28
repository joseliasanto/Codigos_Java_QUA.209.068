package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Produto {
	String nome;
	Integer quantidade;
	float preco;
	
	public Produto(String nome, int quantidade, float preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;		
	}
	
	public String toString() {
		return "nome: " +nome + "\tquantidade: " + quantidade + "\tpreco: "+ preco;
	}
	
}

public class AtividadeProdutos {
	
	public static void main(String[] args) {
		
		List<Produto> produtos = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		for(int contador = 1; contador<= 3; contador++) {
			System.out.println("Digite o nome do produto " + contador);
			String nome = scanner.nextLine();
			
			System.out.println("Digite a quantidade do produto " + contador);
			int quantidade = Integer.parseInt(scanner.nextLine());
			
			System.out.println("Digite o preco do produto " + contador);
			float preco = Float.parseFloat(scanner.nextLine());
			
			produtos.add(new Produto(nome, quantidade, preco));
		}
		
		scanner.close();
		
		System.out.println("ordenado por nome");
		produtos.sort((p1, p2) -> p1.nome.compareTo(p2.nome));
		produtos.forEach(p -> System.out.println(p));
		
		System.out.println("ordenado por quantidade");
		produtos.sort((p1, p2) -> p1.quantidade.compareTo(p2.quantidade));
		produtos.forEach(p -> System.out.println(p));
	}

}
