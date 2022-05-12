package Herança;

public class Animais {
		String nome;
		int idade;
		String emiteSom;
	
		
		public void falar() {
				System.out.println("Falando..." + this.emiteSom);
		}
		
		
		public void status() {
			System.out.println("Nome do animal: " + this.nome);
			System.out.println("Idade do animal: " + this.idade);
			System.out.println("Emite som: " + this.emiteSom);
		}
			
}
