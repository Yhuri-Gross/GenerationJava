package Heran�a;

public class Cavalo extends Animais {
		boolean correr = true;
		
		public void corrida() {
			if(this.correr == true) {
				System.out.println("Come�ando a correr");
			}else {
				System.out.println("Voc� n�o sabe correr");
			}
		}
}
