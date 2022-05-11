package POO.Introdu��o;

public class MoldeAviao {
		
	String modelo;
	int identificacao;
	boolean voando;
	boolean combustivel;
	
	public void voar() {
		if(this.voando == false && this.combustivel == true) {
			System.out.println("Decolando em 3, 2, 1");
		}else if(this.combustivel == false && this.voando == false) {
			System.out.println("Voc� n�o tem combust�vel para voar ");
		}else {
			System.out.println("Voc� j� est� voando");
		}
	}
	
	public void aterrissar() {
		if(this.voando == true) {
		System.out.println("Estamos aterrissando");
		}else {
			System.out.println("Voc� n�o est� voando");
		}
	}
	
	public void reabastecer() {
		if(this.combustivel == false) {
			System.out.println("Conseguimos reabastecer");
		}else {
			System.out.println("O tanque j� estava cheio");
		}
	}
	
	public void status() {
		System.out.println("Modelo do avi�o: " + this.modelo);
		System.out.println("Identifica��o do avi�o: " + this.identificacao);
		System.out.println("O avi�o est� voando: " + this.voando);
		System.out.println("Combust�vel do avi�o: " + this.combustivel);
	}
}
