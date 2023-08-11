package Projeto;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class MathELocale {

	public static void main(String[] args) {
		//atalho para improtar crtr +shift+o
		final Locale ponto = new Locale("en", "us");
		Scanner leia = new Scanner(System.in);
		
		
		double altura = 0;
		double decimal = 10.33333;
		int numero = (int) decimal;
		//potencia
		System.out.println(Math.pow(2,  5));
		//maior numero entre 2 números ou variaveis
		System.out.println(Math.max(2,  10));
		//menor numero entre 2 numeros ou variaveis
		System.out.println(Math.min(2,  10));
		//obter raiz quadrada
		System.out.println(Math.sqrt(16));
		//arredondar numeros
		System.out.println(Matc.round(decimal));
		//numero PI armazenado
		System.out.println(Math.PI);
		
		/*System.out.print(
		
		
		System.out.println("Enre com sua altura");
		altura = leia.useLocale(ponto ) .nextDouble();
		}
	
	/*System.out.println("A altura digitada foi: " + altura);*/
	
	leia.close()

}
