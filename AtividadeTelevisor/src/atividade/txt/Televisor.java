package atividade.txt;

public class Televisor {

	//criar um programa para simular um televisor;
		//na classe televisor terão atributos(1.canal, 2.volume, 3.ligado/desligado)
		
		
		public int canal;
		public int volume;
		public boolean ligar;
		
		

		
		public void ligarCanal()  {
			ligar = !!ligar;
			canal = 1;
			
			}
		public void aumentarVolume() {
			if (volume >= 0 && volume <=16)  {
				
				volume+=1;
				
				
			}
		}
		
		public void diminuirVolume()  {
			if (volume >= 0 && canal <= 16) {
				
				canal++;
				
				
			}
		}
		public void aumentarCanal() {
			if (canal == 0) canal =1;
			if (canal >= 1 && canal <= 15) {
				canal += 1;
				
				
			}
		}
		public void diminuirCanal() {
			if (canal == 0) canal =1;
			if (canal >= 1 && canal <= 15) {
				canal -= 1;
				

			}
				
				}
		public void ligarTelevisor()  {
			canal = 1;
			ligar = true;
			
			
		}
		
		public void desligarTelevisor() {
			ligar = false;
			
		}
		
		  {
			
			
		}
		
		public void obterStatus() {
			if (ligar == true) {
				System.out.println("Tv  ligada");
				System.out.println("Canal: " + canal);
				System.out.println("Volume: " + volume);
		}else {
			System.out.println("desligar");
			
			
				
		}	
				
		
		}
}
		
		
		
		
		
		
		
		
		
	
		
		
		
		
	


