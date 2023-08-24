package principal;

import entities.Funcionario;
import entities.Gerente;

public class Program {

	public static void main(String[] args) {
		//Crie uma programa que faça o cadastro de funcionários, 
		//se o funcionário tiver um cargo de chefia ele 5% 
		//de bonificação sobre o salario bruto.
		//Mostre os dados dos funcionários cadastrados, salario bruto, idade,
		//e quando houver, imprima o salario com o valor da bonificação descrito;

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
