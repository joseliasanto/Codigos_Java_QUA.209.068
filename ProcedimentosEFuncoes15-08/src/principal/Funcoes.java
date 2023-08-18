package principal;

public class Funcoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Funções representam um processamento ou rocesso;
		 * o que indentifica uma função são os parenteses
		 * System.out.println() é um exemplo de função/ procedimento
		 */
		mostrarMensagem();
		/*String funcaoRecebida = */mostrarMensagemComParametro(30);
		System.out.println(calcular());
		int recebeCalcular = calcular();
		System.out.println("Recebeu:" + recebeCalcular);
		
		System.out.println("Resultado da soma: " + somar(10, 20));

	}
	
	static void mostrarMensagem() {
		System.out.println("Minha primeira função");
		
		
	}
	static void mostrarMensagemComParametro(int idade) {
		System.out.println("Minha idade é: " + idade);
		
	}
	
	static int calcular() {
		int x = 10;
		int y = 5;
		return x + y;
		
		//Retornar dois parametros do tipo  inteiro
		
		static int calcular(int x, int y)
		return x + y;
		
		
		stantic int somar(int 10, int 20);
		
		
		
	}

}
