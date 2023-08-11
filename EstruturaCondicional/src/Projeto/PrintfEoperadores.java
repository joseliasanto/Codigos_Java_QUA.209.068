package Projeto;

public class PrintfEoperadores {

	public static void main(String[] args) {
		
		String nome = "Joselia Santos";
		int idade = 40;
		double altura = 1.83;
		boolean verdadeiro = true;
		boolean falso = false;
	
		//para o tipo char usa %c
		System.out.printf("%s, tem %d, e sua altura é: %.2f",
				nome, idade, altura);
		/*operadores de comparação
		 * > maior que
		 * < menor qe
		 * >= maior ou igual a 
		 * <=menor ou iga a 
		 * != diferente
		 * ==igual
		 
		/*operadores logicos
		* && significa E
		* || significa OU
		*! significa Negação
		*/
		//se == if
		//else == senao
		char opcao = 'S';
		int idade2 = 17;
		
		if(verdadeiro && falso) { 
		System.out.println(10);
		}else {
		System.out.println(20);
			
		}
		
		
	        //um unico if éuma estrutura simples
			//if e else tenho uma estrutura composta
			//if else é uma estrutura encadeada
			//podemos ter estruturas dentro de cada if / if else
		if(opcao == 'S' && idade2 >=18) {
				
		System.out.println("Pode entrar na festa");
			
		}else {
				
			System.out.println("Volta pra casa");
		}	
		
		String diaSemana = "sexta";
		
		if(diaSemana == "Segunda-feira") {
			System.out.println("Segunda-feira");
		}
		else if(diaSemana == "terça-feira") {
			System.out.println("terça-feira");
		}
		else if(diaSemana.equals("sexta")){
			System.out.println("sexta-feira");
		}
		
		else  {
		System.out.println("Não corresponde a um dia da semana!");
		}
			
			int diasSemana = 7;
			
			switch (diasSemana) {
			
			case 1:
				
			System.out.println("Segunda-feira");
			break;
			case 2:
				
			System.out.println("Terça-feira");
			break;
			case 3:
				
			System.out.println("Quarta-feira");
			break;
			case 4:
			
			System.out.println("Quinta-feira");
			break;
			case 5:
						
			System.out.println("Sexta-feira");
			break;
			case 6:
				default:
					System.out.println("não corresponde a um dia da semana");
					break;
					
			}
			
				
			
		}

}
