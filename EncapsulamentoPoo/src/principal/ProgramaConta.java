package principal;

import entities.Carro.Conta;

public class ProgramaConta {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		
		conta.setTitular("Joselia");
		//System.out.println("Nome do titular: " + conta.getTitular());
		conta.setAgencia ("2561-x");
		conta.setNumeroConta (6610);
		//.conta.saldo = 30.00; não funciona mais
		
		conta.depositar(300.00);
		
		conta.obterDadosbancarios();
		
		conta.sacar(500.00);
		
		conta.obterDadosbancarios();
		
		
		
	}

}
