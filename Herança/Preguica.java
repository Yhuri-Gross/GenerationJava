package Herança;

public class Preguica extends Animais {
	boolean escalar = true;
	
	
	public void escalando() {
		if(this.escalar == true) {
			System.out.println("Começando a escalar");
		}else {
			System.out.println("Você não sabe escalar");
		}
	}
}
