package entities.Carro;

import java.util.Scanner;

public class Carro2108 {

	// 1) crie um programa que receba os dados de um carro com os seguintes
	// atributos:
	// modelo, ano, cor, motor, cambio e velocidade e os métodos para aumentar e
	// diminuir a velocidade;
	// use scanner
	
	private String marca;
	private String modelo;
	private int anoFabricacao;
	private String cor;
    private String motor;
	private String cambio;
	private int velocidade;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
		
	public String getModelo() {
		return modelo;
		
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
		
	}
	public int getAno() {
		return anoFabricacao;
		
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
		
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
		
	}
	public String getMotor() {
		return motor;
		
	}
	public void setMotor(String motor) {
		this.motor = motor;
		
	}
	public String getCambio() {
		return cambio;
		
	}
	public void setCambio(String cambio) {
		this.cambio = cambio;
		
	}
	public int getVelocidade() {
		return velocidade;
		
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
		
	}
	
	public void getDadosVeiculos() {
		System.out.printf("nome: %smodelo: %s cor: %s marca: %s tem %d anoFabricacao",   modelo, cor, anoFabricacao);
		
	}
	public void aumentarVelocidade() {
		velocidade += 1;
		
	}
	public void diminuirVelocidade()  {
		velocidade -= 1;
		
	}
	

}
