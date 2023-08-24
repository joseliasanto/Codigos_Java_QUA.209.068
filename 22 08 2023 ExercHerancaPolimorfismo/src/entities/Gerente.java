package entities;

public class Gerente extends Funcionario {
	
	@Override
	public double getBonificacao() {
		return (salario * .05);
		
	}

}
