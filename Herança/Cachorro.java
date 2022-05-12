package Herança;

public class Cachorro extends Animais {
		boolean correr = true;
		
		
		public void corrida() {
			if(this.correr == true) {
				System.out.println("Começando a correr");
			}else {
				System.out.println("Você não sabe correr");
			}
		}
}
