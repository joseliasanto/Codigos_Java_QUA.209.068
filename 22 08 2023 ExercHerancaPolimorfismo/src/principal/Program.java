package principal;

import entities.Funcionario;
import entities.Gerente;

public class Program {

	public static void main(String[] args) {
		//Crie uma programa que fa�a o cadastro de funcion�rios, 
		//se o funcion�rio tiver um cargo de chefia ele 5% 
		//de bonifica��o sobre o salario bruto.
		//Mostre os dados dos funcion�rios cadastrados, salario bruto, idade,
		//e quando houver, imprima o salario com o valor da bonifica��o descrito;

		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Joao");
		funcionario.setIdade(20);
		funcionario.setSalario(1200.00);
		funcionario.obterDados();
		
		Funcionario gerente = new Gerente();
		
		
		gerente.setNome("Miguel");
		gerente.setIdade(20);
		gerente.setSalario(1200.00);
		gerente.obterDados();

	}

}
