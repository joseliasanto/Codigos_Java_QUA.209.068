package entities;

public class Funcionario {
	
	private String nome;
	private int idade;
	protected double salario;
	private double bonificacao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getBonificacao() {
		return bonificacao;
	}
	public void obterDados() {
		System.out.println("nome: " + getNome());
		System.out.println("idade: " + getIdade());
		System.out.println("salario: " + (getSalario() + getBonificacao()));
		System.out.println("bonificacao: " + getBonificacao());
		
	}
	
	

}
