package principal;

import java.util.Scanner;

public class AtividadeFuncao02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
            //2. Fa�a um programa que receba o salario e a quantidade de venda total que o vendedor fez
	        //no mes, e calcule o salario do m�s. H� tamb�m o desconto de 5% de inss e 11% de IRPF
	        //sobre o salario bruto.
           //Se o vendedor possui o total de venda acima de 20 mil no m�s, ele recebe uma bonifica��o
	       //de 5% sobre o valor das vendas
		   //Se o vendedor possui o total de venda entre 15 e 20 mil reais, recebe uma bonifica��o de
		   //3% no valor da venda; Se o vendedor possui o total de venda entre 10 e 15 mil reais, recebe uma bonifica��o de
	      //1% no valor da venda;
		   //Se o valor n�o passar de 10 mil, imprima uma frase motivacional;
		
		//Todos os funcion�rios devem ter o contracheques detalhado, funcion�rios que receberam
		//bonifica��es n�o devem ter descontos sobre a bonifica��o, indicando o m�s de referencia;
		
		System.out.println("Digite o valor do salario:R$ ");
		double valorsalario = sc.nextDouble();
		
		System.out.println("Digite o valor da venda:R$ ");
		
		String  = NomeFuncionario;
		double salarioFuncionario = sc.nextDouble();
		double valorVendas = sc.nextDouble();
		double bonus = 0;
		double IRRF = 0.11;
		double INSS = 0.05;
		
		
		System.out.println("Entre com o nome do funcionario: ");
		NomeFuncionario = sc.nextLine();
		
		System.out.println("Entre com o salario do funcionario");
		salarioFuncionario = sc.nextDouble();
		
		calcularDescontos(salarioFuncionario, INSS, IRRF);
		calcularComissao(valorVendas);
		
		sc.close();
	}
		static double calcularDescontos(double salarioB,double INSS, double IRRF)  {
			return (salarioB * INSS) +(salarioB * IRRF);
			
		}
		static double calcularComissao(double valorVendas) {
			double bonus = 0;
			
			
		
		if(valorVendas > 20.000)  {
			bonus = valorVendas * 0.05;
		} else if (valorVendas > 15.000)  {
			bonus = valorVendas * 0.03;
		}else if (valorVendas > 10.000) {
			bonus = valorVendas * 0.01;
		}else{
			bonus = 0;
		
			
			System.out.println("Vamos vender mais! ");
			System.out.println("valor do bonus �:R$ " + bonus);
			System.out.printf("O valor do IRRF �:R$ %.2f", (valorVendas + bonus) *IRRF);
			System.out.printf("O valor do INSS �:R$ %.2f", (valorSalario + bonus) *INSS);
			
			System.out.println("V� em frente!");
			
			
			
			
			
			
		}
		
		
		
		
		

	}

}
