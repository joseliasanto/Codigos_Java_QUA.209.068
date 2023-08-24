package entities;

import java.util.Scanner;

public class Program {
	

      public static void main(String[] args) {
    	  Produto produto = new Produto();
    	  
    	  
    	  
    	  
    	  
    	  produto.setNome("Caneta bic");
    	  produto.setPreco(1.99);
    	  produto.adicionarQuantidade(10);
    	  
    	  
    	  produto.mostrarEstoque();
    	  
    	  produto.removerQuantidade(10);
    	  
    	  produto.mostrarEstoque();
    	  
    	  
    	  
      }
	
	
}
